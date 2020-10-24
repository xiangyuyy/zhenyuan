package com.macro.mall.service.impl;


import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.mapper.CodeitemMapper;
import com.macro.mall.mapper.MemberMapper;
import com.macro.mall.model.Codeitem;
import com.macro.mall.model.CodeitemExample;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberExample;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * codeitemService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class CodeItemServiceImpl implements CodeItemService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CodeItemServiceImpl.class);

    @Autowired
    private CodeitemMapper codeitemMapper;


    @Override
    public List<Codeitem> getCodeitemBySetId(String codesetid) {
        CodeitemExample codeitemExample = new CodeitemExample();
        codeitemExample.createCriteria().andCodesetidEqualTo(codesetid);
        return codeitemMapper.selectByExample(codeitemExample);
    }

    @Override
    public List<Codeitem> getAllCodeitem() {
        CodeitemExample codeitemExample = new CodeitemExample();
        return codeitemMapper.selectByExample(codeitemExample);
    }

    @Override
    public Codeitem getOneCodeitem(String codesetid, String codeitemid) {
        CodeitemExample codeitemExample = new CodeitemExample();
        codeitemExample.createCriteria().andCodesetidEqualTo(codesetid);
        codeitemExample.createCriteria().andCodeitemidEqualTo(codeitemid);
        List<Codeitem> list = codeitemMapper.selectByExample(codeitemExample);
        if (list.size() >=1){
            return list.get(0);
        }
        return null;
    }
}
