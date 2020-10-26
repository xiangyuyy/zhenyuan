package com.macro.mall.msservice.impl;

import com.macro.mall.model.*;
import com.macro.mall.msdao.*;
import com.macro.mall.msservice.ZYService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * ZYService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class ZYServiceImpl implements ZYService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZYServiceImpl.class);

    @Autowired
    private ZYCodeitemMapper ZYCodeitemMapper;

    @Autowired
    private ZYOrganizationMapper organizationMapper;

    @Autowired
    private ZYUsra01Mapper ZYUsra01Mapper;

    @Autowired
    private ZYUsra04Mapper ZYUsra04Mapper;

    @Autowired
    private ZYUsra22Mapper usra22Mapper;

    @Autowired
    private ZYUsra64Mapper ZYUsra64Mapper;

    @Autowired
    private ZYUsra65Mapper usra65Mapper;

    @Autowired
    private ZYUsra66Mapper ZYUsra66Mapper;

    @Autowired
    private ZYUsra71Mapper ZYUsra71Mapper;

    @Override
    public List<Codeitem> getAllCodeItem() {
        CodeitemExample example = new CodeitemExample();
        return ZYCodeitemMapper.selectByExample(example);
    }

    @Override
    public List<Organization> getInintOrganization() {
        return organizationMapper.getInintOrganization();
    }

    @Override
    public List<Organization> getAllOrganization() {
        OrganizationExample example = new OrganizationExample();
        return organizationMapper.selectByExample(example);
    }

    @Override
    public List<Usra01> getAllUsra01() {
        Usra01Example example = new Usra01Example();
        return ZYUsra01Mapper.selectByExample(example);
    }

    public List<Usra01> getInintUsra01() {
        Usra01Example example = new Usra01Example();
        example.createCriteria().andB0110EqualTo("10208");
        return ZYUsra01Mapper.selectByExample(example);
    }

    @Override
    public List<Usra04> getAllUsra04() {
        Usra04Example example = new Usra04Example();
        return ZYUsra04Mapper.selectByExample(example);
    }

    @Override
    public List<Usra22> getAllUsra22() {
        Usra22Example example = new Usra22Example();
        return usra22Mapper.selectByExample(example);
    }

    @Override
    public List<Usra64> getAllUsra64() {
        Usra64Example example = new Usra64Example();
        return ZYUsra64Mapper.selectByExample(example);
    }

    @Override
    public List<Usra65> getAllUsra65() {
        Usra65Example example = new Usra65Example();
        return usra65Mapper.selectByExample(example);
    }

    @Override
    public List<Usra66> getAllUsra66() {
        Usra66Example example = new Usra66Example();
        return ZYUsra66Mapper.selectByExample(example);
    }

    @Override
    public List<Usra71> getAllUsra71() {
        Usra71Example example = new Usra71Example();
        return ZYUsra71Mapper.selectByExample(example);
    }
}
