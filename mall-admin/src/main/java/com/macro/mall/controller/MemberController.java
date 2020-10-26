package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.MemberListDto;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.UmsMenuNode;
import com.macro.mall.model.Member;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.UmsMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("人员管理列表")
    @RequestMapping(value = "/getMemberList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberListDto>> list(MemberListParam param) {
        List<Member> list = memberService.getMemberList(param);
        List<MemberListDto> result = memberService.MemberListToDto(list);
        return CommonResult.success(CommonPage.restPage(result));
    }

}
