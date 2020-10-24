package com.macro.mall.dao;

import com.macro.mall.dto.MemberListParam;
import com.macro.mall.model.Member;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *人员信息
 * Created by macro on 2020/2/2.
 */
public interface MemberDao {
    /**
     * 获得人员信息
     */
    List<Member> getMemberList(MemberListParam param);
}
