package com.macro.mall.service;

import com.macro.mall.dto.MemberListParam;
import com.macro.mall.model.Codeitem;
import com.macro.mall.model.Member;

import java.util.List;

/**
 *codeitem Service
 * Created by macro on 2018/4/26.
 */
public interface CodeItemService {
    /**
     * codesetid AK获得枚举
     */
    List<Codeitem> getCodeitemBySetId(String codesetid);

    /**
     *s 所有枚举信息
     */
    List<Codeitem> getAllCodeitem();

    /**
     *s 获得唯一枚举信息
     */
    Codeitem getOneCodeitem(String codesetid,String codeitemid);

    Boolean addOrUpdateItem(String codesetid, String codeitemid, String codeitemdesc);


}
