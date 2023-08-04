package service.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import po.User;
import service.NewsService;
import utils.JDBCUtil;

public class NewsServiceImpl implements NewsService {

    @Override
    public void login(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User users = new User();
        try {
            String sql = "";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();

            while (rs.next()) {

                users.setUid(rs.getInt(1));
                users.setUsername(rs.getString(2));
                users.setPassword(rs.getString(3));
            }

        } catch (SQLException e) {

        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        System.out.println(users.getUid()+users.getUsername()+users.getPassword());

    }
}
