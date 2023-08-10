package service;

import po.Admin;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author SunDengyue
 */
public class AdminService {
    //登录
    public Admin login(Admin admin){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        Admin admin1 =null;
        try {
            String sql = "select * from admin where loginname=? and password=?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getLoginname());
            ps.setString(2, admin.getPassword());
            rs=ps.executeQuery();
            while (rs.next()){
                admin1 = new Admin();
                admin1.setId(rs.getInt(1));
                admin1.setLoginname(rs.getString(2));
                admin1.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn,ps,rs);
        }

        return admin1;
    }

}
