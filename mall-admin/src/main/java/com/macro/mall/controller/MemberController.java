package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.dto.memberInfor.MemberInforDto;
import com.macro.mall.model.Member;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsRole;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.NZYService;
import com.macro.mall.service.UmsMenuService;
import com.macro.mall.util.ExcelRead;
import com.macro.mall.util.ExportExcel;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

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

    @Autowired
    NZYService nzyService;


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

    @ApiOperation("导入")
    @RequestMapping(value = "/importMember", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult importMember(MultipartFile file) {
        List<ArrayList<String>> readExcel = null;
        try {
            readExcel = ExcelRead.readExcel(file);
            if (readExcel == null) {
                return CommonResult.failed();
            }
            for (ArrayList<String> arrayList : readExcel) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return CommonResult.success(1);
    }

    @ApiOperation("获取指定分列表信息")
    @RequestMapping(value = "/getCodeItemList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CodeItemListDto>> getCodeItemList() {
        List<CodeItemListDto> dto = new ArrayList<>();
        //性别
        String MEMBER_AX = "AX";
        CodeItemListDto codeItemListDto = new CodeItemListDto();
        codeItemListDto.setTitle("性别");
        codeItemListDto.setKey(MEMBER_AX);
        dto.add(codeItemListDto);
        //民族
        String MEMBER_AE = "AE";
        CodeItemListDto codeItemListDto1 = new CodeItemListDto();
        codeItemListDto1.setTitle("民族");
        codeItemListDto1.setKey(MEMBER_AE);
        dto.add(codeItemListDto1);
        //籍贯
        String MEMBER_AB = "AB";
        CodeItemListDto codeItemListDto2 = new CodeItemListDto();
        codeItemListDto2.setTitle("籍贯");
        codeItemListDto2.setKey(MEMBER_AB);
        dto.add(codeItemListDto2);
        //户口性质
        String MEMBER_HP = "HP";
        CodeItemListDto codeItemListDto3 = new CodeItemListDto();
        codeItemListDto3.setTitle("户口性质");
        codeItemListDto3.setKey(MEMBER_HP);
        dto.add(codeItemListDto3);

        //人员类别  离职前类别
        String MEMBER_XL = "XL";
        CodeItemListDto codeItemListDto4 = new CodeItemListDto();
        codeItemListDto4.setTitle("人员类别  离职前类别");
        codeItemListDto4.setKey(MEMBER_XL);
        dto.add(codeItemListDto4);
        //学历
        String MEMBER_AM = "AM";
        CodeItemListDto codeItemListDto5 = new CodeItemListDto();
        codeItemListDto5.setTitle("学历");
        codeItemListDto5.setKey(MEMBER_AM);
        dto.add(codeItemListDto5);

        //学历性质
        String MEMBER_DC = "DC";
        CodeItemListDto codeItemListDto6 = new CodeItemListDto();
        codeItemListDto6.setTitle("学历性质");
        codeItemListDto6.setKey(MEMBER_DC);
        dto.add(codeItemListDto6);

        //所学专业
        String MEMBER_AI = "AI";
        CodeItemListDto codeItemListDto7 = new CodeItemListDto();
        codeItemListDto7.setTitle("所学专业");
        codeItemListDto7.setKey(MEMBER_AI);
        dto.add(codeItemListDto7);

        //合同类型
        String MEMBER_BT = "BT";
        CodeItemListDto codeItemListDto8 = new CodeItemListDto();
        codeItemListDto8.setTitle("合同类型");
        codeItemListDto8.setKey(MEMBER_BT);
        dto.add(codeItemListDto8);

        //政治面貌
        String MEMBER_AT = "AT";
        CodeItemListDto codeItemListDto9 = new CodeItemListDto();
        codeItemListDto9.setTitle("政治面貌");
        codeItemListDto9.setKey(MEMBER_AT);
        dto.add(codeItemListDto9);

        //异常类型
        String MEMBER_CA = "CA";
        CodeItemListDto codeItemListDto10 = new CodeItemListDto();
        codeItemListDto10.setTitle("异常类型");
        codeItemListDto10.setKey(MEMBER_CA);
        dto.add(codeItemListDto10);

        //离职原因
        String MEMBER_DK = "DK";
        CodeItemListDto codeItemListDto11 = new CodeItemListDto();
        codeItemListDto11.setTitle("离职原因");
        codeItemListDto11.setKey(MEMBER_DK);
        dto.add(codeItemListDto11);

        //离退类别
        String MEMBER_HD = "HD";
        CodeItemListDto codeItemListDto12 = new CodeItemListDto();
        codeItemListDto12.setTitle("离退类别");
        codeItemListDto12.setKey(MEMBER_HD);
        dto.add(codeItemListDto12);

        //返聘类别
        String MEMBER_YD = "YD";
        CodeItemListDto codeItemListDto13 = new CodeItemListDto();
        codeItemListDto13.setTitle("返聘类别");
        codeItemListDto13.setKey(MEMBER_YD);
        dto.add(codeItemListDto13);

        //药监上报职称
        String DRUG_SBZC = "SBZC";
        CodeItemListDto codeItemListDto15 = new CodeItemListDto();
        codeItemListDto15.setTitle("药监上报职称");
        codeItemListDto15.setKey(DRUG_SBZC);
        dto.add(codeItemListDto15);

        //药监编制职称
        String DRUG_BZZC = "BZZC";
        CodeItemListDto codeItemListDto16 = new CodeItemListDto();
        codeItemListDto16.setTitle("药监编制职称");
        codeItemListDto16.setKey(DRUG_BZZC);
        dto.add(codeItemListDto16);

        //药监岗位
        String DRUG_DRGW = "DRGW";
        CodeItemListDto codeItemListDto17 = new CodeItemListDto();
        codeItemListDto17.setTitle("药监岗位");
        codeItemListDto17.setKey(DRUG_DRGW);
        dto.add(codeItemListDto17);

        return CommonResult.success(dto);
    }


    @ApiOperation("获取2.0分类列表信息")
    @RequestMapping(value = "/getCodeItemListFor2", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CodeItemListDto>> getCodeItemListFor2() {
        List<CodeItemListDto> dto = new ArrayList<>();
        //药监上报职称
        String DRUG_SBZC = "SBZC";
        CodeItemListDto codeItemListDto15 = new CodeItemListDto();
        codeItemListDto15.setTitle("药监上报职称");
        codeItemListDto15.setKey(DRUG_SBZC);
        dto.add(codeItemListDto15);

        //药监编制职称
        String DRUG_BZZC = "BZZC";
        CodeItemListDto codeItemListDto16 = new CodeItemListDto();
        codeItemListDto16.setTitle("药监编制职称");
        codeItemListDto16.setKey(DRUG_BZZC);
        dto.add(codeItemListDto16);

        //药监岗位
        String DRUG_DRGW = "DRGW";
        CodeItemListDto codeItemListDto17 = new CodeItemListDto();
        codeItemListDto17.setTitle("药监岗位");
        codeItemListDto17.setKey(DRUG_DRGW);
        dto.add(codeItemListDto17);

        //变更理由
        String DRUG_CHANGE_REASON = "DRCR";
        CodeItemListDto codeItemListDto18 = new CodeItemListDto();
        codeItemListDto18.setTitle("变更理由");
        codeItemListDto18.setKey(DRUG_CHANGE_REASON);
        dto.add(codeItemListDto18);

        return CommonResult.success(dto);
    }

    @ApiOperation("获取指定分类信息")
    @RequestMapping(value = "/getCodeItem/{key}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CodeItemDto>> getCodeItem(@PathVariable String key) {
        List<CodeItemDto> dto = memberService.getCodeItemDtoByKey(key);
        return CommonResult.success(dto);
    }

    @ApiOperation("修改或者新增分类信息")
    @RequestMapping(value = "/updateOrAddCodeItem", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody CodeItemDto codeItemDto) {
        Boolean aBoolean = memberService.updateOrAddCodeItem(codeItemDto);
        return CommonResult.success(aBoolean);
    }

    @ApiOperation("删除分类信息")
    @RequestMapping(value = "/deleteCodeItem", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteCodeItem(@RequestBody CodeItemDto codeItemDto) {
        Boolean aBoolean = memberService.deleteCodeItem(codeItemDto);
        return CommonResult.success(aBoolean);
    }

    @ApiOperation("人员管理列表")
    @RequestMapping(value = "/getMemberList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<MemberListDto>> list(@RequestBody MemberListParam param) {
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
        if (StringUtils.isEmpty(updateMemberDto.getId())) {
            return CommonResult.failed("Id不能为空");
        }
        int count = memberService.updateMember(updateMemberDto);
        if (count == -1) {
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
        List<SelectDto> result = new ArrayList<>();
        dto.stream().forEach(x->{
            if (!x.getValue().equals("")){
                result.add(x);
            }
        });
        return CommonResult.success(result);
    }

    @ApiOperation("获取人员搜索中职称的下拉框取值")
    @RequestMapping(value = "/getAllTitle", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllTitle() {
        List<SelectDto> dto = memberService.getAllTitle();
        List<SelectDto> result = new ArrayList<>();
        SelectDto dto1 = new SelectDto();
        dto1.setLabel(" ");
        dto1.setValue(" ");
        result.add(dto1);
        dto.stream().forEach(x->{
            if (!x.getValue().equals("")){
                result.add(x);
            }
        });
        return CommonResult.success(result);
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
    @RequestMapping(value = "/getMemberDrugEducation}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getMemberDrugEducation() {
        List<SelectDto> dto = memberService.getAllEducation();
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中学历下拉框取值")
    @RequestMapping(value = "/getMemberEducation/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getMemberEducation(@PathVariable String id) {
        List<SelectDto> dto = memberService.getMemberEducation(id);
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中药监学校下拉框取值")
    @RequestMapping(value = "/getMemberDrugSchool/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getMemberDrugSchool(@PathVariable String id) {
        List<SelectDto> dto = memberService.getMemberDrugSchool(id);
        return CommonResult.success(dto);
    }

    @ApiOperation("获取人员修改中选择学历获得药监专业默认值")
    @RequestMapping(value = "/getMajorByEducation/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> getMajorByEducation(@PathVariable String id,@RequestParam("educationValue") String educationValue) {
        String value = "";
        if (StringUtils.isEmpty(educationValue)){
            return CommonResult.success(value);
        }
        List<SelectDto> dto = memberService.getMemberEducation(id);
        if (dto.size() == 0){
            return CommonResult.success(value);
        }
        List<SelectDto> dto1 = memberService.getMemberMajor(id);
        if (dto1.size() == 0){
            return CommonResult.success(value);
        }

        for (int i = 0; i <dto.size() ; i++) {
            if (dto.get(i).getValue().equals(educationValue)){
                value = dto1.get(i).getValue();
            }
        }

        return CommonResult.success(value);
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

    @ApiOperation("获取人员类别的下拉框取值")
    @RequestMapping(value = "/getPeopleKindSelect", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getPeopleKindSelect() {
        List<SelectDto> dto = memberService.getPeopleKindSelect();
        List<String> list = Arrays.asList("0104","0105","0107","0108","0501","0502","050","0504");
        dto = dto.stream().filter(x->!list.contains(x.getValue())).collect(Collectors.toList());
        return CommonResult.success(dto);
    }

    @ApiOperation("变更原因列表")
    @RequestMapping(value = "/getAllDrugChangeReason", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SelectDto>> getAllDrugChangeReason() {
        List<SelectDto> dto = memberService.getAllDrugChangeReason();
        return CommonResult.success(dto);
    }

    @ApiOperation("初始化数据")
    @RequestMapping(value = "/inintALL", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Boolean> inintALL() {
        Boolean result = nzyService.inintALL();
        return CommonResult.success(result);
    }

    @ApiOperation("更新初始化数据")
    @RequestMapping(value = "/updataALL", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Boolean> updataALL() {
        Boolean result = nzyService.updataALL();
        return CommonResult.success(result);
    }

    @ApiOperation("删除多余的人员数据")
    @RequestMapping(value = "/updataMore", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Boolean> updataMore() {
        Boolean result = nzyService.updataMore();
        return CommonResult.success(result);
    }
    @ApiOperation("导出人员管理列表")
    @RequestMapping(value = "/exportMemberList", method = RequestMethod.GET)
    @ResponseBody
    public void exportMemberList(HttpServletRequest request, HttpServletResponse response) {
        MemberListParam param1 = new MemberListParam();
        List<Member> list = memberService.getAllMemberList(param1);
        List<ReportMemberDto> listDto = Collections.synchronizedList(new ArrayList<>());
        memberService.MemberListToDto(list).parallelStream().forEach(x->{
            ReportMemberDto dto = new ReportMemberDto();
            dto.setTitle(x.getTitle());
            dto.setAge(x.getAge());
            dto.setBirthday(x.getBirthday());
            dto.setDrugEducation(x.getDrugEducation());
            dto.setDrugMajor(x.getDrugMajor());
            dto.setDrugOrg(x.getDrugOrg());
            dto.setDrugPositionAll(x.getDrugPositionAll());
            dto.setDrugShopName(x.getDrugShopName());
            dto.setDrugTitle(x.getDrugTitle());
            dto.setEducationStatus("是");
            dto.setTrainStatus("是");
            dto.setHealthStatus("健康");
            dto.setWorkTime(x.getWorkTime());
            dto.setIdCard(x.getIdCard());
            dto.setShopName(x.getShopName());
            dto.setPeopleKind(x.getPeopleKind());
            dto.setName(x.getName());
            dto.setMajor(x.getMajor());
            dto.setSex(x.getSex());
            dto.setEducation(x.getEducation());
            listDto.add(dto);
        });
        if (listDto.size() > 0) {
            ExportExcel<ReportMemberDto> ee = new ExportExcel<ReportMemberDto>();
            String[] headers = {"门店", "药监门店", "姓名", "身份证号码", "性别", "出生年月", "年龄", "职称(时间)", "学历", "专业","药监上报职称", "药监编制职称", "药监学历", "药监专业", "职务或岗位集合", "人员类别", "参加专业工作时间", "健康状况", "是否继续教育", "是否参加培训"};
            String fileName = new Date().toLocaleString();
            String shopName = "人员列表";
            ee.exportExcel(headers, listDto, shopName, fileName, response);
        }
    }
}
