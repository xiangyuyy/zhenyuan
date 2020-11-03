package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.dto.memberInfor.MemberInforDto;
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

import java.util.ArrayList;
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

    @ApiOperation("门店组织机构")
    @RequestMapping(value = "/getAllDepartmentShop", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DepartmentShopDto>> getAllDepartmentShop() {
        List<DepartmentShopDto> result = memberService.getAllDepartmentShop();
        return CommonResult.success(result);
    }

    @ApiOperation("获取指定分列表信息")
    @RequestMapping(value = "/getCodeItemList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CodeItemListDto>> getCodeItemList() {
        List<CodeItemListDto> dto = new ArrayList<>();
        //性别
         String MEMBER_AX = "AX";
        CodeItemListDto  codeItemListDto = new CodeItemListDto();
        codeItemListDto.setTitle("性别");
        codeItemListDto.setKey(MEMBER_AX);
        dto.add(codeItemListDto);
        //民族
         String MEMBER_AE = "AE";
        CodeItemListDto  codeItemListDto1 = new CodeItemListDto();
        codeItemListDto1.setTitle("民族");
        codeItemListDto1.setKey(MEMBER_AE);
        dto.add(codeItemListDto1);
        //籍贯
         String MEMBER_AB = "AB";
        CodeItemListDto  codeItemListDto2 = new CodeItemListDto();
        codeItemListDto2.setTitle("籍贯");
        codeItemListDto2.setKey(MEMBER_AB);
        dto.add(codeItemListDto2);
        //户口性质
         String MEMBER_HP = "HP";
        CodeItemListDto  codeItemListDto3 = new CodeItemListDto();
        codeItemListDto3.setTitle("户口性质");
        codeItemListDto3.setKey(MEMBER_HP);
        dto.add(codeItemListDto3);

        //人员类别  离职前类别
        String MEMBER_XL = "XL";
        CodeItemListDto  codeItemListDto4 = new CodeItemListDto();
        codeItemListDto4.setTitle("人员类别  离职前类别");
        codeItemListDto4.setKey(MEMBER_XL);
        dto.add(codeItemListDto4);
        //学历
         String MEMBER_AM = "AM";
        CodeItemListDto  codeItemListDto5 = new CodeItemListDto();
        codeItemListDto5.setTitle("学历");
        codeItemListDto5.setKey(MEMBER_AM);
        dto.add(codeItemListDto5);

        //学历性质
        String MEMBER_DC = "DC";
        CodeItemListDto  codeItemListDto6 = new CodeItemListDto();
        codeItemListDto6.setTitle("学历性质");
        codeItemListDto6.setKey(MEMBER_DC);
        dto.add(codeItemListDto6);

        //所学专业
        String MEMBER_AI = "AI";
        CodeItemListDto  codeItemListDto7 = new CodeItemListDto();
        codeItemListDto7.setTitle("所学专业");
        codeItemListDto7.setKey(MEMBER_AI);
        dto.add(codeItemListDto7);

        //合同类型
        String MEMBER_BT = "BT";
        CodeItemListDto  codeItemListDto8 = new CodeItemListDto();
        codeItemListDto8.setTitle("合同类型");
        codeItemListDto8.setKey(MEMBER_BT);
        dto.add(codeItemListDto8);

        //政治面貌
         String MEMBER_AT = "AT";
        CodeItemListDto  codeItemListDto9 = new CodeItemListDto();
        codeItemListDto9.setTitle("政治面貌");
        codeItemListDto9.setKey(MEMBER_AT);
        dto.add(codeItemListDto9);

        //异常类型
         String MEMBER_CA = "CA";
        CodeItemListDto  codeItemListDto10 = new CodeItemListDto();
        codeItemListDto10.setTitle("异常类型");
        codeItemListDto10.setKey(MEMBER_CA);
        dto.add(codeItemListDto10);

        //离职原因
         String MEMBER_DK = "DK";
        CodeItemListDto  codeItemListDto11 = new CodeItemListDto();
        codeItemListDto11.setTitle("离职原因");
        codeItemListDto11.setKey(MEMBER_DK);
        dto.add(codeItemListDto11);

        //离退类别
         String MEMBER_HD = "HD";
        CodeItemListDto  codeItemListDto12 = new CodeItemListDto();
        codeItemListDto12.setTitle("离退类别");
        codeItemListDto12.setKey(MEMBER_HD);
        dto.add(codeItemListDto12);

        //返聘类别
        String MEMBER_YD = "YD";
        CodeItemListDto  codeItemListDto13 = new CodeItemListDto();
        codeItemListDto13.setTitle("返聘类别");
        codeItemListDto13.setKey(MEMBER_YD);
        dto.add(codeItemListDto13);

        //药监上报职称
         String DRUG_SBZC = "SBZC";
        CodeItemListDto  codeItemListDto15 = new CodeItemListDto();
        codeItemListDto15.setTitle("药监上报职称");
        codeItemListDto15.setKey(DRUG_SBZC);
        dto.add(codeItemListDto15);

        //药监编制职称
        String DRUG_BZZC = "BZZC";
        CodeItemListDto  codeItemListDto16 = new CodeItemListDto();
        codeItemListDto16.setTitle("药监编制职称");
        codeItemListDto16.setKey(DRUG_BZZC);
        dto.add(codeItemListDto16);

        //药监岗位
        String DRUG_DRGW = "DRGW";
        CodeItemListDto  codeItemListDto17 = new CodeItemListDto();
        codeItemListDto17.setTitle("药监岗位");
        codeItemListDto17.setKey(DRUG_DRGW);
        dto.add(codeItemListDto17);

        return CommonResult.success(dto);
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

    @ApiOperation("人员详情信息")
    @RequestMapping(value = "/getMemberInfor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<MemberInforDto> getMemberInforDto(@PathVariable String id) {
        MemberInforDto dto = memberService.getMemberInforDto(id);
        return CommonResult.success(dto);
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


    @ApiOperation("获取人员搜索中学历的下拉框取值")
    @RequestMapping(value = "/getAllEducation", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllEducation() {
        List<SelectDto> dto = memberService.getAllEducation();
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
