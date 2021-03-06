package com.macro.mall.controller;

import cn.hutool.core.collection.ListUtil;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.OrganizationMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberRecordService;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.UmsRoleService;
import com.macro.mall.util.DrugCountUtil;
import com.macro.mall.util.ExportExcel;
import com.macro.mall.util.HelpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 药监申报管理ontroller
 * Created by macro on 2020/2/4.
 */
@Controller
@Api(tags = "DrugReportController", description = "药监申报管理")
@RequestMapping("/drugReport")
public class DrugReportController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private DrugReportService drugReportService;

    @Autowired
    private MemberRecordService memberRecordService;

    @Autowired
    private UmsRoleService roleService;

    @Autowired
    private OrganizationMapper organizationMapper;

    @ApiOperation("获得单号")
    @RequestMapping(value = "/getReportId", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> getReportId() {
        return CommonResult.success(String.valueOf(HelpUtil.getReportNum()));
    }

    @ApiOperation("获得药监计算数据")
    @RequestMapping(value = "/getDrugCount", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<DrugCount> getDrugCount(@RequestBody DrugCount drugCount) {
        if (drugCount.getArea() == null) {
            return CommonResult.failed("经营面积不能为空");
        }
        if (drugCount.getSubjection() == null) {
            return CommonResult.failed("行政隶属不能为空");
        }
        if (drugCount.getChineseMedicine() == null) {
            return CommonResult.failed("有无中药不能为空");
        }
        if (drugCount.getLongRange() == null) {
            return CommonResult.failed("是否远程不能为空");
        }
        DrugCount result = DrugCountUtil.getResult(drugCount.getSubjection(), drugCount.getChineseMedicine(), drugCount.getLongRange(), drugCount.getArea());
        result.setShopId(drugCount.getShopId());
        return CommonResult.success(result);
    }

    @ApiOperation("根据shopId获得药监计算工具展示数据")
    @RequestMapping(value = "/getShopDrugCount/{shopId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<DrugCount> getShopDrugCount(@PathVariable String shopId) {
        return CommonResult.success(drugReportService.getDrugCountByShopId(shopId));
    }

    @ApiOperation("药监计算结果查询")
    @RequestMapping(value = "/getDrugCountList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DrugCount>> getDrugCountList(DrugCountListParam param) {
        List<DrugCount> list = drugReportService.getDrugCountList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(list);
        return CommonResult.success(commonPage);
    }


    @ApiOperation("确定药监计算数据")
    @RequestMapping(value = "/sureDrugCount", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody DrugCount drugCount) {
        if (StringUtils.isEmpty(drugCount.getShopId())) {
            return CommonResult.failed("ShopId不能为空");
        }
        int count = drugReportService.addOrUpdateDrugCount(drugCount);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("药监人员新增列表")
    @RequestMapping(value = "/getMemberList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<AddReportMemberListDto>> getMemberList(@RequestBody AddReportMemberListParam param) {
        if (StringUtils.isEmpty(param.getShopId())) {
            return CommonResult.failed("ShopId不能为空");
        }
        if (StringUtils.isEmpty(param.getReportId())) {
            return CommonResult.failed("ReportId不能为空");
        }
        List<Member> list = drugReportService.getAddDrugReportMemberList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(drugReportService.AddDrugReportMemberListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("选择药监门店")
    @RequestMapping(value = "/choseShopAddDrugReportMember", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult choseShopAddDrugReportMember(String reportId, String shopId) {
        if (StringUtils.isEmpty(shopId)) {
            return CommonResult.failed("shopId不能为空");
        }
        if (StringUtils.isEmpty(reportId)) {
            return CommonResult.failed("ReportId不能为空");
        }
        int i = drugReportService.choseShopAddDrugReportMember(reportId, shopId);
        return CommonResult.success(i);
    }

    @ApiOperation("添加人员")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody AddReportMemberDto addReportMemberDto) {
        if (StringUtils.isEmpty(addReportMemberDto.getShopId())) {
            return CommonResult.failed("ShopId不能为空");
        }
        if (StringUtils.isEmpty(addReportMemberDto.getReportId())) {
            return CommonResult.failed("ReportId不能为空");
        }

        if (addReportMemberDto.getMemberIds() == null || addReportMemberDto.getMemberIds().size() == 0) {
            return CommonResult.failed("新增人员id不能为空");
        }
        int count = drugReportService.addDrugReportMember(addReportMemberDto);

        if (count == -1) {
            return CommonResult.failed("创建药监信息失败");
        }
        if (count == 0) {
            return CommonResult.failed("存在重复新增人员");
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("部门变更 判断添加人员是否有效")
    @RequestMapping(value = "/getChangeReportId", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getChangeReportId(String shopId) {
        if (StringUtils.isEmpty(shopId)) {
            return CommonResult.failed("shopId不能为空");
        }
        DrugReportListParam param = new DrugReportListParam();
        List<String> shopIds = new ArrayList<>();
        shopIds.add(shopId);
        param.setShopIds(shopIds);
        List<DrugReport> list = drugReportService.getDrugReportList(param);
        list = list.stream().filter(x->x.getCheckStatus().equals(1)).collect(Collectors.toList());
        if (list != null && list.size() > 0) {
            return CommonResult.success(list.get(0).getId());
        }
        return CommonResult.failed("没有可变更的数据");
    }


    @ApiOperation("部门变更添加人员")
    @RequestMapping(value = "/addReportChangeMember", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addReportChangeMember(@RequestBody AddReportChangeMemberDto addReportMemberDto) {
        if (StringUtils.isEmpty(addReportMemberDto.getReportId())) {
            return CommonResult.failed("ReportId不能为空");
        }

        if (addReportMemberDto.getMemberIds() == null || addReportMemberDto.getMemberIds().size() == 0) {
            return CommonResult.failed("新增人员id不能为空");
        }

        if (StringUtils.isEmpty(addReportMemberDto.getChangeReason())) {
            return CommonResult.failed("变更原因不能为空");
        }
        int count = drugReportService.addReportChangeMember(addReportMemberDto);

        if (count == 0) {
            return CommonResult.failed("存在重复新增人员");
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("药监申报录入表")
    @RequestMapping(value = "/getDrugReportMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DrugReportMemberListDto>> getDrugReportMemberList(DrugReportMemberListParam param) {
        List<DrugReportMember> list = new ArrayList<>();
        if (!StringUtils.isEmpty(param.getReportId())) {
            list = drugReportService.getDrugReportMemberList(param);
        }
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(drugReportService.drugReportMemberListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("根据id删除当前人员信息")
    @RequestMapping(value = "/deleteDrugReportMember/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteDrugReportMember(@PathVariable String id) {
        int count = drugReportService.deleteDrugReportMember(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据id修改排列序号")
    @RequestMapping(value = "/changeDrugReportMemberSort", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult changeDrugReportMemberSort(String id,int sort) {
        int count = drugReportService.changeDrugReportMemberSort(id,sort);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("清空当前人员信息")
    @RequestMapping(value = "/deleteAllDrugReportMember/{reportId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteAllDrugReportMember(@PathVariable String reportId) {
        Boolean count = drugReportService.deleteAllDrugReportMember(reportId);
        return CommonResult.success(count);
    }

    @ApiOperation("确定 保存不导出")
    @RequestMapping(value = "/sureDrugReport", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult sureDrugReport(@RequestBody SureDrugReportDto sureDrugReportDto) {
        int count = drugReportService.sureDrugReport(sureDrugReportDto.getReportId(), sureDrugReportDto.getReportTime());
        if (count == -1) {
            return CommonResult.failed("没有人员信息内容不能确认，请添加人员");
        }
        if (count == -2) {
            return CommonResult.failed("没有药监数据不能确认，请先通过药监计算工具确认");
        }
        if (count == -3) {
            return CommonResult.failed("门店已存在药监申报，请在药监控制台查看");
        }
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


    @ApiOperation("确定 保存导出")
    @RequestMapping(value = "/sureAndExportDrugReport", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult sureAndExportDrugReport(HttpServletRequest request,
                                                HttpServletResponse response, @RequestBody SureDrugReportDto sureDrugReportDto) {
        int count = drugReportService.sureDrugReport(sureDrugReportDto.getReportId(), sureDrugReportDto.getReportTime());
        if (count == -1) {
            return CommonResult.failed("没有人员信息内容不能确认，请添加人员");
        }
        if (count == -2) {
            return CommonResult.failed("没有药监数据不能确认，请先通过药监计算工具确认");
        }
        if (count == -3) {
            return CommonResult.failed("门店已存在药监申报，请在药监控制台查看");
        }
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("导出药监审核人员信息")
    @RequestMapping(value = "/exportDrugReport", method = RequestMethod.GET)
    public void exportDrugReport(HttpServletRequest request, HttpServletResponse response, String reportId) {
        SureDrugReportDto sureDrugReportDto = new SureDrugReportDto();
        sureDrugReportDto.setReportId(reportId);
        if (!StringUtils.isEmpty(sureDrugReportDto.getReportId())) {
            List<ExportDrugReportMemberDto> result = drugReportService.exportDrugReportMember(sureDrugReportDto.getReportId());
            if(result.size() > 0) {
                ExportExcel<ExportDrugReportMemberDto> ee = new ExportExcel<ExportDrugReportMemberDto>();
                String[] headers = {"序号", "姓名", "身份证号码 ", "性别 ", "出身年月", "年龄", "职称", "学历 ", "专业", "职务或岗位", "参加工作时间", "健康状况", "是否继续教育", "是否参加培训"};
                String fileName = reportId;
                String shopName = drugReportService.getDrugReportDto(reportId).getShopName();
                ee.exportExcel(headers, result, shopName, fileName, response);
            }
        }
    }

    @ApiOperation("特殊导出药监审核人员信息")
    @RequestMapping(value = "/exportSpecialDrugReport", method = RequestMethod.GET)
    public void exportSpecialDrugReport(HttpServletRequest request, HttpServletResponse response, String reportId) {
        SureDrugReportDto sureDrugReportDto = new SureDrugReportDto();
        sureDrugReportDto.setReportId(reportId);
        if (!StringUtils.isEmpty(sureDrugReportDto.getReportId())) {
            List<ExportSpecialDrugReportMemberDto> result = drugReportService.exportSpecialDrugReportMember(sureDrugReportDto.getReportId());
            if(result.size() > 0) {
                ExportExcel<ExportSpecialDrugReportMemberDto> ee = new ExportExcel<ExportSpecialDrugReportMemberDto>();
                String[] headers = {"序号", "姓名", "身份证号码 ", "性别 ", "出身年月", "年龄", "职称", "学历 ", "专业", "学校", "职务或岗位", "参加工作时间", "健康状况", "是否继续教育", "是否参加培训"};
                String fileName = reportId;
                String shopName = drugReportService.getDrugReportDto(reportId).getShopName();
                ee.exportExcel(headers, result, shopName, fileName, response);
            }
        }
    }

    @ApiOperation("审核")
    @RequestMapping(value = "/passDrugReport/{reportId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult passDrugReport(@PathVariable String reportId) {
        int count = drugReportService.passDrugReport(reportId);
        if (count == 1) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("药监申报控制台表")
    @RequestMapping(value = "/getDrugReportList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<DrugReportListDto>> getDrugReportList(@RequestBody DrugReportListParam param) {
        List<DrugReport> list = drugReportService.getDrugReportList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(drugReportService.drugReportListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("药监申报头部信息")
    @RequestMapping(value = "/getDrugReport/{reportId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<DrugReportListDto> getDrugReportDto(@PathVariable String reportId) {
        return CommonResult.success(drugReportService.getDrugReportDto(reportId));
    }

    @ApiOperation("部门变更录入表 --点击控制台已经审核变更进入")
    @RequestMapping(value = "/getDrugChangeReportMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DrugReportMemberListDto>> getDrugChangeReportMemberList(DrugReportMemberListParam param) {
        if (StringUtils.isEmpty(param.getReportId())) {
            return CommonResult.failed("ReportId不能为空");
        }
        List<DrugReportMember> list = drugReportService.getDrugReportMemberList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(drugReportService.drugChangeReportMemberListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("部门申报变更-2020-12-5")
    @RequestMapping(value = "/getShopDrugChangeReportMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DrugReportMemberListDto>> getShopDrugChangeReportMemberList(ShopDrugReportMemberListParam param) {
        List<DrugReportMember> list = drugReportService.getShopDrugReportMemberList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(drugReportService.drugChangeReportMemberListToDto(list));
        return CommonResult.success(commonPage);
    }


    @ApiOperation("获取变更指定人员信息，id是记录行id，不是人员id")
    @RequestMapping(value = "/getMemberRecord/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UpdateMemberRecordDto> getMemberRecord(@PathVariable String id) {
        UpdateMemberRecordDto dto = memberRecordService.getDrugMemberRecordDto(id);
        return CommonResult.success(dto);
    }


    @ApiOperation("修改变更指定人员信息")
    @RequestMapping(value = "/updateMemberRecord", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody UpdateMemberRecordDto UpdateMemberRecordDto) {
        if (StringUtils.isEmpty(UpdateMemberRecordDto.getMemberId())) {
            return CommonResult.failed("MemberId不能为空");
        }
        if (StringUtils.isEmpty(UpdateMemberRecordDto.getReportId())) {
            return CommonResult.failed("ReportId不能为空");
        }
        if (StringUtils.isEmpty(UpdateMemberRecordDto.getChangeReason())) {
            return CommonResult.failed("变更原因不能为空");
        }
        int count = memberRecordService.updateMemberRecord(UpdateMemberRecordDto);
        if (count == -1) {
            return CommonResult.failed("没有找到人员信息");
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "是否有审核权限")
    @RequestMapping(value = "/isCanSH", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult isCanSH() {
        List<UmsMenu> list = roleService.getMenuList(drugReportService.getCurrentAdminUser().getUmsAdmin().getId());
        if (list.stream().anyMatch(x -> x.getTitle().contains("药监审核"))) {
            return CommonResult.success(true);
        }
        return CommonResult.success(false);
    }

    @ApiOperation(value = "是否在变更中")
    @RequestMapping(value = "/isChangeStatus", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult isChangeStatus(String shopId) {
        List<MemberRecord> list = memberRecordService.getMemberRecordListByShopId(shopId);
        if (list.stream().anyMatch(x -> x.getStatus().equals(0))) {
            return CommonResult.success(true);//变更中
        }
        return CommonResult.success(false);
    }

    @ApiOperation("提交变更")
    @RequestMapping(value = "/sureChanges", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult sureChanges(String shopId) {
        Boolean result = drugReportService.sureChanges(shopId);
        if (result) {
            return CommonResult.success("提交成功");
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("撤销变更")
    @RequestMapping(value = "/cancelChanges", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult cancelChanges(String shopId) {
        Boolean result = drugReportService.cancelChanges(shopId);
        if (result) {
            return CommonResult.success("提交成功");
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("撤销提交的变更")
    @RequestMapping(value = "/cancelSureChanges", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult cancelSureChanges(String reportId) {
        Boolean result = drugReportService.cancelSureChanges(reportId);
        if (result) {
            return CommonResult.success("提交成功");
        } else {
            return CommonResult.failed();
        }
    }


    @ApiOperation("获取搜索中操作员的下拉框取值")
    @RequestMapping(value = "/getAllOperator", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllOperator() {
        List<SelectDto> dto = memberService.getAllOperator();
        return CommonResult.success(dto);
    }

    @ApiOperation("导出药监技术结果")
    @RequestMapping(value = "/exportDrugCountList", method = RequestMethod.GET)
    @ResponseBody
    public void exportDrugCountList(HttpServletRequest request, HttpServletResponse response) {
        List<DrugCount> list = drugReportService.getDrugCountAll();
        List<ReportDrugCountDto> listDto = Collections.synchronizedList(new ArrayList<>());
        list.parallelStream().forEach(x->{
            ReportDrugCountDto dto = new ReportDrugCountDto();
            if (Objects.nonNull(x)) {
                dto.setChineseMedicine("有");
                if (x.getChineseMedicine().equals(0)) {
                    dto.setChineseMedicine("无");
                }
                dto.setLongRange("有");
                if (x.getLongRange().equals(0)) {
                    dto.setLongRange("无");
                }

                dto.setSubjection("市区");
                if (x.getSubjection().equals(2)) {
                    dto.setSubjection("乡镇");
                }
                if (x.getSubjection().equals(3)) {
                    dto.setSubjection("村");
                }
                dto.setArea(x.getArea());
                dto.setMechanic(x.getMechanic());
                dto.setPharmacist(x.getPharmacist());
                dto.setPraPharmacist(x.getPraPharmacist());
                dto.setPraChinesePharmacist(x.getPraChinesePharmacist());
                Organization organization = organizationMapper.selectByPrimaryKey(x.getShopId());
                if (organization != null) {
                    dto.setShopName(organization.getCodeitemdesc());
                }
            }
            listDto.add(dto);
        });
        if (listDto.size() > 0) {
            ExportExcel<ReportDrugCountDto> ee = new ExportExcel<ReportDrugCountDto>();
            String[] headers = {"门店", "行政隶属", "有无中药", "是否远程", "经营面积", "执业药师", "执业中药师", "药师", "技工"};
            String fileName = new Date().toLocaleString();
            String shopName = "药监计算结果";
            ee.exportExcel(headers, listDto, shopName, fileName, response);
        }
    }
}
