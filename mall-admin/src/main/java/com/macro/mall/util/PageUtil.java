package com.macro.mall.util;

import com.macro.mall.dto.ListParam;

public class PageUtil {
    public static void init(ListParam param){
        if (param.getPageNum() == null){
            param.setPageNum(1);
        }
        if (param.getPageSize() == null){
            param.setPageSize(10);
        }
    }
}
