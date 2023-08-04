package com.ambow.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**数据库连接工具类:使用Java代码来连接数据库，获取数据库连接对象
 * jdbc：第三方，因此我们需要导入jar包*/
public class DBConnection {
	//连接数据库所需的参数
	private static String user="root";
	private static String password="123456";
	private static String url="jdbc:mysql://127.0.0.1:3306/ambow505";
	//加载驱动类
	//静态代码块
	//特征：只要项目中有任何操作，那么他就执行，而且不需要调用
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动类失败");
		}
	}
	//获取数据库连接对象
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭方法
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
			try {
				//数据库连接对象
				if(conn!=null){
					conn.close();
				}
				//预编译对象
				if(ps!=null){
					ps.close();
				}
				//结果集对象
				if(rs!=null){
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
