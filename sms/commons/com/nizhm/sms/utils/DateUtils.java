package com.nizhm.sms.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author nizhm
 */
public class DateUtils {
    public static Date parseToDateTime() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = df.parse(df.format(new Date()));
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
}
