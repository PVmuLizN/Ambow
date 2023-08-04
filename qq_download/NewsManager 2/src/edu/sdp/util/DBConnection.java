package edu.sdp.util;

import java.sql.*;

/*
* 数据库连接类
*  */
public class DBConnection {
	/* 数据库连接参数 */
	private static String url="jdbc:mysql://localhost:3306/ambow505";
	private static String user="root";
	private static String password="root";
	private static String driver="com.mysql.jdbc.Driver";
	//加载数据库驱动
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	//获取数据库连接对象  用来表示是否连接成功数据库
	public static Connection getConection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return conn;
	}
	//关闭操作
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			if(conn!=null){
				conn.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
