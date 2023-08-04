package com.ambow.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**���ݿ����ӹ�����:ʹ��Java�������������ݿ⣬��ȡ���ݿ����Ӷ���
 * jdbc�������������������Ҫ����jar��*/
public class DBConnection {
	//�������ݿ�����Ĳ���
	private static String user="root";
	private static String password="123456";
	private static String url="jdbc:mysql://127.0.0.1:3306/ambow505";
	//����������
	//��̬�����
	//������ֻҪ��Ŀ�����κβ�������ô����ִ�У����Ҳ���Ҫ����
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����������ʧ��");
		}
	}
	//��ȡ���ݿ����Ӷ���
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
	//�رշ���
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
			try {
				//���ݿ����Ӷ���
				if(conn!=null){
					conn.close();
				}
				//Ԥ�������
				if(ps!=null){
					ps.close();
				}
				//���������
				if(rs!=null){
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
