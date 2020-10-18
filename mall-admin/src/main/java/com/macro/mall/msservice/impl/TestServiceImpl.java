package com.macro.mall.msservice.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.msdao.TestDao;
import com.macro.mall.msmodel.Test;
import com.macro.mall.msmodel.TestExample;
import com.macro.mall.msservice.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class TestServiceImpl implements TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private TestDao testMapper;

    @Override
    public List<Test> list(String keyword, Integer pageSize, Integer pageNum) {
        //PageHelper.startPage(pageNum, pageSize);
        TestExample example = new TestExample();
        TestExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
            //example.or(example.createCriteria().andNickNameLike("%" + keyword + "%"));
        }
        return testMapper.selectByExample(example);
    }
}
