package com.macro.mall.service.impl;

import com.macro.mall.model.*;
import com.macro.mall.mapper.*;
import com.macro.mall.msdao.ZYYjjgMapper;
import com.macro.mall.msdao.ZYYjyqMapper;
import com.macro.mall.msservice.ZYService;
import com.macro.mall.service.NZYService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private ZYService zyService;

    @Autowired
    private DrugCountMapper drugCountMapper;

    @Autowired
    private ZYYjjgMapper yjjgMapper;

    @Autowired
    private ZYYjyqMapper yjyqMapper;


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
            list.parallelStream().forEach(x -> codeitemMapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllCodeItem" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllOrganization(List<Organization> list) {
        try {
            list.parallelStream().forEach(x -> organizationMapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllOrganization" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra01(List<Usra01> list) {
        try {
            list.parallelStream().forEach(x -> usra01Mapper.insertSelective(x));
            list.parallelStream().forEach(x -> {
                Member member = new Member();
                member.setRelationId(x.getA0100());
                memberMapper.insertSelective(member);
            });
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra01" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra04(List<Usra04> list) {
        try {
            list.parallelStream().forEach(x -> usra04Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra04" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra22(List<Usra22> list) {
        try {
            list.parallelStream().forEach(x -> usra22Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra22" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertAllUsra64(List<Usra64> list) {
        try {
            list.parallelStream().forEach(x -> usra64Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra64" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertAllUsra65(List<Usra65> list) {
        try {
            list.parallelStream().forEach(x -> usra65Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("usra65Mapper" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra66(List<Usra66> list) {
        try {
            list.parallelStream().forEach(x -> usra66Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra66" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllUsra71(List<Usra71> list) {
        try {
            list.parallelStream().forEach(x -> usra71Mapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllUsra71" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean insertAllVZhicheng(List<VZhicheng> list) {
        try {
            list.parallelStream().forEach(x -> vZhichengMapper.insertSelective(x));
        } catch (Exception ex) {
            LOGGER.error("insertAllVZhicheng" + ex.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Boolean updateOrganization(List<Organization> list) {
        list.parallelStream().forEach(x -> {
            Organization organization = organizationMapper.selectByPrimaryKey(x.getCodeitemid());
            if (organization == null) {
                organizationMapper.insertSelective(x);
            } else {
                organizationMapper.updateByPrimaryKeySelective(x);
            }

        });
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra01(List<Usra01> list) {
        list.parallelStream().forEach(x -> {
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getA0100());
            if (usra01 == null) {
                Member member = new Member();
                member.setRelationId(x.getA0100());
                usra01Mapper.insertSelective(x);
                memberMapper.insertSelective(member);
            } else {
                usra01Mapper.updateByPrimaryKeySelective(x);
            }

        });
        return true;

    }

    @Transactional
    @Override
    public Boolean updateUsra04(List<Usra04> list) {
        usra04Mapper.deleteByExample(new Usra04Example());
        insertAllUsra04(list);

/*        list.parallelStream().forEach(x->{
            Usra04Example usra04Example = new Usra04Example();
            Usra04Example.Criteria criteria = usra04Example.createCriteria();
            criteria.andA0100EqualTo(x.getA0100());
            criteria.andA0449EqualTo(x.getA0449());
            criteria.andA0405EqualTo(x.getA0405());
            criteria.andA0444EqualTo(x.getA0444());
            criteria.andA0435EqualTo(x.getA0435());

            List<Usra04> result = usra04Mapper.selectByExample(usra04Example);
            if (result.size() == 0 ){
                usra04Mapper.insertSelective(x);
            }
            else {
                usra04Mapper.updateByExampleSelective(x,usra04Example);
            }
        });*/
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra22(List<Usra22> list) {
        usra22Mapper.deleteByExample(new Usra22Example());
        insertAllUsra22(list);
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra64(List<Usra64> list) {
        usra64Mapper.deleteByExample(new Usra64Example());
        insertAllUsra64(list);
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra65(List<Usra65> list) {
        usra65Mapper.deleteByExample(new Usra65Example());
        insertAllUsra65(list);
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra66(List<Usra66> list) {
        usra66Mapper.deleteByExample(new Usra66Example());
        insertAllUsra66(list);
        return true;
    }

    @Transactional
    @Override
    public Boolean updateUsra71(List<Usra71> list) {
        usra71Mapper.deleteByExample(new Usra71Example());
        insertAllUsra71(list);
        return true;
    }

    @Transactional
    @Override
    public Boolean updateVZhicheng(List<VZhicheng> list) {
        vZhichengMapper.deleteByExample(new VZhichengExample());
        insertAllVZhicheng(list);
        return true;
    }

    @Override
    public Boolean updataALL() {
        try {
            updateOrganization(zyService.getUpdateOrganization());
            updateUsra01(zyService.getUpdateUsra01());
            updateUsra04(zyService.getAllUsra04());
            updateUsra22(zyService.getAllUsra22());
            updateUsra64(zyService.getAllUsra64());
            updateUsra65(zyService.getAllUsra65());
            updateUsra66(zyService.getAllUsra66());
            updateUsra71(zyService.getAllUsra71());
            updateVZhicheng(zyService.getAllVZhicheng());
        } catch (Exception ex) {
            LOGGER.error("updataALL" + ex.getMessage() + ex.getStackTrace());
            return false;
        }
        return true;
    }

    @Override
    public Boolean updataMore() {
        List<String> list = zyService.getUpdateUsra01().stream().map(Usra01::getA0100).collect(Collectors.toList());
        System.out.printf("list-----" + list.size());
        Usra01Example usra01Example = new Usra01Example();
        Usra01Example.Criteria criteria1 = usra01Example.createCriteria();
        criteria1.andA0100NotIn(list);
        usra01Mapper.deleteByExample(usra01Example);

        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andRelationIdNotIn(list);
        memberMapper.deleteByExample(memberExample);
        return false;
    }


    @Override
    public Boolean inintALL() {
        try {
            insertAllOrganization(zyService.getInintOrganization());
            insertAllUsra01(zyService.getInintUsra01());

            //2021 -2-25 特殊处理
            //insertAllCodeItem(zyService.getAllCodeItem());

            insertDrugCount();

            updateUsra04(zyService.getAllUsra04());
            updateUsra22(zyService.getAllUsra22());
            updateUsra64(zyService.getAllUsra64());
            updateUsra65(zyService.getAllUsra65());
            updateUsra66(zyService.getAllUsra66());
            updateUsra71(zyService.getAllUsra71());
            updateVZhicheng(zyService.getAllVZhicheng());
        } catch (Exception ex) {
            LOGGER.error("inintALL" + ex.getMessage() + ex.getStackTrace());
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertDrugCount(){
        YjjgExample yjjgExample = new YjjgExample();
        List<Yjjg> list = yjjgMapper.selectByExample(yjjgExample);
        list.stream().forEach(x->{
            DrugCount record = new DrugCount();
            record.setShopId(x.getJgbm());
            record.setMechanic(x.getJg());
            record.setPraPharmacist(x.getZyys());
            record.setPraChinesePharmacist(x.getZyzys());
            record.setPharmacist(x.getYs());

            YjyqExample yjyqExample = new YjyqExample();
            yjyqExample.createCriteria().andJgbmEqualTo(x.getJgbm()).andYcsfIsNotNull();
            List<Yjyq> listyq = yjyqMapper.selectByExample(yjyqExample);
            if (listyq.size() >  0 ){
                Yjyq yjyq = listyq.get(0);
                if (yjyq.getYcsf().contains("开通")){
                    record.setLongRange(1);
                }
                else {
                    record.setLongRange(0);
                }

                if (yjyq.getYwzy().contains("有")){
                    record.setChineseMedicine(1);
                }
                else {
                    record.setChineseMedicine(0);
                }

                if (yjyq.getLsgx().contains("市区")){
                    record.setSubjection(1);
                }
                else if(yjyq.getLsgx().contains("乡镇")){
                    record.setSubjection(2);
                }
                else {
                    record.setSubjection(3);
                }
                record.setArea(yjyq.getMdmj());
                drugCountMapper.insertSelective(record);
            }
        });
        return true;
    }
}
