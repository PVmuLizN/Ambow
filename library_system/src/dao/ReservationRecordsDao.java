// package dao.dao_impl;
package dao;

import po.ReservationRecords;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: aaaaaa
 * Package: main
 * Description: 类的描述
 *
 * @Author 王志鹏
 * @Create 2023/8/10 16:05
 * @Version 1.0 版本号
 */
public class ReservationRecordsDao {
    public List<ReservationRecords> queryAllReservationRecords() {
        List<ReservationRecords> reservationRecords = new ArrayList<ReservationRecords>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select * from ReservationRecords";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ReservationRecords n = new ReservationRecords();
                n.setReservationID(rs.getInt(1));
                n.setBookID(rs.getInt(2));
                n.setReaderID(rs.getInt(3));
                n.setReservationDate(rs.getString(4));
                n.setBookTaken(rs.getString(5));
                reservationRecords.add(n);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }

        return reservationRecords;
    }

    public int addAllreservationRecords(ReservationRecords n) {
        int a = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "insert into ReservationRecords values(null,?,?,?,?)";

        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, n.getBookID());
            ps.setInt(2, n.getReaderID());
            ps.setString(3, n.getReservationDate());
            ps.setString(4, n.getBookTaken());
            a = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return a;
    }

    public int ReservationRecordsUpdate(ReservationRecords res) {
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            String sql = "update reservationRecords set BookID=?,ReaderID=?, ReservationDate=?,BookTaken=? where ReservationID=?";

            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, res.getBookID());
            ps.setInt(2, res.getReaderID());
            ps.setString(3, res.getReservationDate());
            ps.setString(4, res.getBookTaken());
            ps.setInt(5, res.getReservationID());
            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public int Delete(ReservationRecords res) {
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            String sql = "delete from ReservationRecords where ReservationID=?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, res.getReservationID());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }
}
