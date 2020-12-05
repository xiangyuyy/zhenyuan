package com.macro.mall.service;

import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
import com.macro.mall.dto.memberInfor.MemberBaseInforDto;
import com.macro.mall.dto.memberInfor.MemberInforDto;
import com.macro.mall.model.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *人员Service
 * Created by macro on 2018/4/26.
 */
public interface MemberService {
    /**
     * 获得人员信息
     */
    List<Member> getMemberList(MemberListParam param);

    /**
     *s 所有人员信息
     */
    List<Member> getAllMemberList();

    List<DepartmentDto> getAllDepartment();

    List<DepartmentShopDto> getAllDepartmentShop();

    Member getMember(String id );

    UpdateMemberDto getUpdateMember(String id );

    List<Organization> getAllOrganizationList();

    List<SelectDto> getAllShopName();

    List<SelectDto> getAllmajor();

    List<SelectDto> getAllTitle();

    List<SelectDto> getAllOperator();

    List<SelectDto> getAllDrugPosition();

    List<SelectDto> getAllDrugTitle();

    List<SelectDto> getAllDrugOrg();

    List<SelectDto> getAllEducation();

    List<SelectDto> getAllDrugChangeReason();

    List<SelectDto> getItemSelectDtoByType(String type);

    List<SelectDto> getMemberEducation(String id);

    List<SelectDto> getMemberMajor(String id);

    List<VZhicheng> getMemberVZhichengr(String id);


    List<MemberListDto> MemberListToDto(List<Member> list);

    MemberListDto  getMemberToDto(String id);

    int updateMember(UpdateMemberDto updateMemberDto);

    List<CodeItemDto> getCodeItemDtoByKey(String key);

    Boolean updateOrAddCodeItem(CodeItemDto codeItemDto);

    Boolean deleteCodeItem(CodeItemDto codeItemDto);

    MemberInforDto getMemberInforDto(String id);

}
