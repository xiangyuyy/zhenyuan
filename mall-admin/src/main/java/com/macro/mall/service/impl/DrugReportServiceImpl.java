package com.macro.mall.service.impl;


import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.util.PageUtil;
import io.jsonwebtoken.lang.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * drugReportService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class DrugReportServiceImpl implements DrugReportService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugReportServiceImpl.class);

    @Autowired
    private CodeitemMapper codeitemMapper;

    @Autowired
    private DrugCountMapper drugCountMapper;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private DrugReportMapper drugReportMapper;

    @Autowired
    private DrugReportMemberMapper drugReportMemberMapper;

    @Autowired
    private CodeItemService codeItemService;

    @Autowired
    private Usra01Mapper usra01Mapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private UmsAdminMapper umsAdminMapper;


    @Override
    public List<Member> getAddDrugReportMemberList(AddReportMemberListParam param) {
        PageUtil.init(param);
        //PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return memberDao.getAddReportMemberList(param);
    }

    @Override
    public List<DrugReportMember> getDrugReportMemberList(DrugReportMemberListParam param) {
        PageUtil.init(param);
        //PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(param.getReportId());
        return drugReportMemberMapper.selectByExample(drugReportMemberExample);
    }

    @Override
    public List<DrugReportMemberListDto> drugReportMemberListToDto(List<DrugReportMember> list) {
        List<DrugReportMemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(y->{
            DrugReportMemberListDto dto =  new DrugReportMemberListDto();
            dto.setId(y.getId());
            dto.setMemberId(y.getMemberId());
            //取member 中的数据 审核后才显示记录中的。
            Member x = memberMapper.selectByPrimaryKey(new Long(y.getMemberId()));
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
            if(usra01 != null){
                dto.setAge(usra01.getA0112());
                dto.setBirthday(usra01.getA0111());
                dto.setMajor(usra01.getA0130());
                Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,usra01.getA0134());
                if (codeitem != null){//最高学历
                    dto.setEducation(codeitem.getCodeitemdesc());
                }
                dto.setIdCard(usra01.getA0177());
                dto.setTitle("待定");
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,usra01.getA0107());
                if (codeitemSex != null){
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getA0192());
                if (organization != null){
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

            dto.setWorkTime(x.getWorkTime());
            dto.setEducationStatus(x.getEducationStatus());
            dto.setTrainStatus(x.getTrainStatus());
            dto.setHealthStatus(x.getHealthStatus());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null){
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,x.getDrugEducationId());
            if (codeitem != null){//药监学历
                dto.setDrugEducation(codeitem.getCodeitemdesc());
            }

            Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }

            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionOneId());
            if (drugPositionOne != null){//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionTwoId());
            if (drugPositionTwo != null){//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionThreeId());
            if (drugPositionThree != null){//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
            }

            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC,x.getDrugOrgId());
            if (drugOrg != null){//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC,x.getDrugTitleId());
            if (drugTitle != null){//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public List<DrugReportMemberListDto> drugChangeReportMemberListToDto(List<DrugReportMember> list) {
        List<DrugReportMemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(x->{
            DrugReportMemberListDto dto =  new DrugReportMemberListDto();
            dto.setId(x.getId());
            dto.setMemberId(x.getMemberId());
            //取记录表中的数据。
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
            if(usra01 != null){
                dto.setAge(usra01.getA0112());
                dto.setBirthday(usra01.getA0111());
                dto.setMajor(usra01.getA0130());
                Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,usra01.getA0134());
                if (codeitem != null){//最高学历
                    dto.setEducation(codeitem.getCodeitemdesc());
                }
                dto.setIdCard(usra01.getA0177());
                dto.setTitle("待定");
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,usra01.getA0107());
                if (codeitemSex != null){
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getA0192());
                if (organization != null){
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

            dto.setWorkTime(x.getWorkTime());
            dto.setEducationStatus(x.getEducationStatus());
            dto.setTrainStatus(x.getTrainStatus());
            dto.setHealthStatus(x.getHealthStatus());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null){
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,x.getDrugEducationId());
            if (codeitem != null){//药监学历
                dto.setDrugEducation(codeitem.getCodeitemdesc());
            }

            Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }

            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionOneId());
            if (drugPositionOne != null){//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionTwoId());
            if (drugPositionTwo != null){//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW,x.getDrugPositionThreeId());
            if (drugPositionThree != null){//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
            }

            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC,x.getDrugOrgId());
            if (drugOrg != null){//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC,x.getDrugTitleId());
            if (drugTitle != null){//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public List<DrugReport> getDrugReportList(DrugReportListParam param) {
        PageUtil.init(param);
        //PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andCheckStatusNotEqualTo(-1);
        if (param.getCheckStatus() != null){
            criteria.andCheckStatusEqualTo(param.getCheckStatus());
        }
        if (!StringUtils.isEmpty(param.getShopId())){
            criteria.andShopIdEqualTo(param.getShopId());
        }
        if (!StringUtils.isEmpty(param.getOperatorId())){
            criteria.andOperatorIdEqualTo(param.getOperatorId());
        }
        if (!StringUtils.isEmpty(param.getReportId())){
            criteria.andIdLike("%" + param.getReportId() + "%");
        }
        if (param.getReportTimeBegin() != null){
            criteria.andReportTimeGreaterThanOrEqualTo(param.getReportTimeBegin());
        }
        if (param.getReportTimeEnd() != null){
            criteria.andReportTimeLessThanOrEqualTo(param.getReportTimeEnd());
        }
        return drugReportMapper.selectByExample(drugReportExample);


    }

    @Override
    public List<DrugReportListDto> drugReportListToDto(List<DrugReport> list) {
        List<DrugReportListDto> result  = new ArrayList<>();
        list.stream().forEach(x->{
            DrugReportListDto dto = new DrugReportListDto();
            dto.setId(x.getId());
            dto.setCheckStatus(x.getCheckStatus());
            dto.setReportTime(x.getReportTime());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getShopId());
            if (organization != null){
                dto.setShopName(organization.getCodeitemdesc());
            }
            UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(new Long(x.getOperatorId()));
            if (umsAdmin != null){
                dto.setOperatorName(umsAdmin.getUsername());
            }
            result.add(dto);
        });

        return null;
    }

    @Override
    public DrugReportListDto getDrugReportDto(String id) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(id);
        if (drugReport == null){
            return  null;
        }
        DrugReportListDto dto = new DrugReportListDto();
        dto.setId(drugReport.getId());
        dto.setCheckStatus(drugReport.getCheckStatus());
        dto.setReportTime(drugReport.getReportTime());
        Organization organization = organizationMapper.selectByPrimaryKey(drugReport.getShopId());
        if (organization != null){
            dto.setShopName(organization.getCodeitemdesc());
        }
        UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(new Long(drugReport.getOperatorId()));
        if (umsAdmin != null){
            dto.setOperatorName(umsAdmin.getUsername());
        }
        return dto;
    }

    @Override
    public List<AddReportMemberListDto> AddDrugReportMemberListToDto(List<Member> list) {
        List<AddReportMemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(x -> {
            AddReportMemberListDto dto = new AddReportMemberListDto();
            dto.setId(x.getId().toString());
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
            if (usra01 != null) {
/*                dto.setAge(usra01.getA0112());
                dto.setBirthday(usra01.getA0111());*/
                dto.setMajor(usra01.getA0130());
                Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, usra01.getA0134());
                if (codeitem != null) {//最高学历
                    dto.setEducation(codeitem.getCodeitemdesc());
                }
                /*                dto.setIdCard(usra01.getA0177());*/
                dto.setTitle("待定");
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
/*                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,usra01.getA0107());
                if (codeitemSex != null){
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }*/
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getA0192());
                if (organization != null) {
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

/*            dto.setWorkTime(x.getWorkTime());
            dto.setEducationStatus(x.getEducationStatus());
            dto.setTrainStatus(x.getTrainStatus());
            dto.setHealthStatus(x.getHealthStatus());*/
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null) {
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

       /*     Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,x.getDrugEducationId());
            if (codeitem != null){//药监学历
                dto.setDrugEducation(codeitem.getCodeitemdesc());
            }

            Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }
*/
            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionOneId());
            if (drugPositionOne != null) {//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionTwoId());
            if (drugPositionTwo != null) {//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
            if (drugPositionThree != null) {//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
            }

            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC, x.getDrugOrgId());
            if (drugOrg != null) {//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC, x.getDrugTitleId());
            if (drugTitle != null) {//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public int addDrugReportMember(String reportId, String shopId, List<String> memberIds, String operatorId, Date reportTime) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        if (drugReport == null) {
            drugReport = new DrugReport();
            drugReport.setId(reportId);
            drugReport.setCheckStatus(-1);
            drugReport.setOperatorId(operatorId);
            drugReport.setReportTime(reportTime);
            int i = drugReportMapper.insertSelective(drugReport);
            if (i == 0) {
                return -1;
            }
        }
        for (String x : memberIds) {
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
            criteria.andReportIdEqualTo(reportId);
            criteria.andMemberIdEqualTo(x);
            List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
            if (list.size() == 0) {
                Member member = memberMapper.selectByPrimaryKey(new Long(x));
                if (member != null) {
                    DrugReportMember drugReportMember = new DrugReportMember();
/*                    drugReportMember.setDrugEducationId(member.getDrugEducationId());
                    drugReportMember.setDrugMajorId(member.getDrugMajorId());
                    drugReportMember.setDrugOrgId(member.getDrugOrgId());
                    drugReportMember.setDrugPositionOneId(member.getDrugPositionOneId());
                    drugReportMember.setDrugPositionTwoId(member.getDrugPositionTwoId());
                    drugReportMember.setDrugPositionThreeId(member.getDrugPositionThreeId());
                    drugReportMember.setDrugShopId(member.getDrugShopId());
                    drugReportMember.setDrugTitleId(member.getDrugTitleId());
                    drugReportMember.setEducationStatus(member.getEducationStatus());
                    drugReportMember.setHealthStatus(member.getHealthStatus());
                    drugReportMember.setTrainStatus(member.getTrainStatus());*/
                    drugReportMember.setMemberId(x);
                    drugReportMember.setRelationId(member.getRelationId());
         /*           drugReportMember.setWorkTime(member.getWorkTime());*/
                    drugReportMember.setReportId(reportId);
                    drugReportMemberMapper.insertSelective(drugReportMember);
                }
            } else {
                return 0;//重复插入
            }
        }
        return 1;
    }

    @Override
    public int deleteDrugReportMember(String id) {
        return drugReportMemberMapper.deleteByPrimaryKey(new Long(id));
    }

    @Override
    public Boolean deleteAllDrugReportMember(String reportId) {
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
        if (list.size() > 0) {
            list.stream().forEach(x -> {
                drugReportMemberMapper.deleteByPrimaryKey(new Long(x.getId()));
            });
        }
        return true;
    }

    @Override
    public int sureDrugReport(String reportId, Date reportTime, String operatorId) {
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
        if (list.size() == 0) {
            return -1; //没有内容不能确认
        }
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        drugReport.setReportTime(reportTime);
        drugReport.setOperatorId(operatorId);
        drugReport.setCheckStatus(0);
        return drugReportMapper.updateByPrimaryKeySelective(drugReport);
    }

    @Override
    public int passDrugReport(String reportId) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        drugReport.setCheckStatus(1);
        drugReportMapper.updateByPrimaryKeySelective(drugReport);
        //保存记录
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list =  drugReportMemberMapper.selectByExample(drugReportMemberExample);
        list.stream().forEach(x->{
            Member member = memberMapper.selectByPrimaryKey(new Long(x.getMemberId()));
            if (member != null) {
                x.setDrugEducationId(member.getDrugEducationId());
                x.setDrugMajorId(member.getDrugMajorId());
                x.setDrugOrgId(member.getDrugOrgId());
                x.setDrugPositionOneId(member.getDrugPositionOneId());
                x.setDrugPositionTwoId(member.getDrugPositionTwoId());
                x.setDrugPositionThreeId(member.getDrugPositionThreeId());
                x.setDrugShopId(member.getDrugShopId());
                x.setDrugTitleId(member.getDrugTitleId());
                x.setEducationStatus(member.getEducationStatus());
                x.setHealthStatus(member.getHealthStatus());
                x.setTrainStatus(member.getTrainStatus());
                x.setMemberId(x.getMemberId());
                x.setRelationId(member.getRelationId());
                x.setWorkTime(member.getWorkTime());
                x.setReportId(reportId);
                drugReportMemberMapper.updateByPrimaryKeySelective(x);
            }
        });
        return 1;
    }

    @Override
    public DrugCount getDrugCountByShopId(String shopId) {
        return drugCountMapper.selectByPrimaryKey(shopId);
    }

    @Override
    public int addOrUpdateDrugCount(DrugCount drugCount) {
        DrugCount result = drugCountMapper.selectByPrimaryKey(drugCount.getShopId());
        if (result == null) {
            return drugCountMapper.insertSelective(drugCount);
        }
        return drugCountMapper.updateByPrimaryKeySelective(drugCount);
    }

    @Override
    public Boolean isCanAddReport(String shopId) {
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        criteria.andCheckStatusEqualTo(-1);//待确认的
        List<DrugReport> list = drugReportMapper.selectByExample(drugReportExample);
        if (list.size() > 0) {
            return false;
        }
        return true;
    }
}
