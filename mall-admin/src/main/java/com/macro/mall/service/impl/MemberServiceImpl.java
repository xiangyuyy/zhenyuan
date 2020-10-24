package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.SelectDto;
import com.macro.mall.mapper.MemberMapper;
import com.macro.mall.mapper.OrganizationMapper;
import com.macro.mall.mapper.Usra01Mapper;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class MemberServiceImpl implements MemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private Usra01Mapper usra01Mapper;

    @Autowired
    private CodeItemService codeItemService;


    @Override
    public List<Member> getMemberList(MemberListParam param) {
        PageUtil.init(param);
        //PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return memberDao.getMemberList(param);
    }

    @Override
    public List<Member> getAllMemberList() {
        MemberExample memberExample = new MemberExample();
        return memberMapper.selectByExample(memberExample);
    }

    @Override
    public List<Organization> getAllOrganizationList() {
        OrganizationExample organizationExample = new OrganizationExample();
        return organizationMapper.selectByExample(organizationExample);
    }

    @Override
    public List<SelectDto> getAllShopName() {
        return null;
    }

    @Override
    public List<SelectDto> getAllmajor() {
        List<String> list = memberDao.getAllmajor();
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x->{
            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x);
            selectDto.setLabel(x);
            dtoList.add(selectDto);
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getAllPosition() {
        List<Codeitem> list = codeItemService.getCodeitemBySetId(BaseConst.DRUG_GW);
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x->{
            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x.getCodeitemid());
            selectDto.setLabel(x.getCodeitemdesc());
            dtoList.add(selectDto);
        });
        return dtoList;
    }

    @Override
    public List<MemberDao> changeToDto(List<Member> list) {
        return null;
    }

    @Override
    public int updateMember(Member member) {
        return memberMapper.updateByPrimaryKeySelective(member);
    }
}
