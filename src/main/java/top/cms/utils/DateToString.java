package top.cms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具类
 * @author yhmi
 */
public class DateToString {
    static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /**
     * 日期转换字符串
     * @param date 传入日期
     * @return 返回字符串
     */
    public static String dateToString(Date date){
        return simpleDateFormat.format(date);
    }

    /**
     * 字符串转换日期
     * @param s
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String s) throws ParseException {
        return simpleDateFormat.parse(s);
    }
}
