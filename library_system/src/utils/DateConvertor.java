package utils;

import java.sql.Date;

import java.text.SimpleDateFormat;

public class DateConvertor {
    public static Date utilToSql(String date) {
        
        
        Date sqlDate = Date.valueOf(date);
        
        return sqlDate;

    }
}
