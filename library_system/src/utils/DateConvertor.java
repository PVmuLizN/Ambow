package utils;

import java.sql.Date;

import java.text.SimpleDateFormat;

public class DateConvertor {
    public static Date utilToSql(String date) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date);
        Date sqlDate = Date.valueOf(strDate);
        
        return sqlDate;

    }
}
