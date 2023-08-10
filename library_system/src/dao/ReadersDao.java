package dao;

import po.Readers;
// import util.JDBCUtil;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Sundengyue
 */
public class ReadersDao {
    //新增

    public static int addReaders(Readers readers) {
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;
        try {
            String sql = "insert into readers value (null,?,?,?,?)";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,readers.getName());
            ps.setString(2,readers.getIdcardnumber());
            ps.setString(3, readers.getPhonenumber());
            ps.setString(4,readers.getAddress());
            i=ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn,ps,null);
        }


        return i;
    }
    //查询全部
    public List<Readers> queryReaders(){
        List<Readers> readers = new ArrayList<>();
        Connection conn= null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select * from readers";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Readers r = new Readers();
                r.setReaderid(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setIdcardnumber(rs.getString(3));
                r.setPhonenumber(rs.getString(4));
                r.setAddress(rs.getString(5));
                readers.add(r);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            JDBCUtil.closeAll(conn,ps,rs);
        }


        return readers;
    }

    //更改
    public int updateReaders(Readers readers){
        Connection conn = null;
        PreparedStatement ps = null;
        int i = 0;

        try {
            String sql = "update readers set name=?,idcardnumber=?,phonenumber=?,address=? where readerid=?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,readers.getName());
            ps.setString(2,readers.getIdcardnumber());
            ps.setString(3,readers.getPhonenumber());
            ps.setString(4,readers.getAddress());
            ps.setInt(5,readers.getReaderid());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return i;
    }


    //删除
    public int deleteReaders(int readerid){
        Connection conn=null;
        PreparedStatement ps = null;
        int i = 0;

        try {
            String sql = "delete from readers where readerid=?";
            conn = JDBCUtil.getConnection();
            ps= conn.prepareStatement(sql);
            ps.setInt(1,readerid);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return i;
    }

    //根据id查询
    public List<Readers> idQueryReaders(int readerid){
        List<Readers> readers = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            String sql = "select * from readers where readerid=?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,readerid);
            rs = ps.executeQuery();
            while (rs.next()){
                Readers r = new Readers();
                r.setReaderid(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setIdcardnumber(rs.getString(3));
                r.setPhonenumber(rs.getString(4));
                r.setAddress(rs.getString(5));
                readers.add(r);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }

        return readers;
    }


    //根据姓名查询
    public List<Readers> nameQueryReaders(String name){
        List<Readers> readers = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select * from readers where name=?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            while (rs.next()){
                Readers r = new Readers();
                r.setReaderid(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setIdcardnumber(rs.getString(3));
                r.setPhonenumber(rs.getString(4));
                r.setAddress(rs.getString(5));
                readers.add(r);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }

        return readers;
    }

}
