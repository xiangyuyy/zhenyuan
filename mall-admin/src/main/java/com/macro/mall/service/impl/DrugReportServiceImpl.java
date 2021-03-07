package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.bo.AdminUserDetails;
import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.PageUtil;
import io.jsonwebtoken.lang.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    private Usra04Mapper usra04Mapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRecordMapper memberRecordMapper;


    @Override
    public List<Member> getAddDrugReportMemberList(AddReportMemberListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return memberDao.getAddReportMemberList(param);
    }

    @Override
    public List<DrugReportMember> getDrugReportMemberList(DrugReportMemberListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(param.getReportId());
        drugReportMemberExample.setOrderByClause("sort asc,id desc");
        return drugReportMemberMapper.selectByExample(drugReportMemberExample);
    }

    @Override
    public List<DrugReportMember> getShopDrugReportMemberList(ShopDrugReportMemberListParam param) {
        List<DrugReport> list1 = new ArrayList<>();
        if (!StringUtils.isEmpty(param.getShopId())) {

            DrugReportExample drugReportExample = new DrugReportExample();
            DrugReportExample.Criteria criteria1 = drugReportExample.createCriteria();
            criteria1.andShopIdEqualTo(param.getShopId());
            criteria1.andCheckStatusEqualTo(1);//等于已审核的
            list1 = drugReportMapper.selectByExample(drugReportExample);
        }
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();

        if (!StringUtils.isEmpty(param.getShopId())) {
            List<String> listStr = list1.stream().map(DrugReport::getId).collect(Collectors.toList());
            if (listStr.size() > 0) {
                criteria.andReportShopIdEqualTo(param.getShopId());
                criteria.andReportIdIn(listStr);
            } else {
                criteria.andReportShopIdEqualTo("");
            }
            drugReportMemberExample.setOrderByClause("sort asc,id desc");
            return drugReportMemberMapper.selectByExample(drugReportMemberExample);
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<DrugReportMemberListDto> drugReportMemberListToDto(List<DrugReportMember> list) {
        List<DrugReportMemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(y -> {
            DrugReportMemberListDto dto = new DrugReportMemberListDto();
            dto.setId(y.getId());
            dto.setMemberId(y.getMemberId());
            //取member 中的数据 审核后才显示记录中的。
            Member x = memberMapper.selectByPrimaryKey(new Long(y.getMemberId()));
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
            if (usra01 != null) {
                // 药监学校
                dto.setDrugSchool(x.getDrugSchool());

                dto.setAge(usra01.getA0112());
                dto.setBirthday(DateUtil.getFormateDate(usra01.getA0111()));
                dto.setMajor(usra01.getA0130());
                Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, usra01.getA0134());
                if (codeitem != null) {//最高学历
                    dto.setEducation(codeitem.getCodeitemdesc());
                }
                dto.setIdCard(usra01.getA0177());
                //dto.setTitle("待定");
                List<VZhicheng> vZhichengList = memberService.getMemberVZhichengr(usra01.getA0144());
                String title = "";
                for (VZhicheng v : vZhichengList) {
                    title += v.getZcjb();
                    if (v.getZcsj() != null) {
                        title += "(" + DateUtil.getFormatString(v.getZcsj()) + ")" + " ";
                    }
                }
                dto.setTitle(title);
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX, usra01.getA0107());
                if (codeitemSex != null) {
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getE0122());
                if (organization != null) {
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

            dto.setWorkTime(DateUtil.getFormateDate(DateUtil.getFormateDate(x.getWorkTime())));
            dto.setEducationStatus(x.getEducationStatus());
            dto.setTrainStatus(x.getTrainStatus());
            dto.setHealthStatus(x.getHealthStatus());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null) {
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, x.getDrugEducationId());
            if (codeitem != null) {//药监学历
                dto.setDrugEducation(codeitem.getCodeitemdesc());
            }

            //待确认

           /*      Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }
*/
            dto.setDrugMajor(x.getDrugMajorId());

            String drugPositionAll = "";
            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionOneId());
            if (drugPositionOne != null) {//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
                drugPositionAll += drugPositionOne.getCodeitemdesc();
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionTwoId());
            if (drugPositionTwo != null) {//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionTwo.getCodeitemdesc();
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
            if (drugPositionThree != null) {//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionThree.getCodeitemdesc();
            }
            dto.setDrugPositionAll(drugPositionAll);


            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC, x.getDrugOrgId());
            if (drugOrg != null) {//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC, x.getDrugTitleId());
            if (drugTitle != null) {//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            //虚挂
            if (!StringUtils.isEmpty(x.getDrugShopId()) && !x.getDrugShopId().equals(usra01.getE0122())) {
                dto.setIsInvitual("是");
            } else {
                dto.setIsInvitual("否");
            }
            //序号
            dto.setSort(y.getSort());
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public List<DrugReportMemberListDto> drugChangeReportMemberListToDto(List<DrugReportMember> list) {
        List<DrugReportMemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(x -> {
            DrugReportMemberListDto dto = new DrugReportMemberListDto();
            dto.setId(x.getId());
            dto.setMemberId(x.getMemberId());
            //取记录表中的数据。
            Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
            if (usra01 != null) {
                dto.setAge(usra01.getA0112());
                dto.setBirthday(DateUtil.getFormateDate(usra01.getA0111()));
                dto.setMajor(usra01.getA0130());
                Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, usra01.getA0134());
                if (codeitem != null) {//最高学历
                    dto.setEducation(codeitem.getCodeitemdesc());
                }
                dto.setIdCard(usra01.getA0177());
                //dto.setTitle("待定");
                List<VZhicheng> vZhichengList = memberService.getMemberVZhichengr(usra01.getA0144());
                String title = "";
                for (VZhicheng v : vZhichengList) {
                    title += v.getZcjb();
                    if (v.getZcsj() != null) {
                        title += "(" + DateUtil.getFormatString(v.getZcsj()) + ")" + " ";
                    }
                }
                dto.setTitle(title);
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX, usra01.getA0107());
                if (codeitemSex != null) {
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getE0122());
                if (organization != null) {
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

            dto.setWorkTime(DateUtil.getFormateDate(x.getWorkTime()));
            dto.setEducationStatus(x.getEducationStatus());
            dto.setTrainStatus(x.getTrainStatus());
            dto.setHealthStatus(x.getHealthStatus());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null) {
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, x.getDrugEducationId());
            if (codeitem != null) {//药监学历
                dto.setDrugEducation(codeitem.getCodeitemdesc());
            }

            //待确认

      /*      Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }
*/
            dto.setDrugMajor(x.getDrugMajorId());

            String drugPositionAll = "";
            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionOneId());
            if (drugPositionOne != null) {//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
                drugPositionAll += drugPositionOne.getCodeitemdesc();
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionTwoId());
            if (drugPositionTwo != null) {//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionTwo.getCodeitemdesc();
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
            if (drugPositionThree != null) {//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionThree.getCodeitemdesc();
            }
            dto.setDrugPositionAll(drugPositionAll);


            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC, x.getDrugOrgId());
            if (drugOrg != null) {//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC, x.getDrugTitleId());
            if (drugTitle != null) {//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            //虚挂
            if (!StringUtils.isEmpty(x.getDrugShopId()) && !x.getDrugShopId().equals(usra01.getE0122())) {
                dto.setIsInvitual("是");
            } else {
                dto.setIsInvitual("否");
            }
            //序号
            dto.setSort(x.getSort());
            dto.setReportId(x.getReportId());

            // 药监学校
            dto.setDrugSchool(x.getDrugSchool());

            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public List<DrugReport> getDrugReportList(DrugReportListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andCheckStatusNotEqualTo(-1);
        if (param.getCheckStatus() != null) {
            criteria.andCheckStatusEqualTo(param.getCheckStatus());
        }
        if (param.getShopIds() != null && param.getShopIds().size() > 0) {
            criteria.andShopIdIn(param.getShopIds());
        }
        if (!StringUtils.isEmpty(param.getOperatorId())) {
            criteria.andOperatorIdEqualTo(param.getOperatorId());
        }
        if (!StringUtils.isEmpty(param.getReportId())) {
            criteria.andIdLike("%" + param.getReportId() + "%");
        }
        if (param.getReportTimeBegin() != null) {
            param.setReportTimeBegin(DateUtil.getDateAddOneDay(param.getReportTimeBegin()));
            criteria.andReportTimeGreaterThanOrEqualTo(param.getReportTimeBegin());
        }
        if (param.getReportTimeEnd() != null) {
            param.setReportTimeEnd(DateUtil.getDateAddOneDay(param.getReportTimeEnd()));
            criteria.andReportTimeLessThanOrEqualTo(param.getReportTimeEnd());
        }
        drugReportExample.setOrderByClause("modify_time desc");
        return drugReportMapper.selectByExample(drugReportExample);


    }

    @Override
    public List<DrugReportListDto> drugReportListToDto(List<DrugReport> list) {
        List<DrugReportListDto> result = new ArrayList<>();
        list.stream().forEach(x -> {
            DrugReportListDto dto = new DrugReportListDto();
            dto.setId(x.getId());
            dto.setCheckStatus(x.getCheckStatus());
            dto.setShopId(x.getShopId());
            dto.setReportTime(x.getReportTime());
            Organization organization = organizationMapper.selectByPrimaryKey(x.getShopId());
            if (organization != null) {
                dto.setShopName(organization.getCodeitemdesc());
            }
            UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(new Long(x.getOperatorId()));
            if (umsAdmin != null) {
                dto.setOperatorName(umsAdmin.getUsername());
            }
            result.add(dto);
        });

        return result;
    }

    @Override
    public DrugReportListDto getDrugReportDto(String id) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(id);
        if (drugReport == null) {
            return null;
        }
        DrugReportListDto dto = new DrugReportListDto();
        dto.setId(drugReport.getId());
        dto.setShopId(drugReport.getShopId());
        dto.setCheckStatus(drugReport.getCheckStatus());
        dto.setReportTime(drugReport.getReportTime());
        Organization organization = organizationMapper.selectByPrimaryKey(drugReport.getShopId());
        if (organization != null) {
            dto.setShopName(organization.getCodeitemdesc());
        }
        if (!StringUtils.isEmpty(drugReport.getOperatorId())) {
            UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(new Long(drugReport.getOperatorId()));
            if (umsAdmin != null) {
                dto.setOperatorName(umsAdmin.getUsername());
            }
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
                //dto.setTitle("待定");
                List<VZhicheng> vZhichengList = memberService.getMemberVZhichengr(usra01.getA0144());
                String title = "";
                for (VZhicheng v : vZhichengList) {
                    title += v.getZcjb();
                    if (v.getZcsj() != null) {
                        title += "(" + DateUtil.getFormatString(v.getZcsj()) + ")" + " ";
                    }
                }
                dto.setTitle(title);
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
/*                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,usra01.getA0107());
                if (codeitemSex != null){
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }*/
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getE0122());
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
            String drugPositionAll = "";
            Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionOneId());
            if (drugPositionOne != null) {//岗位1
                dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
                drugPositionAll += drugPositionOne.getCodeitemdesc();
            }
            Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionTwoId());
            if (drugPositionTwo != null) {//岗位2
                dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionTwo.getCodeitemdesc();
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
            if (drugPositionThree != null) {//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
                drugPositionAll += "兼" + drugPositionThree.getCodeitemdesc();
            }
            dto.setDrugPositionAll(drugPositionAll);


            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC, x.getDrugOrgId());
            if (drugOrg != null) {//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC, x.getDrugTitleId());
            if (drugTitle != null) {//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            //虚挂
            if (!StringUtils.isEmpty(x.getDrugShopId()) && !x.getDrugShopId().equals(usra01.getE0122())) {
                dto.setIsInvitual("是");
            } else {
                dto.setIsInvitual("否");
            }
            // 人员类别
            Codeitem codeitemLb = codeItemService.getOneCodeitem(BaseConst.MEMBER_XL,usra01.getA0183());
            if (codeitemLb != null){
                dto.setPeopleKind(codeitemLb.getCodeitemdesc());
            }
            dto.setDrugSchool(x.getDrugSchool());
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public int addDrugReportMember(AddReportMemberDto dto) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(dto.getReportId());
        if (drugReport == null) {
            drugReport = new DrugReport();
            drugReport.setId(dto.getReportId());
            drugReport.setShopId(dto.getShopId());
            drugReport.setCheckStatus(-1);
/*          drugReport.setOperatorId(operatorId);
            drugReport.setReportTime(reportTime);*/
            int i = drugReportMapper.insertSelective(drugReport);
            if (i == 0) {
                return -1;
            }
        }
        int sort = 1;
        for (String x : dto.getMemberIds()) {
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
            criteria.andReportIdEqualTo(dto.getReportId());
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
                    drugReportMember.setReportId(dto.getReportId());
                    //药监申报门店
                    drugReportMember.setReportShopId(dto.getShopId());
                    drugReportMember.setSort(sort);
                    drugReportMemberMapper.insertSelective(drugReportMember);
                    sort  = sort + 1;
                }
            } else {
                return 0;//重复插入
            }
        }
        return 1;
    }


    @Override
    public int addReportChangeMember(AddReportChangeMemberDto dto) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(dto.getReportId());

        for (String x : dto.getMemberIds()) {
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
            criteria.andReportIdEqualTo(dto.getReportId());
            criteria.andMemberIdEqualTo(x);
            List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
            if (list.size() == 0) {
                // 插入药监人员详情表
                Member member = memberMapper.selectByPrimaryKey(new Long(x));
                if (member != null) {
                    DrugReportMember drugReportMember = new DrugReportMember();
                    drugReportMember.setDrugEducationId(member.getDrugEducationId());
                    drugReportMember.setDrugMajorId(member.getDrugMajorId());
                    drugReportMember.setDrugOrgId(member.getDrugOrgId());
                    drugReportMember.setDrugPositionOneId(member.getDrugPositionOneId());
                    drugReportMember.setDrugPositionTwoId(member.getDrugPositionTwoId());
                    drugReportMember.setDrugPositionThreeId(member.getDrugPositionThreeId());
                    drugReportMember.setDrugShopId(member.getDrugShopId());
                    drugReportMember.setDrugTitleId(member.getDrugTitleId());
                    drugReportMember.setEducationStatus(member.getEducationStatus());
                    drugReportMember.setHealthStatus(member.getHealthStatus());
                    drugReportMember.setTrainStatus(member.getTrainStatus());
                    drugReportMember.setMemberId(x);
                    drugReportMember.setWorkTime(member.getWorkTime());

                    drugReportMember.setRelationId(member.getRelationId());
                    drugReportMember.setReportId(dto.getReportId());
                    //药监申报门店
                    drugReportMember.setReportShopId(drugReport.getShopId());

                    drugReportMember.setDrugSchool(member.getDrugSchool());

                    // 变更中
                    drugReportMember.setStatus(0);

                    drugReportMemberMapper.insertSelective(drugReportMember);

                    // 插入药监变更记录
                    MemberRecord memberRecord = new MemberRecord();
                    //变更原因
                    memberRecord.setChangeReason(dto.getChangeReason());

                    memberRecord.setMemberId(x);
                    memberRecord.setRelationId(member.getRelationId());
                    memberRecord.setReportId(dto.getReportId());

                    memberRecord.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());

                    memberRecord.setDrugEducationId(member.getDrugEducationId());
                    memberRecord.setWorkTime(member.getWorkTime());
                    memberRecord.setDrugMajorId(member.getDrugMajorId());
                    memberRecord.setDrugPositionOneId(member.getDrugPositionOneId());
                    memberRecord.setDrugPositionTwoId(member.getDrugPositionTwoId());
                    memberRecord.setDrugPositionThreeId(member.getDrugPositionThreeId());
                    memberRecord.setDrugTitleId(member.getDrugTitleId());
                    memberRecord.setDrugShopId(member.getDrugShopId());
                    memberRecord.setDrugOrgId(member.getDrugOrgId());
                    memberRecord.setEducationId(member.getEducationId());

                    memberRecord.setDrugSchool(member.getDrugSchool());
                    //变更中
                    memberRecord.setStatus(0);

                    if (drugReport != null) {
                        memberRecord.setReportShopId(drugReport.getShopId());
                    }
                    memberRecordMapper.insertSelective(memberRecord);
                }
       /*         //修改审核状态
                drugReport.setCheckStatus(0);
                //操作人
                drugReport.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());
                drugReportMapper.updateByPrimaryKeySelective(drugReport);*/
            } else {
                return 0;//重复插入
            }
        }
        return 1;
    }


    @Override
    public int choseShopAddDrugReportMember(String reportId, String ShopId) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        if (drugReport == null) {
            drugReport = new DrugReport();
            drugReport.setId(reportId);
            drugReport.setShopId(ShopId);
            drugReport.setCheckStatus(-1);
/*          drugReport.setOperatorId(operatorId);
            drugReport.setReportTime(reportTime);*/
            int i = drugReportMapper.insertSelective(drugReport);
            if (i == 0) {
                return -1;
            }

            MemberExample memberExample = new MemberExample();
            memberExample.createCriteria().andDrugShopIdEqualTo(ShopId);
            List<Member> list = memberMapper.selectByExample(memberExample);
            list.stream().forEach(x -> {
                DrugReportMember drugReportMember = new DrugReportMember();
                drugReportMember.setMemberId(x.getId().toString());
                drugReportMember.setRelationId(x.getRelationId());
                /*           drugReportMember.setWorkTime(member.getWorkTime());*/
                drugReportMember.setReportId(reportId);
                drugReportMember.setReportShopId(ShopId);
                drugReportMemberMapper.insertSelective(drugReportMember);
            });
            return 1;
        } else {
            if (!drugReport.getShopId().equals(ShopId)) { //换门店了
                drugReport.setShopId(ShopId);
                int i = drugReportMapper.updateByPrimaryKeySelective(drugReport);
                DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
                DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
                criteria.andReportIdEqualTo(reportId);
                drugReportMemberMapper.deleteByExample(drugReportMemberExample); //删除以前的
                MemberExample memberExample = new MemberExample();
                memberExample.createCriteria().andDrugShopIdEqualTo(ShopId);
                List<Member> list = memberMapper.selectByExample(memberExample);
                list.stream().forEach(x -> {
                    DrugReportMember drugReportMember = new DrugReportMember();
                    drugReportMember.setMemberId(x.getId().toString());
                    drugReportMember.setRelationId(x.getRelationId());
                    /*           drugReportMember.setWorkTime(member.getWorkTime());*/
                    drugReportMember.setReportId(reportId);
                    drugReportMember.setReportShopId(ShopId);
                    drugReportMemberMapper.insertSelective(drugReportMember);//新增
                });
                return 1;
            }
        }
        return 1;
    }

    @Override
    public int deleteDrugReportMember(String id) {
        return drugReportMemberMapper.deleteByPrimaryKey(new Long(id));
    }

    @Override
    public int changeDrugReportMemberSort(String id,int sort) {
        DrugReportMember drugReportMember = drugReportMemberMapper.selectByPrimaryKey(new Long(id));
        drugReportMember.setSort(sort);
        return drugReportMemberMapper.updateByPrimaryKeySelective(drugReportMember);
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
    public int sureDrugReport(String reportId, Date reportTime) {
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
        if (list.size() == 0) {
            return -1; //没有内容不能确认
        }
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        if (getDrugCountByShopId(drugReport.getShopId()) == null) {
            return -2; //没有药监数据不能确认
        }
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria1 = drugReportExample.createCriteria();
        criteria1.andShopIdEqualTo(drugReport.getShopId());
        criteria1.andCheckStatusNotEqualTo(-1);//排除待确认的
        List<DrugReport> list1 = drugReportMapper.selectByExample(drugReportExample);
        if (list1.size() >= 1 && drugReport.getCheckStatus().equals(-1)) {
            return -3; //门店已存在药监申报，请在药监控制台查看。
        }

        drugReport.setReportTime(reportTime);
        drugReport.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());
        drugReport.setCheckStatus(0);
        return drugReportMapper.updateByPrimaryKeySelective(drugReport);
    }

    @Override
    public List<ExportDrugReportMemberDto> exportDrugReportMember(String reportId) {
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);

        List<DrugReportMemberListDto> toDtos = new ArrayList<>();
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        if (drugReport.getCheckStatus().equals(0)) { //待确定
            toDtos = drugReportMemberListToDto(list);
        }
        else {
            toDtos = drugChangeReportMemberListToDto(list);
        }
        List<ExportDrugReportMemberDto> result = new ArrayList<>();
        toDtos.stream().forEach(x -> {
            ExportDrugReportMemberDto model = new ExportDrugReportMemberDto();
            model.setIdCard(x.getIdCard());
            model.setName(x.getName());
            model.setAge(x.getAge());
            model.setDrugTitle(x.getDrugTitle());
            model.setDrugPositionAll(x.getDrugPositionAll());
            model.setDrugMajor(x.getDrugMajor());
            model.setDrugEducation(x.getDrugEducation());
            model.setWorkTime(DateUtil.getFormatString(x.getWorkTime()));
            model.setBirthday(DateUtil.getFormatString(x.getBirthday()));
            model.setSex(x.getSex());
            model.setEducationStatus("是");
            model.setHealthStatus("健康");
            model.setTrainStatus("是");
            model.setSort(x.getSort());
            //导出
            result.add(model);
        });
        return result;
    }

    @Override
    public List<ExportSpecialDrugReportMemberDto> exportSpecialDrugReportMember(String reportId) {
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);

        List<DrugReportMemberListDto> toDtos = new ArrayList<>();
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        if (drugReport.getCheckStatus().equals(0)) { //待确定
            toDtos = drugReportMemberListToDto(list);
        }
        else {
            toDtos = drugChangeReportMemberListToDto(list);
        }
        List<ExportSpecialDrugReportMemberDto> result = new ArrayList<>();
        toDtos.stream().forEach(x -> {
            ExportSpecialDrugReportMemberDto model = new ExportSpecialDrugReportMemberDto();
            model.setIdCard(x.getIdCard());
            model.setName(x.getName());
            model.setAge(x.getAge());
            model.setDrugTitle(x.getDrugTitle());
            model.setDrugPositionAll(x.getDrugPositionAll());
            model.setDrugMajor(x.getDrugMajor());
            model.setDrugEducation(x.getDrugEducation());
            model.setWorkTime(DateUtil.getFormatString(x.getWorkTime()));
            model.setBirthday(DateUtil.getFormatString(x.getBirthday()));
            model.setSex(x.getSex());
            model.setEducationStatus("是");
            model.setHealthStatus("健康");
            model.setTrainStatus("是");
            model.setSort(x.getSort());
            model.setDrugSchool(x.getDrugSchool());
            //导出
            result.add(model);
        });
        return result;
    }

    @Override
    public int passDrugReport(String reportId) {
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(reportId);
        drugReport.setCheckStatus(1);
        //操作人
        drugReport.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());
        drugReportMapper.updateByPrimaryKeySelective(drugReport);
        //保存记录
        DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
        DrugReportMemberExample.Criteria criteria = drugReportMemberExample.createCriteria();
        criteria.andReportIdEqualTo(reportId);
        List<DrugReportMember> list = drugReportMemberMapper.selectByExample(drugReportMemberExample);
        list.forEach(x -> {
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
                x.setReportShopId(drugReport.getShopId());
                //新增字段
                x.setEducationId(member.getEducationId());
                x.setDrugSchool(member.getDrugSchool());
                drugReportMemberMapper.updateByPrimaryKeySelective(x);
            }
        });
        //插入变更记录表 如果member_record 中没有此reportId 插入
        MemberRecordExample memberRecordExample = new MemberRecordExample();
        MemberRecordExample.Criteria criteria1 = memberRecordExample.createCriteria();
        criteria1.andReportIdEqualTo(reportId);
        List<MemberRecord> list1 = memberRecordMapper.selectByExample(memberRecordExample);
        if (list1.size() == 0) {
            list.stream().forEach(x -> {
                // 插入药监变更记录
                MemberRecord memberRecord = new MemberRecord();
                //变更原因
                //memberRecord.setChangeReason(dto.getChangeReason());
                memberRecord.setChangeReason("1608457634502");
                //memberRecord.setChangeReason("1608816513961");
                //memberRecord.setChangeReason("1608818350908");s
                memberRecord.setMemberId(x.getMemberId());
                memberRecord.setRelationId(x.getRelationId());
                memberRecord.setReportId(reportId);

                memberRecord.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());

                memberRecord.setDrugEducationId(x.getDrugEducationId());
                memberRecord.setWorkTime(x.getWorkTime());
                memberRecord.setDrugMajorId(x.getDrugMajorId());
                memberRecord.setDrugPositionOneId(x.getDrugPositionOneId());
                memberRecord.setDrugPositionTwoId(x.getDrugPositionTwoId());
                memberRecord.setDrugPositionThreeId(x.getDrugPositionThreeId());
                memberRecord.setDrugTitleId(x.getDrugTitleId());
                memberRecord.setDrugShopId(x.getDrugShopId());
                memberRecord.setDrugOrgId(x.getDrugOrgId());
                memberRecord.setEducationId(x.getEducationId());
                memberRecord.setDrugSchool(x.getDrugSchool());

                if (drugReport != null) {
                    memberRecord.setReportShopId(drugReport.getShopId());
                }
                memberRecordMapper.insertSelective(memberRecord);
            });
        }
        return 1;
    }

    @Override
    public List<DrugCount> getDrugCountList(DrugCountListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        DrugCountExample drugCountExample = new DrugCountExample();
        DrugCountExample.Criteria criteria = drugCountExample.createCriteria();
        if (!StringUtils.isEmpty(param.getShopId())) {
            criteria.andShopIdEqualTo(param.getShopId());
        } else {
            criteria.andShopIdIsNull(); //没有传shopId 默认不返回
        }
        return drugCountMapper.selectByExample(drugCountExample);
    }

    @Override
    public List<DrugCount> getDrugCountAll() {
        DrugCountExample drugCountExample = new DrugCountExample();
        return drugCountMapper.selectByExample(drugCountExample);
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

    @Override
    public AdminUserDetails getCurrentAdminUser() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        AdminUserDetails userDetails = (AdminUserDetails) auth.getPrincipal();
        return userDetails;
    }

    @Override
    public DrugReportMember getDrugReportMember(String id) {
        return drugReportMemberMapper.selectByPrimaryKey(new Long(id));
    }

    @Override
    public Boolean deleteMoreDrugReport() {
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andCheckStatusEqualTo(-1);//待确认的
        List<DrugReport> list = drugReportMapper.selectByExample(drugReportExample);
        list.forEach(x -> {
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria1 = drugReportMemberExample.createCriteria();
            criteria1.andReportIdEqualTo(x.getId());
            drugReportMemberMapper.deleteByExample(drugReportMemberExample);
            drugReportMapper.deleteByPrimaryKey(x.getId());
        });
        return true;
    }

    @Override
    public Boolean sureChanges(String shopId) {
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        List<DrugReport> list = drugReportMapper.selectByExample(drugReportExample);
        if (list.size() > 0) {
            DrugReport drugReport = list.get(0);
            //修改变更记录状态
            MemberRecordExample memberRecordExample = new MemberRecordExample();
            MemberRecordExample.Criteria criteria1 = memberRecordExample.createCriteria();
            criteria1.andReportShopIdEqualTo(shopId);
            criteria1.andStatusEqualTo(0);//变更中
            List<MemberRecord> list1 = memberRecordMapper.selectByExample(memberRecordExample);
            if (list1.size() > 0){
                list1.forEach(x->{
                    x.setStatus(1);
                    memberRecordMapper.updateByPrimaryKeySelective(x);
                });
            }

            // drugReportMember 状态是0 变更中的数据 该为1正常
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria11 = drugReportMemberExample.createCriteria();
            criteria11.andReportIdEqualTo(drugReport.getId());
            criteria11.andStatusEqualTo(0);
            List<DrugReportMember> list11 = drugReportMemberMapper.selectByExample(drugReportMemberExample);
            if (list11.size() > 0){
                list11.forEach(x->{
                    x.setStatus(1); //正常
                    // 删除变更中的数据
                    drugReportMemberMapper.updateByPrimaryKeySelective(x);
                });
            }
            //修改审核状态
            drugReport.setCheckStatus(0);
            //操作人
            drugReport.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());
            drugReportMapper.updateByPrimaryKeySelective(drugReport);
        }
        return true;

    }

    @Override
    public Boolean cancelChanges(String shopId) {
        DrugReportExample drugReportExample = new DrugReportExample();
        DrugReportExample.Criteria criteria = drugReportExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        List<DrugReport> list = drugReportMapper.selectByExample(drugReportExample);
        if (list.size() > 0) {
            DrugReport drugReport = list.get(0);
            //修改变更记录状态
            MemberRecordExample memberRecordExample = new MemberRecordExample();
            MemberRecordExample.Criteria criteria1 = memberRecordExample.createCriteria();
            criteria1.andReportShopIdEqualTo(shopId);
            criteria1.andStatusEqualTo(0);//变更中
            List<MemberRecord> list1 = memberRecordMapper.selectByExample(memberRecordExample);
            if (list1.size() > 0){
                list1.forEach(x->{
                    x.setStatus(1);
                    // 删除变更中的数据
                    memberRecordMapper.deleteByPrimaryKey(x.getId());
                });
            }

            // 删除 drugReportMember 状态是0 变更中的数据
            DrugReportMemberExample drugReportMemberExample = new DrugReportMemberExample();
            DrugReportMemberExample.Criteria criteria11 = drugReportMemberExample.createCriteria();
            criteria11.andReportIdEqualTo(drugReport.getId());
            criteria11.andStatusEqualTo(0);
            List<DrugReportMember> list11 = drugReportMemberMapper.selectByExample(drugReportMemberExample);
            if (list11.size() > 0){
                list11.forEach(x->{
                    // 删除变更中的数据
                    drugReportMemberMapper.deleteByPrimaryKey(x.getId());
                });
            }
            //操作人
            drugReport.setOperatorId(getCurrentAdminUser().getUmsAdmin().getId().toString());
            drugReportMapper.updateByPrimaryKeySelective(drugReport);
        }
        return true;

    }
}
