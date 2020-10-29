package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.Member;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsRole;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.UmsMenuService;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 组织人员管理ontroller
 * Created by macro on 2020/2/4.
 */
@Controller
@Api(tags = "MemberController", description = "组织人员管理")
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @ApiOperation("组织机构")
    @RequestMapping(value = "/getAllDepartment", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DepartmentDto>> list() {
        List<DepartmentDto> result = memberService.getAllDepartment();
        return CommonResult.success(result);
    }

    @ApiOperation("获取指定分类信息")
    @RequestMapping(value = "/getCodeItem/{key}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CodeItemDto>> getCodeItem(@PathVariable String key) {
        List<CodeItemDto> dto = memberService.getCodeItemDtoByKey(key);
        return CommonResult.success(dto);
    }

    @ApiOperation("人员管理列表")
    @RequestMapping(value = "/getMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberListDto>> list(MemberListParam param) {
        List<Member> list = memberService.getMemberList(param);
        CommonPage commonPage = CommonPage.restPage(list);
        commonPage.setList(memberService.MemberListToDto(list));
        return CommonResult.success(commonPage);
    }

    @ApiOperation("获取指定人员信息")
    @RequestMapping(value = "/member/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UpdateMemberDto> getUpdateMember(@PathVariable String id) {
        UpdateMemberDto dto = memberService.getUpdateMember(id);
        return CommonResult.success(dto);
    }


    @ApiOperation("修改指定人员信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody UpdateMemberDto updateMemberDto) {
        if (StringUtils.isEmpty(updateMemberDto.getId())){
            CommonResult.failed("Id不能为空");
        }
        int count = memberService.updateMember(updateMemberDto);
        if (count == -1){
            return CommonResult.failed("没有找到定人员信息");
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取人员搜索中的门店(人员修改的药监门店)下拉框取值")
    @RequestMapping(value = "/getShopSelect", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getShopSelect() {
        List<SelectDto> dto = memberService.getAllShopName();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员搜索中专业的下拉框取值")
    @RequestMapping(value = "/getMajorSelect", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllmajor() {
        List<SelectDto> dto = memberService.getAllmajor();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员搜索中职称的下拉框取值")
    @RequestMapping(value = "/getAllTitle", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllTitle() {
        List<SelectDto> dto = memberService.getAllTitle();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中药监上报职称下拉框取值")
    @RequestMapping(value = "/getDrugTitleSelect", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllDrugTitle() {
        List<SelectDto> dto = memberService.getAllDrugTitle();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中药监编制职称下拉框取值")
    @RequestMapping(value = "/getDrugOrgSelect", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllDrugOrg() {
        List<SelectDto> dto = memberService.getAllDrugOrg();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中药监学历下拉框取值")
    @RequestMapping(value = "/getMemberEducation/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllmajor(@PathVariable String id) {
        List<SelectDto> dto = memberService.getMemberEducation(id);
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中岗位（搜索中的职务）下拉框取值")
    @RequestMapping(value = "/getDrugPosition", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getDrugPosition() {
        List<SelectDto> dto = memberService.getAllDrugPosition();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中药监专业下拉框取值")
    @RequestMapping(value = "/getMemberMajor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getMemberMajor(@PathVariable String id) {
        List<SelectDto> dto = memberService.getMemberMajor(id);
        return CommonResult.success(dto);
    }
}
