package dao;

// import po.Borrowrecords;
import po.Fines;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: FinesDao
 * Package: dao
 * Description: 类的描述
 *
 * @Author 陈星
 * @Create 2023/8/9 9:16
 * @Version 1.0 版本号
 */
public class FinesDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    // 增
    public int addFines(Fines fines) {
        String sql = "insert into fines values (?,?,?,?,?)";
        int result = 0;
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, fines.getFineID());
            ps.setObject(2, fines.getBorrowID());
            ps.setObject(3, fines.getAmount());
            ps.setObject(4, fines.getReason());
            ps.setObject(5, fines.getPaymentStatus());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }

    // 删
    public int deleteFines(Fines fines) {
        int result = 0;
        String sql = "DELETE from fines where FineID = ?";
        // Connection conn = JDBCUtil.getConnection(); // already has a variable named
        // as conn, and should be in try block
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, fines.getFineID());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }

    // 改
    public int updateFines(Fines fines) {
        String sql = "UPDATE fines SET BorrowID = ?,Amount = ?,Reason = ?,PaymentStatus = ? where FineID = ?";
        Connection conn = null;
        // PreparedStatement ps = null;
        int result = 0;
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, fines.getBorrowID());
            ps.setObject(2, fines.getAmount());
            ps.setObject(3, fines.getReason());
            ps.setObject(4, fines.getPaymentStatus());
            ps.setObject(5, fines.getFineID());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }

    // 查询全部：
    public List<Fines> queryAllFines() {
        List<Fines> fines = new ArrayList<>();
        String sql = "SELECT * FROM fines";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Fines fn = new Fines();
                fn.setFineID(rs.getInt(1));
                fn.setBorrowID(rs.getInt(2));
                fn.setAmount(rs.getInt(3));
                fn.setReason(rs.getString(4));
                fn.setPaymentStatus(rs.getString(5));
                fines.add(fn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return fines;

    }

    // 根据FineID查询
    public List<Fines> FineIdQuery(int i) {
        String sql = "SELECT * FROM fines WHERE FineID = ?";
        // Connection conn = JDBCUtil.getConnection(); // already has a variable named as conn, and should be in try block
        PreparedStatement ps = null;
        List<Fines> finesList = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, i);
            rs = ps.executeQuery();
            while (rs.next()) {
                Fines fines = new Fines();
                fines.setFineID(rs.getInt(1));
                fines.setBorrowID(rs.getInt(2));
                fines.setAmount(rs.getInt(3));
                fines.setReason(rs.getString(4));
                fines.setPaymentStatus(rs.getString(5));
                finesList.add(fines);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return finesList;
    }

    // 根据BorrowID查询
    public List<Fines> queryBorrowID(int i) {
        String sql = "SELECT * FROM Fines WHERE BorrowID = ?";
        List<Fines> finesList = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, i);
            rs = ps.executeQuery();
            while (rs.next()) {
                Fines fines = new Fines();
                fines.setFineID(rs.getInt(1));
                fines.setBorrowID(rs.getInt(2));
                fines.setAmount(rs.getInt(3));
                fines.setReason(rs.getString(4));
                fines.setPaymentStatus(rs.getString(5));
                finesList.add(fines);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return finesList;
    }
}
