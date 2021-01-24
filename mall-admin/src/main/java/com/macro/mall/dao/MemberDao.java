package com.macro.mall.dao;

import com.macro.mall.dto.AddReportMemberListParam;
import com.macro.mall.dto.DrugReportListParam;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.ReportMemberListParam;
import com.macro.mall.model.DrugReport;
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
     * 查询获得人员信息
     */
    List<Member> getMemberList(MemberListParam param);

    /**
     * 查询获得人员的专业
     */
    List<String> getAllmajor();


    /**
     * 查询获得人员的职称
     */
    List<String> getAllTitle();

    /**
     * 查询药监新增列表人员信息
     */
    List<Member> getAddReportMemberList(AddReportMemberListParam param);


    List<Member> getsjxgMemberList(@Param("shopId")String shopId);

    List<Member> getbdxgMemberList(@Param("shopId")String shopId);

    List<Member> getbzxtMemberList(@Param("shopId")String shopId);

}
