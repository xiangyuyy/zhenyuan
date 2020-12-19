package com.macro.mall.service;

import com.macro.mall.bo.AdminUserDetails;
import com.macro.mall.dto.*;
import com.macro.mall.model.*;

import java.util.Date;
import java.util.List;

/**
 *drugReportService
 * Created by macro on 2018/4/26.
 */
public interface DrugReportService {

    //人员新增
    List<Member> getAddDrugReportMemberList(AddReportMemberListParam param);

    List<AddReportMemberListDto> AddDrugReportMemberListToDto(List<Member> list);

    //部门变更录入 显示药监申报详细列表
    List<DrugReportMember> getShopDrugReportMemberList(ShopDrugReportMemberListParam param);

    //药监申报录入表 显示药监申报详细列表 是显示member表中值了
    List<DrugReportMember> getDrugReportMemberList(DrugReportMemberListParam param);

    List<DrugReportMemberListDto> drugReportMemberListToDto(List<DrugReportMember> list);

    //药监变更部门变更录入 是显示记录ReportMember表中值

    List<DrugReportMemberListDto> drugChangeReportMemberListToDto(List<DrugReportMember> list);

    //药监控制台
    List<DrugReport> getDrugReportList(DrugReportListParam param);

    List<DrugReportListDto> drugReportListToDto(List<DrugReport> list);

    DrugReportListDto getDrugReportDto(String id);

    int addDrugReportMember(AddReportMemberDto dto);

    int addReportChangeMember(AddReportChangeMemberDto dto);

    int choseShopAddDrugReportMember(String reportId,String ShopId);

    int deleteDrugReportMember(String id);

    Boolean deleteAllDrugReportMember(String id);

    int sureDrugReport(String reportId, Date reportTime);

    List<ExportDrugReportMemberDto> exportDrugReportMember(String reportId);

    int passDrugReport(String reportId);

    //药监计算结果查询
    List<DrugCount> getDrugCountList(DrugCountListParam param);

    DrugCount getDrugCountByShopId(String shopId);

    int addOrUpdateDrugCount(DrugCount drugCount);

    Boolean isCanAddReport(String shopId);

    AdminUserDetails getCurrentAdminUser();

    DrugReportMember getDrugReportMember(String id);

    Boolean deleteMoreDrugReport();

}
