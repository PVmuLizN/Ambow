package service;

import dao.FinesDao;
// import po.Borrowrecords;
import po.Fines;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: FinesService
 * Package: service
 * Description: 类的描述
 *
 * @Author 陈星
 * @Create 2023/8/8 11:16
 * @Version 1.0 版本号
 */
public class FinesService {
// //增
// public void addFines(int i1,int i2,int i3,String str1,String str2){
//  String sql = "insert into fines values (?,?,?,?,?)";
//  Connection conn = null;
//  PreparedStatement ps = null;
//  try {
//   conn = JDBCUtil.getConnection();
//   ps = conn.prepareStatement(sql);
//   ps.setObject(1,i1);
//   ps.setObject(2,i2);
//   ps.setObject(3,i3);
//   ps.setObject(4,str1);
//   ps.setObject(5,str2);
//   ps.executeUpdate();
//  } catch (SQLException e) {
//   e.printStackTrace();
//  }finally {
//   JDBCUtil.closeAll(conn,ps,null);
//  }
// }
//
// //删：
// public int deleteFines(int i){
//  String sql = "DELETE from fines where FineID = ?";
//
//  Connection conn = JDBCUtil.getConnection();
//  PreparedStatement ps = null;
//  int i1 = 0;
//  try {
//   ps = conn.prepareStatement(sql);
//   ps.setObject(1,i);
//   i1 = ps.executeUpdate();
//  } catch (SQLException e) {
//   e.printStackTrace();
//  }finally {
//   JDBCUtil.closeAll(conn,ps,null);
//  }
//  return i1;
//
// }

// //改：
// public int updateFines(int i1,int i2,String str1,String str2,int i3){
//  String sql = "UPDATE fines SET BorrowID = ?,Amount = ?,Reason = ?,PaymentStatus = ? where FineID = ?";
//  Connection conn = null;
//  PreparedStatement ps = null;
//  int i = 0;
//  try {
//   conn = JDBCUtil.getConnection();
//   ps= conn.prepareStatement(sql);
//   ps.setObject(1,i1);
//   ps.setObject(2,i2);
//   ps.setObject(3,str1);
//   ps.setObject(4,str2);
//   ps.setObject(5,i3);
//   i = ps.executeUpdate();
//  } catch (SQLException e) {
//   e.printStackTrace();
//  }finally {
//   JDBCUtil.closeAll(conn,ps,null);
//  }
//  return i;
// }

// //查：
// public List<Fines> queryAllFines(){
//  List<Fines> fines = new ArrayList<>();
//  String sql = "SELECT * FROM fines";
//  Connection conn = null;
//  PreparedStatement ps = null;
//  ResultSet rs = null;
//  try {
//   conn = JDBCUtil.getConnection();
//   ps = conn.prepareStatement(sql);
//   rs = ps.executeQuery();
//   while (rs.next()){
//    Fines fn = new Fines();
//    fn.setFineID(rs.getInt(1));
//    fn.setBorrowID(rs.getInt(2));
//    fn.setAmount(rs.getInt(3));
//    fn.setReason(rs.getString(4));
//    fn.setPaymentStatus(rs.getString(5));
//    fines.add(fn);
//   }
//  } catch (SQLException e) {
//   e.printStackTrace();
//  }finally {
//   JDBCUtil.closeAll(conn,ps,rs);
//  }
//  return fines;
//
//
// }

 private FinesDao finesDao;

 public FinesService() {
  this.finesDao = new FinesDao();
 }

 public FinesService(FinesDao finesDao) {
  this.finesDao = finesDao;
 }

 //增
 public int addFines(Fines fines){
  return finesDao.addFines(fines);
 }

 //删

 public int deleteFines(Fines fines){
  return finesDao.deleteFines(fines);
 }

 //改
 public int changeFines(Fines fines){
  return finesDao.updateFines(fines);
 }

 //查1:
 public List<Fines> queryFines(){
  return finesDao.queryAllFines();
 }

 //根据FineID查询
 public List<Fines> queryFineID(int FineID){
  return finesDao.FineIdQuery(FineID);
 }

 //根据BorrowID查询
 public List<Fines> queryBorrowID(int i){
  return finesDao.queryBorrowID(i);
 }


}
