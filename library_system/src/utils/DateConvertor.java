package utils;

import java.sql.Date;


public class DateConvertor {
    public static Date utilToSql(String date) {
        
        
        Date sqlDate = Date.valueOf(date);
        
        return sqlDate;

    }
}
