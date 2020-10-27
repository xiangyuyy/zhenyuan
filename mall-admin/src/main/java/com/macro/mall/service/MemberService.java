package com.macro.mall.service;

import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
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

    Member getMember(Long id );

    List<Organization> getAllOrganizationList();

    List<SelectDto> getAllShopName();

    List<SelectDto> getAllmajor();

    List<SelectDto> getAllDrugPosition();

    List<SelectDto> getAllDrugTitle();

    List<SelectDto> getAllDrugOrg();

    List<SelectDto> getItemSelectDtoByType(String type);

    List<SelectDto> getMemberEducation(String relationId);

    List<SelectDto> getMemberMajor(String relationId);

    List<MemberListDto> MemberListToDto(List<Member> list);

    int updateMember(UpdateMemberDto updateMemberDto);

}
