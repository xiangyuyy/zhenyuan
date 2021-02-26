package com.macro.mall.service;

import com.macro.mall.dto.*;
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

    //变更历史
    List<MemberRecord> getMemberRecordList(MemberRecordListParam param);

    List<MemberRecordListDto> memberRecordListToDto(List<MemberRecord> list);

    //部门申报变更记录查询
    List<MemberRecord> getShopMemberRecordList(ShopMemberRecordListParam param, Boolean paging);

    List<MemberRecord> getMemberRecordListByShopId(String shopId);

}
