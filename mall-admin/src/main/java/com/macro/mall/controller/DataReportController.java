package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.Member;
import com.macro.mall.model.MemberRecord;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberRecordService;
import com.macro.mall.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
