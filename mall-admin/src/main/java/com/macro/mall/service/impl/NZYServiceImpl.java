package com.macro.mall.service.impl;

import com.macro.mall.model.*;
import com.macro.mall.mapper.*;
import com.macro.mall.service.NZYService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * NZYService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class NZYServiceImpl implements NZYService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NZYServiceImpl.class);

    @Autowired
    private CodeitemMapper codeitemMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private Usra01Mapper usra01Mapper;

    @Autowired
    private Usra04Mapper usra04Mapper;

    @Autowired
    private Usra22Mapper usra22Mapper;

    @Autowired
    private Usra64Mapper usra64Mapper;

    @Autowired
    private Usra65Mapper usra65Mapper;

    @Autowired
    private Usra66Mapper usra66Mapper;

    @Autowired
    private Usra71Mapper usra71Mapper;

    @Autowired
    private VZhichengMapper vZhichengMapper;

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Codeitem> getAllCodeItem() {
        CodeitemExample example = new CodeitemExample();
        return codeitemMapper.selectByExample(example);
    }

    @Override
    public List<Organization> getAllOrganization() {
        OrganizationExample example = new OrganizationExample();
        return organizationMapper.selectByExample(example);
    }

    @Override
    public List<Usra01> getAllUsra01() {
        Usra01Example example = new Usra01Example();
        return usra01Mapper.selectByExample(example);
    }

    @Override
    public List<Usra04> getAllUsra04() {
        Usra04Example example = new Usra04Example();
        return usra04Mapper.selectByExample(example);
    }

    @Override
    public List<Usra22> getAllUsra22() {
        Usra22Example example = new Usra22Example();
        return usra22Mapper.selectByExample(example);
    }

    @Override
    public List<Usra64> getAllUsra64() {
        Usra64Example example = new Usra64Example();
        return usra64Mapper.selectByExample(example);
    }

    @Override
    public List<Usra65> getAllUsra65() {
        Usra65Example example = new Usra65Example();
        return usra65Mapper.selectByExample(example);
    }

    @Override
    public List<Usra66> getAllUsra66() {
        Usra66Example example = new Usra66Example();
        return usra66Mapper.selectByExample(example);
    }

    @Override
    public List<Usra71> getAllUsra71() {
        Usra71Example example = new Usra71Example();
        return usra71Mapper.selectByExample(example);
    }

    @Override
    public List<VZhicheng> getAllVZhicheng() {
        VZhichengExample example = new VZhichengExample();
        return vZhichengMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public Boolean insertAllCodeItem(List<Codeitem> list) {
        try {
            list.parallelStream().forEach(x->codeitemMapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllCodeItem" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllOrganization(List<Organization> list) {
        try {
            list.parallelStream().forEach(x->organizationMapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllOrganization" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra01(List<Usra01> list) {
        try {
            list.parallelStream().forEach(x->usra01Mapper.insertSelective(x));
            list.parallelStream().forEach(x->{
               Member member = new Member();
               member.setRelationId(x.getA0100());
               memberMapper.insertSelective(member);
            });
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra01" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra04(List<Usra04> list) {
        try {
            list.parallelStream().forEach(x->usra04Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra04" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra22(List<Usra22> list) {
        try {
            list.parallelStream().forEach(x->usra22Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra22" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertAllUsra64(List<Usra64> list) {
        try {
            list.parallelStream().forEach(x->usra64Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra64" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertAllUsra65(List<Usra65> list) {
        try {
            list.parallelStream().forEach(x->usra65Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("usra65Mapper" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra66(List<Usra66> list) {
        try {
            list.parallelStream().forEach(x->usra66Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra66" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra71(List<Usra71> list) {
        try {
            list.parallelStream().forEach(x->usra71Mapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllUsra71" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllVZhicheng(List<VZhicheng> list) {
        try {
            list.parallelStream().forEach(x->vZhichengMapper.insertSelective(x));
        }
        catch (Exception ex){
            LOGGER.error("insertAllVZhicheng" + ex.getMessage());
            return false;
        }
        return true;
    }
}
