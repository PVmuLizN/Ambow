package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Admin;
import po.User;
import utils.DBUtils;

public class UserDao {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement stmt= null;
    /**
     * 登录
     * */
    public po.Admin Login(Admin amin){
        Admin admin=new Admin();
        conn=DBUtils.getConnection();
        String sql="select * from admin where username=? and password=?";
        try {
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,amin.getUsername());
            stmt.setString(2,amin.getPassword());
            rs=stmt.executeQuery();
            while (rs.next()){
                admin.setId(rs.getInt(1));
                admin.setUsername(rs.getString(2));
                admin.setPassword(rs.getString(3));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(rs,stmt,conn);
        }
        return admin;
    }

    /**
     * 查询全部方法
     * */
    public List<User> QueryAllUser()  {
        List<User> users=new ArrayList<>();
        conn= DBUtils.getConnection();
        String sql="select * from users";

        try {
            stmt = conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            while (rs.next()){
                User user=new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setAge(rs.getInt(3));
                user.setSex(rs.getString(4));
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(rs,stmt,conn);
        }

        return users;
    }

    /**
     * 根据编号查询用户信息
     * */
    public User QueryUserById(int id){
        User user=new User();
        conn=DBUtils.getConnection();
        String sql="select * from users where id=?";
        try {
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1,id);
            rs=stmt.executeQuery();
            while (rs.next()){
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setAge(rs.getInt(3));
                user.setSex(rs.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(rs,stmt,conn);
        }
        return user;
    }

    /**
     * 添加方法
     * */
    public int AddUser(User user){
        int row=0;
        conn=DBUtils.getConnection();
        String sql="insert into users values(null,?,?,?)";
        try {
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,user.getName());
            stmt.setInt(2,user.getAge());
            stmt.setString(3,user.getSex());
            row=stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(null,stmt,conn);
        }
        return  row;
    }
    /**
     * 删除用户
     * */
    public int DeleteUser(int id){
        int row=0;
        conn=DBUtils.getConnection();
        String sql="delete from users where id=?";
        try {
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1,id);
            row=stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(null,stmt,conn);
        }
        return  row;
    }
}
