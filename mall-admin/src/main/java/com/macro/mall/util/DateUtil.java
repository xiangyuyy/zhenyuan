package com.macro.mall.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getFormatString(Date date){
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format0.format(date.getTime());
        return time;
    }
}
