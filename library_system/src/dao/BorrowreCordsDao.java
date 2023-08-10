package dao;

import po.BorrowreCords;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张东旭
 */
public class BorrowreCordsDao {
    public List<BorrowreCords> queryAllBorrowerCords(){
        List<BorrowreCords> borrowerCords=new ArrayList<BorrowreCords>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            String sql="select * from BorrowreCords";
            conn= JDBCUtil.getConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                BorrowreCords b=new BorrowreCords();
                b.setBorrowID(rs.getInt(1));
                b.setBookID(rs.getInt(2));
                b.setReaderID(rs.getInt(3));
                b.setBorrowDate(rs.getString(4));
                b.setDueDate(rs.getString(5));
                b.setReturnDate(rs.getString(6));
                b.setReturned(rs.getString(7));
                borrowerCords.add(b);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn ,ps ,rs);
        }

        return borrowerCords;
    }

    public int addBorrowerCards(BorrowreCords b){
        int a = 0;
        Connection conn=null;
        PreparedStatement ps=null;
        String sql="insert into BorrowreCords values (?,?,?,?,?,?,?)";
        try {
            conn=JDBCUtil.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setInt(1,b.getBorrowID());
            ps.setInt(2,b.getBookID());
            ps.setInt(3,b.getReaderID());
            ps.setString(4,b.getReturnDate());
            ps.setString(5,b.getDueDate());
            ps.setString(6,b.getReturnDate());
            ps.setString(7,b.getReturned());
            a=ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil.closeAll(conn ,ps ,null);
        }
        return a;
    }

    public  int BorrowreCordsUpdate(BorrowreCords b){
        Connection conn=null;
        PreparedStatement ps=null;
        int result = 0;
        try {
            String sql="update BorrowreCords set bookid=?,readerid=?,borrowdate=?,duedate=?,returndate=?,returned=? where borrowid=?";
            conn=JDBCUtil.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setInt(1,b.getBookID());
            ps.setInt(2,b.getReaderID());
            ps.setString(3,b.getBorrowDate());
            ps.setString(4,b.getReturnDate());
            ps.setString(5,b.getDueDate());
            ps.setString(6,b.getReturned());
            ps.setInt(7,b.getBorrowID());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeAll(conn,ps,null);
        }
        return result;
    }

    public int Delete(int borrowID){
        Connection conn=null;
        PreparedStatement ps=null;
        int result = 0;
        try {
            String sql="delete from BorrowreCords where borrowid=?";
            conn=JDBCUtil.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setInt(1,borrowID);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeAll(conn,ps,null);
        }
        return borrowID;
    }
}
