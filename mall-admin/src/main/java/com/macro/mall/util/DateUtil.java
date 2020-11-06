package com.macro.mall.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static String getFormatString(Date date){
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format0.format(date.getTime());
        return time;
    }

    public static Date getDateBeforeOneDay(Date date){
        Calendar c = Calendar.getInstance();

        c.setTime(date);

        c.add(Calendar.DAY_OF_MONTH, -1);

        Date date1 = c.getTime();

        return date1;
    }

    public static Date getDateAddOneDay(Date date){
        Calendar c = Calendar.getInstance();

        c.setTime(date);

        c.add(Calendar.DAY_OF_MONTH, 1);

        Date date1 = c.getTime();

        return date1;
    }

}
