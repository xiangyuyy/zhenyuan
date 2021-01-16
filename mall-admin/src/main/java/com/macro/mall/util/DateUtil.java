package com.macro.mall.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static String getFormatString(Date date) {
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd");
        String time = format0.format(date.getTime());
        return time;
    }

    public static Date getDateBeforeOneDay(Date date) {
        Calendar c = Calendar.getInstance();

        c.setTime(date);

        c.add(Calendar.DAY_OF_MONTH, -1);

        Date date1 = c.getTime();

        return date1;
    }

    public static Date getDateAddOneDay(Date date) {
        Calendar c = Calendar.getInstance();

        c.setTime(date);

        c.add(Calendar.DAY_OF_MONTH, 1);

        Date date1 = c.getTime();

        return date1;
    }

    public static Date getFormateDate(Date date){
        if (date == null){
            return null;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String startDateStr = df.format(date);
        Date startDate = null;
        try {
            startDate = df.parse(startDateStr);
        } catch (ParseException e) {
            return null;
        }
        return startDate;
    }

}
