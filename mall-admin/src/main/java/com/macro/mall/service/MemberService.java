package com.macro.mall.service;

import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.Member;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
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
}
