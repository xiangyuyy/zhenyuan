package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.DrugCount;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberRecord;
import com.macro.mall.model.VReport;
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
import java.util.*;
import java.util.stream.Collectors;

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
        MemberListParam param1 = new MemberListParam();
        param1.setName(param.getName());
        List<Member> memberId = memberService.getAllMemberList(param1);
        List<String> memberIds = new ArrayList<>();
        memberId.forEach(x->{
            memberIds.add(x.getId().toString());
        });
        param.setMemberIds(memberIds);
        List<MemberRecord> list = memberRecordService.getShopMemberRecordList(param,true);
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
        List<Member> list = memberService.getsjxgMemberList(param, true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
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
        List<Member> list = memberService.getbdxgMemberList(param, true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
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
        List<Member> list = memberService.getbzxtMemberList(param, true);
        CommonPage commonPage = CommonPage.restPage(list);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
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

    @ApiOperation("高于编制人员")
    @RequestMapping(value = "/getgybzMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<VReport>> getgybzMemberList(VReportListParam param) {
        List<VReport> list = memberService.getgybzMemberList(param, true);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(list);
        return CommonResult.success(commonPage);
    }

    @ApiOperation("导出实际虚挂人员")
    @RequestMapping(value = "/exportsjxgMemberList", method = RequestMethod.GET)
    public void exportsjxgMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getsjxgMemberList(param, false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            if (listDtos.size() > 0) {
                ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
                String[] headers = {"实际门店", "药监门店（虚挂）", "姓名", "身份证号码 ", "性别 "};
                String fileName = new Date().toLocaleString();
                String shopName = "实际虚挂人员";
                ee.exportExcel(headers, listDtos, shopName, fileName, response);
            }
        }
    }

    @ApiOperation("导出本店虚挂人员")
    @RequestMapping(value = "/exportbdxgMemberList", method = RequestMethod.GET)
    public void exportbdxgMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getbdxgMemberList(param, false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            if (listDtos.size() > 0) {
                ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
                String[] headers = {"虚挂人员实际门店", "门店名称", "姓名", "身份证号码 ", "性别 "};
                String fileName = new Date().toLocaleString();
                String shopName = "本店虚挂人员";
                ee.exportExcel(headers, listDtos, shopName, fileName, response);
            }
        }
    }

    @ApiOperation("导出编制相同人员")
    @RequestMapping(value = "/exportbzxtMemberList", method = RequestMethod.GET)
    public void exportbzxtMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        ReportMemberListParam param = new ReportMemberListParam();
        param.setShopId(shopId);
        List<Member> list = memberService.getbzxtMemberList(param, false);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        List<ReportMemberListDto> listDtos = new ArrayList<>();
        result.stream().forEach(x -> {
            ReportMemberListDto dto = new ReportMemberListDto();
            dto.setDrugShopName(x.getDrugShopName());
            dto.setIdCard(x.getIdCard());
            dto.setSex(x.getSex());
            dto.setShopName(x.getShopName());
            dto.setName(x.getName());
            listDtos.add(dto);
        });

        if (!StringUtils.isEmpty(shopId)) {
            if (listDtos.size() > 0) {
                ExportExcel<ReportMemberListDto> ee = new ExportExcel<ReportMemberListDto>();
                String[] headers = {"实际门店", "虚挂门店", "姓名", "身份证号码 ", "性别 "};
                String fileName = new Date().toLocaleString();
                String shopName = "实际与编制相同人员";
                ee.exportExcel(headers, listDtos, shopName, fileName, response);
            }
        }
    }

    @ApiOperation("导出高于编制人员")
    @RequestMapping(value = "/exportgybzMemberList", method = RequestMethod.GET)
    public void exportgybzMemberList(HttpServletRequest request, HttpServletResponse response, String shopId) {
        VReportListParam param = new VReportListParam();
        List<String> shopIds = new ArrayList<>();
        if (shopId.equals("undefined")){
            shopId = null;
        }
        if (StringUtils.isNotEmpty(shopId)) {
            shopIds.add(shopId);
        }
        param.setShopId(shopId);
        List<VReport> list = memberService.getgybzMemberList(param, false);
        List<ExportVRportDto> listDtos = new ArrayList<>();
        list.stream().forEach(x -> {
            ExportVRportDto dto = new ExportVRportDto();
            dto.setShopname(x.getShopname());
            dto.setType(x.getType());
            dto.setNum(x.getNum());
            dto.setNownum(x.getNownum());
            dto.setDiff(x.getDiff());

            DrugCount drugCount = drugReportService.getDrugCountByShopId(x.getShopId());
            if (Objects.nonNull(drugCount)) {
                dto.setArea(drugCount.getArea());
                dto.setChineseMedicine("有");
                if (drugCount.getChineseMedicine().equals(0)) {
                    dto.setChineseMedicine("无");
                }
                dto.setLongRange("有");
                if (drugCount.getLongRange().equals(0)) {
                    dto.setLongRange("无");
                }

                dto.setSubjection("市区");
                if (drugCount.getSubjection().equals(2)) {
                    dto.setSubjection("乡镇");
                }
                if (drugCount.getSubjection().equals(3)) {
                    dto.setSubjection("村");
                }
            }
            listDtos.add(dto);
        });
        if (listDtos.size() > 0) {
            ExportExcel<ExportVRportDto> ee = new ExportExcel<ExportVRportDto>();
            String[] headers = {"门店", "行政隶属", "有无中药", "是否远程", "经营面积", "编制要求职称", "编制要求职称对应人数", "实际配置人数", "差异"};
            String fileName = new Date().toLocaleString();
            String shopName = "实际高于编制";
            ee.exportExcel(headers, listDtos, shopName, fileName, response);
        }
    }

    @ApiOperation("导出部门申报变更记录查询列表")
    @RequestMapping(value = "/exportShopMemberRecordList", method = RequestMethod.GET)
    public void exportgybzMemberList(HttpServletRequest request, HttpServletResponse response, ShopMemberRecordListParam param) {
        MemberListParam param1 = new MemberListParam();
        param1.setName(param.getName());
        List<Member> memberId = memberService.getAllMemberList(param1);
        List<String> memberIds = new ArrayList<>();
        memberId.forEach(x->{
            memberIds.add(x.getId().toString());
        });
        param.setMemberIds(memberIds);
        List<MemberRecord> list = memberRecordService.getShopMemberRecordList(param,false);
        List<ReportMemberRecordListDto> listDto = Collections.synchronizedList(new ArrayList<>());
        memberRecordService.memberRecordListToDto(list).parallelStream().forEach(x -> {
            ReportMemberRecordListDto dto = new ReportMemberRecordListDto();
            dto.setAge(x.getAge());
            dto.setName(x.getName());
            dto.setBirthday(x.getBirthday());
            dto.setChangeReason(x.getChangeReason());
            dto.setCreateTime(x.getCreateTime());
            dto.setDrugEducation(x.getDrugEducation());
            dto.setDrugMajor(x.getDrugMajor());
            dto.setDrugTitle(x.getDrugTitle());
            dto.setDrugPositionAll(x.getDrugPositionAll());
            dto.setWorkTime(x.getWorkTime());
            dto.setShopName(x.getShopName());
            dto.setDrugShopName(x.getDrugShopName());
            dto.setReportId(x.getReportId());
            dto.setSex(x.getSex());
            dto.setIdCard(x.getIdCard());
            dto.setEducationStatus("是");
            dto.setHealthStatus("健康");
            dto.setTrainStatus("是");
            listDto.add(dto);
        });
        if (listDto.size() > 0) {
            ExportExcel<ReportMemberRecordListDto> ee = new ExportExcel<ReportMemberRecordListDto>();
            String[] headers = {"单号", "门店","药监门店","姓名", "变更原因", "变更时间", "身份证号码", "性别", "出生年月", "年龄", "药监职称", "药监学历", "药监专业", "职务或岗位集合", "参加专业工作时间", "健康状况", "是否继续教育", "是否参加培训"};
            String fileName = new Date().toLocaleString();
            String shopName = "申报变更记录";
            ee.exportExcel(headers, listDto, shopName, fileName, response);
        }
    }
}
