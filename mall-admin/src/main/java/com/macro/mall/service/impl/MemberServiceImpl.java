package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.mapper.MemberMapper;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberExample;
import com.macro.mall.model.UmsAdminExample;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.PageUtil;
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
public class MemberServiceImpl implements MemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);
    @Autowired
    private MemberDao memberDao;

    @Override
    public List<Member> getMemberList(MemberListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return memberDao.getMemberList(param);
    }
}
