package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberRecord;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberRecordService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.ExportExcel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 数据报表查询ontroller
 * Created by macro on 2020/2/4.
 */
@Controller
@Api(tags = "DataReportController", description = "数据报表查询")
@RequestMapping("/dataReport")
public class DataReportController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private DrugReportService drugReportService;

    @Autowired
    private MemberRecordService memberRecordService;


    @ApiOperation("人员变更历史列表")
    @RequestMapping(value = "/getMemberRecordList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberRecordListDto>> list(MemberRecordListParam param) {
        List<MemberRecord> list = memberRecordService.getMemberRecordList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(memberRecordService.memberRecordListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("人员变更历史列表头部信息")
    @RequestMapping(value = "/member/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<MemberListDto> getMemberRecordListHead(@PathVariable String memberId) {
        MemberListDto dto = memberService.getMemberToDto(memberId);
        return CommonResult.success(dto);
    }

    @ApiOperation("部门申报变更记录查询列表")
    @RequestMapping(value = "/getShopMemberRecordList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberRecordListDto>> list(ShopMemberRecordListParam param) {
        List<MemberRecord> list = memberRecordService.getShopMemberRecordList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(memberRecordService.memberRecordListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("实际虚挂人员")
    @RequestMapping(value = "/getsjxgMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<ReportMemberListDto>> getsjxgMemberList(ReportMemberListParam param) {
        if (StringUtils.isEmpty(param.getShopId())) {
            return CommonResult.failed("请选择门店");
        }
        List<Member> list = memberService.getsjxgMemberList(param,true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });
        commonPage.setList(listDtos);
        return CommonResult.success(commonPage);
    }

    @ApiOperation("本店虚挂人员")
    @RequestMapping(value = "/getbdxgMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<ReportMemberListDto>> getbdxgMemberList(ReportMemberListParam param) {
        if (StringUtils.isEmpty(param.getShopId())) {
            return CommonResult.failed("请选择门店");
        }
        List<Member> list = memberService.getbdxgMemberList(param,true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });
        commonPage.setList(listDtos);
        return CommonResult.success(commonPage);
    }

    @ApiOperation("编制相同人员")
    @RequestMapping(value = "/getbzxtMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<ReportMemberListDto>> getbzxtMemberList(ReportMemberListParam param) {
        if (StringUtils.isEmpty(param.getShopId())) {
            return CommonResult.failed("请选择门店");
        }
        List<Member> list = memberService.getbzxtMemberList(param,true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });
        commonPage.setList(listDtos);
        return CommonResult.success(commonPage);
    }

    @ApiOperation("导出实际虚挂人员")
    @RequestMapping(value = "/exportsjxgMemberList", method = RequestMethod.GET)
    public void exportSpecialDrugReport(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getsjxgMemberList(param,false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
            String[] headers = {"实际门店","药监门店（虚挂）","姓名","身份证号码 ", "性别 "};
            String fileName = new Date().toLocaleString();
            String shopName  = "实际虚挂人员";
            ee.exportExcel(headers, listDtos, shopName,fileName, response);
        }
    }

    @ApiOperation("导出本店虚挂人员")
    @RequestMapping(value = "/exportbdxgMemberList", method = RequestMethod.GET)
    public void exportbdxgMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getbdxgMemberList(param,false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
            String[] headers = {"虚挂人员实际门店","门店名称","姓名","身份证号码 ", "性别 "};
            String fileName = new Date().toLocaleString();
            String shopName  = "本店虚挂人员";
            ee.exportExcel(headers, listDtos, shopName,fileName, response);
        }
    }

    @ApiOperation("导出编制相同人员")
    @RequestMapping(value = "/exportbzxtMemberList", method = RequestMethod.GET)
    public void exportbzxtMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getbzxtMemberList(param,false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x->{
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
            String[] headers = {"实际门店","虚挂门店","姓名","身份证号码 ", "性别 "};
            String fileName = new Date().toLocaleString();
            String shopName  = "实际与编制相同人员";
            ee.exportExcel(headers, listDtos, shopName,fileName, response);
        }
    }

}
