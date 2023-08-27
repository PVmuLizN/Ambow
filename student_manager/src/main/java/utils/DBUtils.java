package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	public static Connection getConnection() {
        Connection conn = null;
        
        try {
            //1 定义连接mysql数据库驱动程序字符串
            String jdbc_driver = "com.mysql.jdbc.Driver";
            //2 定义建立与数据库连接的字符串要
            String jdbc_url = "jdbc:mysql://127.0.0.1:3306/studentssys";  //bookmanage:要连接的数据库的名字
            // :3306端口号可以省略。student是连接数据库的名字。
            //将JDBC驱动类装载入Java虚拟机
            Class.forName(jdbc_driver);
            //使用户名、密码与数据库建立连接
            String name = "root";     //登录数据库用户名       //"root";
            String passWord = ""; //登录数据库密码      //"root";
            conn = DriverManager.getConnection(jdbc_url, name, passWord);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
	 public static void close(ResultSet rs, PreparedStatement pstm,Connection connection){
	        try {
	            if (rs!=null){
	                rs.close();
	            }
	            if (pstm!=null){
	                pstm.close();
	            }
	            if (connection!=null){
	                connection.close();
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	 
	    }

}
