package com.macro.mall.service;

import com.macro.mall.dto.MemberListDto;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.SelectDto;
import com.macro.mall.dto.UpdateMemberRecordDto;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberRecord;
import com.macro.mall.model.Organization;

import java.util.List;

/**
 *人员变更 Service
 * Created by macro on 2018/4/26.
 */
public interface MemberRecordService {

    int updateMemberRecord(UpdateMemberRecordDto updateMemberRecordDto);

    UpdateMemberRecordDto getDrugMemberRecordDto(String id);
}
