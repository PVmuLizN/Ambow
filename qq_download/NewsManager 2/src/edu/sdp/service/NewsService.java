package edu.sdp.service;

import com.shanzhi.po.Flight;
import edu.sdp.po.News;
import edu.sdp.po.User;
import edu.sdp.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsService {
	//用户登录
	public User login(User user) throws SQLException {
		User user1=null;
		//sql语句
		String sql="select * from user where loginname=? and password=?";
		//预编译sql语句
		Connection conn = DBConnection.getConection();
		PreparedStatement ps = conn.prepareStatement(sql);
		//给sql语句赋值
		ps.setString(1, user.getLoginname());
		ps.setString(2, user.getPassword());
		//执行sql语句
		ResultSet rs = ps.executeQuery();
		//接收结果
		while (rs.next()){
			user1=new User();
			user1.setUid(rs.getInt(1));
			user1.setLoginname(rs.getString(2));
			user1.setPassword(rs.getString(3));
		}
		return user1;
	}
	//查询所有的方法
	public List<News> queryAll(){
		//创建集合，用来存储从数据库取出的数据
		List<News> news=new ArrayList<News>();
		String sql="select * from news";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs =null;
		try {
			conn = DBConnection.getConection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()){
				News n=new News();
				n.setId(rs.getInt(1));
				n.setType(rs.getString(2));
				n.setTitle(rs.getString(3));
				n.setAuthor(rs.getString(4));
				n.setCreatedate(rs.getString(5));
				n.setModifydate(rs.getString(6));
				n.setContent(rs.getString(7));
				//将对象存储到集合中
				news.add(n);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			com.shanzhi.util.DBConnection.closeAll(conn,ps,rs);
		}
		return news;
	}
	//根据新闻类型查询
	public List<News> queryByType(String type){
		//创建集合，用来存储从数据库取出的数据
		List<News> news=new ArrayList<News>();
		String sql="select * from news where type=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,type);
			rs = ps.executeQuery();
			while (rs.next()){
				News n=new News();
				n.setId(rs.getInt(1));
				n.setType(rs.getString(2));
				n.setTitle(rs.getString(3));
				n.setAuthor(rs.getString(4));
				n.setCreatedate(rs.getString(5));
				n.setModifydate(rs.getString(6));
				n.setContent(rs.getString(7));
				news.add(n);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			com.shanzhi.util.DBConnection.closeAll(conn,ps,rs);
		}
		return news;
	}
	//根据作者查询
	//根据新闻类型查询
	public List<News> queryByAuthor(String author){
		//创建集合，用来存储从数据库取出的数据
		List<News> news=new ArrayList<News>();
		String sql="select * from news where author=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,author);
			rs = ps.executeQuery();
			while (rs.next()){
				News n=new News();
				n.setId(rs.getInt(1));
				n.setType(rs.getString(2));
				n.setTitle(rs.getString(3));
				n.setAuthor(rs.getString(4));
				n.setCreatedate(rs.getString(5));
				n.setModifydate(rs.getString(6));
				n.setContent(rs.getString(7));
				news.add(n);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			com.shanzhi.util.DBConnection.closeAll(conn,ps,rs);
		}
		return news;
	}
	//新增新闻信息
	public int addNews(News n){
		String sql="insert into news values(null,?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		try {
			conn = DBConnection.getConection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,n.getType());
			ps.setString(2,n.getTitle());
			ps.setString(3,n.getAuthor());
			ps.setString(4,n.getCreatedate());
			ps.setString(5,n.getModifydate());
			ps.setString(6,n.getContent());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			DBConnection.closeAll(conn,ps,null);
		}
		return i;
	}
	//删除新闻信息
	public int delNews(int id){
		String sql="delete from news where id=?";
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		try {
			conn = DBConnection.getConection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			DBConnection.closeAll(conn,ps,null);
		}
		return i;
	}
	//修改航班信息方法
	public int updateNews(News n){
		int i=0;
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="update news set type=?,title=?,"
				+ "author=?,createdate=?,modifydate=?,content=? where id=?";
		try {
			//2.获取数据库连接对象
			conn=DBConnection.getConection();
			//3.预编译sql语句
			ps=conn.prepareStatement(sql);
			//赋值
			ps.setString(1, n.getType());
			ps.setString(2, n.getTitle());
			ps.setString(3, n.getAuthor());
			ps.setString(4,n.getCreatedate());
			ps.setString(5, n.getModifydate());
			ps.setString(6,n.getContent());
			ps.setInt(7,n.getId());
			//执行，得到结果
			i=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭操作
			DBConnection.closeAll(conn, ps, null);
		}
		return i;
	}
}
