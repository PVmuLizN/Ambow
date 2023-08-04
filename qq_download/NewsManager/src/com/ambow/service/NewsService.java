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

/** �������ݿ��� */
public class NewsService {
	// �����û���������������ݿ��ѯ����
	public User login(User user) {
		User users = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 1.sql���
			String sql = "select * from user where loginname=? and password=?";
			// 2.�������ݿ⣨��ȡ���ݿ����Ӷ���
			conn = DBConnection.getConnection();
			// 3.Ԥ����sql��䣨1.�ж�sql����Ƿ���ȷ2.�ж�sql����Ƿ���Ҫ��ֵ��
			ps = conn.prepareStatement(sql);
			// 4.��ֵ����Ҫ����sql����е�?���ģ���?����Ҫ��ֵ����Ҫ��ֵ���в�����
			ps.setString(1, user.getLoginname());
			ps.setString(2, user.getPassword());
			// 5.ִ�в��ҵõ������
			rs = ps.executeQuery();
			// 6.���������
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
			// �ر�
			DBConnection.closeAll(conn, ps, rs);
		}
		return users;
	}

	// ��ѯ����������Ϣ�ķ���
	public List<News> queryAllNews() {
		// �������ϣ������洢��ѯ���������ݣ�news����
		List<News> news = new ArrayList<News>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from news";
			// 2.�������ݿ⣨��ȡ���ݿ����Ӷ���
			conn = DBConnection.getConnection();
			// 3.Ԥ����sql��䣨1.�ж�sql����Ƿ���ȷ2.�ж�sql����Ƿ���Ҫ��ֵ��
			ps = conn.prepareStatement(sql);
			// 4.��ֵ
			// 5.ִ��
			rs = ps.executeQuery();
			// 6.���������
			while (rs.next()) {
				News n = new News();
				n.setId(rs.getInt(1));
				n.setType(rs.getString(2));
				n.setTitle(rs.getString(3));
				n.setAuthor(rs.getString(4));
				n.setCreatedate(rs.getString(5));
				n.setMogifydate(rs.getString(6));
				n.setContent(rs.getString(7));
				// ��������ӵ�������
				news.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �ر�
			DBConnection.closeAll(conn, ps, rs);
		}
		return news;
	}

	// �������ŵķ���
	public int addNews(News n) {
		int a = 0;// Ĭ��Ϊʧ�ܵ�
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "insert into news values(null,?,?,?,?,?,?)";
			// 2.�������ݿ⣨��ȡ���ݿ����Ӷ���
			conn = DBConnection.getConnection();
			// 3.Ԥ����sql��䣨1.�ж�sql����Ƿ���ȷ2.�ж�sql����Ƿ���Ҫ��ֵ��
			ps = conn.prepareStatement(sql);
			// 4.��ֵ
			ps.setString(1, n.getType());
			ps.setString(2, n.getTitle());
			ps.setString(3, n.getAuthor());
			ps.setString(4, n.getCreatedate());
			ps.setString(5, n.getMogifydate());
			ps.setString(6, n.getContent());
			// 5.ִ��
			a = ps.executeUpdate();// 0ʧ��,1�ɹ�
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �ر�
			DBConnection.closeAll(conn, ps, null);
		}
		return a;

	}

	// �޸ĵ�sql:update news set
	// type=?,title=?,author=?,createdate=?,monifydate=?,content=? where id=?;
	// ɾ����sql:delete from news where id=?;

}
