package com.ambow.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ambow.po.News;
import com.ambow.po.User;
import com.ambow.util.DBConnection;

/** 操作数据库类 */
public class NewsService {
	// 根据用户名和密码进行数据库查询操作
	public User login(User user) {
		User users = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 1.sql语句
			String sql = "select * from user where loginname=? and password=?";
			// 2.连接数据库（获取数据库连接对象）
			conn = DBConnection.getConnection();
			// 3.预编译sql语句（1.判断sql语句是否正确2.判断sql语句是否需要赋值）
			ps = conn.prepareStatement(sql);
			// 4.赋值（主要根据sql语句中的?来的，有?就需要赋值，需要赋值必有参数）
			ps.setString(1, user.getLoginname());
			ps.setString(2, user.getPassword());
			// 5.执行并且得到结果集
			rs = ps.executeQuery();
			// 6.遍历结果集
			while (rs.next()) {
				users = new User();
				users.setUid(rs.getInt(1));
				users.setLoginname(rs.getString(2));
				users.setPassword(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭
			DBConnection.closeAll(conn, ps, rs);
		}
		return users;
	}

	// 查询所有新闻信息的方法
	public List<News> queryAllNews() {
		// 创建集合，用来存储查询出来的数据（news对象）
		List<News> news = new ArrayList<News>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from news";
			// 2.连接数据库（获取数据库连接对象）
			conn = DBConnection.getConnection();
			// 3.预编译sql语句（1.判断sql语句是否正确2.判断sql语句是否需要赋值）
			ps = conn.prepareStatement(sql);
			// 4.赋值
			// 5.执行
			rs = ps.executeQuery();
			// 6.遍历结果集
			while (rs.next()) {
				News n = new News();
				n.setId(rs.getInt(1));
				n.setType(rs.getString(2));
				n.setTitle(rs.getString(3));
				n.setAuthor(rs.getString(4));
				n.setCreatedate(rs.getString(5));
				n.setMogifydate(rs.getString(6));
				n.setContent(rs.getString(7));
				// 将对象添加到集合中
				news.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭
			DBConnection.closeAll(conn, ps, rs);
		}
		return news;
	}

	// 新增新闻的方法
	public int addNews(News n) {
		int a = 0;// 默认为失败的
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "insert into news values(null,?,?,?,?,?,?)";
			// 2.连接数据库（获取数据库连接对象）
			conn = DBConnection.getConnection();
			// 3.预编译sql语句（1.判断sql语句是否正确2.判断sql语句是否需要赋值）
			ps = conn.prepareStatement(sql);
			// 4.赋值
			ps.setString(1, n.getType());
			ps.setString(2, n.getTitle());
			ps.setString(3, n.getAuthor());
			ps.setString(4, n.getCreatedate());
			ps.setString(5, n.getMogifydate());
			ps.setString(6, n.getContent());
			// 5.执行
			a = ps.executeUpdate();// 0失败,1成功
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭
			DBConnection.closeAll(conn, ps, null);
		}
		return a;

	}

	// 修改的sql:update news set
	// type=?,title=?,author=?,createdate=?,monifydate=?,content=? where id=?;
	// 删除的sql:delete from news where id=?;

}
