package com.macro.mall.service.impl;


import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.MemberListDto;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.SelectDto;
import com.macro.mall.dto.UpdateMemberRecordDto;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.MemberRecordService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        int i = memberMapper.updateByPrimaryKeySelective(member);
        //插入记录
        MemberRecord memberRecord = new MemberRecord();
        memberRecord.setChangeReason(updateMemberRecordDto.getChangeReason());
        memberRecord.setMemberId(updateMemberRecordDto.getMemberId());
        memberRecord.setRelationId(member.getRelationId());
        memberRecord.setReportId(updateMemberRecordDto.getReportId());
        memberRecord.setOperatorId("待定");

        memberRecord.setDrugEducationId(updateMemberRecordDto.getDrugEducationId());
        memberRecord.setWorkTime(updateMemberRecordDto.getWorkTime());
        memberRecord.setDrugMajorId(updateMemberRecordDto.getDrugMajorId());
        memberRecord.setDrugPositionOneId(updateMemberRecordDto.getDrugPositionOneId());
        memberRecord.setDrugPositionTwoId(updateMemberRecordDto.getDrugPositionTwoId());
        memberRecord.setDrugPositionThreeId(updateMemberRecordDto.getDrugPositionThreeId());
        memberRecord.setDrugTitleId(updateMemberRecordDto.getDrugTitleId());
        memberRecord.setDrugShopId(updateMemberRecordDto.getDrugShopId());
        memberRecord.setDrugOrgId(updateMemberRecordDto.getDrugOrgId());

        memberRecordMapper.insertSelective(memberRecord);

        //修改审核状态
        DrugReport drugReport = drugReportMapper.selectByPrimaryKey(updateMemberRecordDto.getReportId());
        drugReport.setCheckStatus(1);
        return  drugReportMapper.updateByPrimaryKeySelective(drugReport);
    }
}
