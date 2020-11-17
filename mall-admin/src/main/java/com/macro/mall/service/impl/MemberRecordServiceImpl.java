package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberRecordService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * MemberRecordService人员变更
 * Created by macro on 2018/4/26.
 */
@Service
public class MemberRecordServiceImpl implements MemberRecordService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberRecordServiceImpl.class);
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberRecordMapper memberRecordMapper;

    @Autowired
    private DrugReportMapper drugReportMapper;

    @Autowired
    private DrugReportService drugReportService;

    @Autowired
    private CodeitemMapper codeitemMapper;

    @Autowired
    private CodeItemService codeItemService;

    @Autowired
    private Usra01Mapper usra01Mapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private MemberService memberService;

    @Override
    public int updateMemberRecord(UpdateMemberRecordDto updateMemberRecordDto) {
        Member member = memberMapper.selectByPrimaryKey(new Long(updateMemberRecordDto.getMemberId()));
        if (member == null){
            return -1;
        }
        //更新member
        member.setDrugEducationId(updateMemberRecordDto.getDrugEducationId());
        member.setWorkTime(updateMemberRecordDto.getWorkTime());
        member.setDrugMajorId(updateMemberRecordDto.getDrugMajorId());
        member.setDrugPositionOneId(updateMemberRecordDto.getDrugPositionOneId());
        member.setDrugPositionTwoId(updateMemberRecordDto.getDrugPositionTwoId());
        member.setDrugPositionThreeId(updateMemberRecordDto.getDrugPositionThreeId());
        member.setDrugTitleId(updateMemberRecordDto.getDrugTitleId());
        member.setDrugShopId(updateMemberRecordDto.getDrugShopId());
        member.setDrugOrgId(updateMemberRecordDto.getDrugOrgId());
        member.setEducationId(updateMemberRecordDto.getEducationId());
        int i = memberMapper.updateByPrimaryKeySelective(member);
        //插入记录
        MemberRecord memberRecord = new MemberRecord();
        memberRecord.setChangeReason(updateMemberRecordDto.getChangeReason());
        memberRecord.setMemberId(updateMemberRecordDto.getMemberId());
        memberRecord.setRelationId(member.getRelationId());
        memberRecord.setReportId(updateMemberRecordDto.getReportId());

        memberRecord.setOperatorId(drugReportService.getCurrentAdminUser().getUmsAdmin().getId().toString());

        memberRecord.setDrugEducationId(updateMemberRecordDto.getDrugEducationId());
        memberRecord.setWorkTime(updateMemberRecordDto.getWorkTime());
        memberRecord.setDrugMajorId(updateMemberRecordDto.getDrugMajorId());
        memberRecord.setDrugPositionOneId(updateMemberRecordDto.getDrugPositionOneId());
        memberRecord.setDrugPositionTwoId(updateMemberRecordDto.getDrugPositionTwoId());
        memberRecord.setDrugPositionThreeId(updateMemberRecordDto.getDrugPositionThreeId());
        memberRecord.setDrugTitleId(updateMemberRecordDto.getDrugTitleId());
        memberRecord.setDrugShopId(updateMemberRecordDto.getDrugShopId());
        memberRecord.setDrugOrgId(updateMemberRecordDto.getDrugOrgId());
        memberRecord.setChangeReason(updateMemberRecordDto.getChangeReason());
        memberRecord.setEducationId(updateMemberRecordDto.getEducationId());

        memberRecordMapper.insertSelective(memberRecord);

        //修改审核状态
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(updateMemberRecordDto.getReportId());
        drugReport.setCheckStatus(0);
        //操作人
        drugReport.setOperatorId(drugReportService.getCurrentAdminUser().getUmsAdmin().getId().toString());
        return  drugReportMapper.updateByPrimaryKeySelective(drugReport);
    }

    @Override
    public UpdateMemberRecordDto getDrugMemberRecordDto(String id) {
        DrugReportMember  model = drugReportService.getDrugReportMember(id);
        if (model == null){
            return null;
        }

        UpdateMemberRecordDto member = new UpdateMemberRecordDto();
        member.setReportId(model.getReportId());
        member.setMemberId(model.getMemberId());

        member.setDrugEducationId(model.getDrugEducationId());
        member.setWorkTime(model.getWorkTime());
        member.setDrugMajorId(model.getDrugMajorId());
        member.setDrugPositionOneId(model.getDrugPositionOneId());
        member.setDrugPositionTwoId(model.getDrugPositionTwoId());
        member.setDrugPositionThreeId(model.getDrugPositionThreeId());
        member.setDrugTitleId(model.getDrugTitleId());
        member.setDrugShopId(model.getDrugShopId());
        member.setDrugOrgId(model.getDrugOrgId());
        member.setEducationId(model.getEducationId());
        return member;
    }

    @Override
    public List<MemberRecord> getMemberRecordList(MemberRecordListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        MemberRecordExample memberRecordExample = new MemberRecordExample();
        MemberRecordExample.Criteria criteria = memberRecordExample.createCriteria();
        criteria.andMemberIdEqualTo(param.getMemberId());
        if (param.getCreateTimeBegin() != null){
            param.setCreateTimeBegin(DateUtil.getDateAddOneDay(param.getCreateTimeBegin()));
            criteria.andCreateTimeGreaterThanOrEqualTo(param.getCreateTimeBegin());
        }
        if (param.getCreateTimeEnd() != null){
            param.setCreateTimeEnd(DateUtil.getDateAddOneDay(param.getCreateTimeEnd()));
            criteria.andCreateTimeLessThanOrEqualTo(param.getCreateTimeEnd());
        }
        memberRecordExample.setOrderByClause("modify_time desc");
        return memberRecordMapper.selectByExample(memberRecordExample);
    }

    @Override
    public List<MemberRecordListDto> memberRecordListToDto(List<MemberRecord> list) {
        List<MemberRecordListDto> daoList = new ArrayList<>();
        list.stream().forEach(x->{
            MemberRecordListDto dto =  new MemberRecordListDto();
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
                //dto.setTitle("待定");
                List<VZhicheng> vZhichengList  = memberService.getMemberVZhichengr(usra01.getA0144());
                String title = "";
                for (VZhicheng v:vZhichengList) {
                    title += v.getZcjb();
                    if(v.getZcsj() != null){
                        title += "(" + DateUtil.getFormatString(v.getZcsj())+")" + " ";
                    }
                }
                dto.setTitle(title);
                dto.setTitleTime(null);
                dto.setName(usra01.getA0101());
                Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,usra01.getA0107());
                if (codeitemSex != null){
                    dto.setSex(codeitemSex.getCodeitemdesc());
                }
                Organization organization = organizationMapper.selectByPrimaryKey(usra01.getE0122());
                if (organization != null){
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }

            dto.setWorkTime(x.getWorkTime());
            dto.setEducationStatus(1);
            dto.setTrainStatus(1);
            dto.setHealthStatus(1);
            Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
            if (organization != null){
                dto.setDrugShopName(organization.getCodeitemdesc());
            }

            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM,x.getDrugEducationId());
            if (codeitem != null){//药监学历
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
                drugPositionAll += " " + drugPositionTwo.getCodeitemdesc();
            }
            Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
            if (drugPositionThree != null) {//岗位3
                dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
                drugPositionAll += " " + drugPositionThree.getCodeitemdesc();
            }
            dto.setDrugPositionAll(drugPositionAll);


            Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC,x.getDrugOrgId());
            if (drugOrg != null){//药监编制职称
                dto.setDrugOrg(drugOrg.getCodeitemdesc());
            }

            Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC,x.getDrugTitleId());
            if (drugTitle != null){//药监上报职称
                dto.setDrugTitle(drugTitle.getCodeitemdesc());
            }
            //虚挂
            if (!StringUtils.isEmpty(x.getDrugShopId()) &&!x.getDrugShopId().equals(usra01.getE0122())) {
                dto.setIsInvitual("是");
            }
            else {
                dto.setIsInvitual("否");
            }

            // 变更特殊
            dto.setChangeReason(x.getChangeReason());
            dto.setCreateTime(x.getCreateTime());
            dto.setReportId(x.getReportId());
            daoList.add(dto);
        });
        return daoList;
    }
}
