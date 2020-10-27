package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.Member;
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

}
