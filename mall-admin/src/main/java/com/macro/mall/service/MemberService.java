package com.macro.mall.service;

import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.SelectDto;
import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
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

    List<Organization> getAllOrganizationList();

    List<SelectDto> getAllShopName();

    List<SelectDto> getAllmajor();

    List<SelectDto> getAllPosition();

    List<MemberDao> changeToDto(List<Member> list);

    int updateMember(Member member);

}
