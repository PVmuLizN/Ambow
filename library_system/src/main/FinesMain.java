package main;

import po.Fines;
import service.FinesService;
import utils.KeyboardUtil;

import java.util.List;

/**
 * ClassName: FinesMain
 * Package: main
 * Description: 类的描述
 *
 * @Author 陈星
 * @Create 2023/8/10 11:49
 * @Version 1.0 版本号
 */
public class FinesMain {
 private FinesService fs = null;

 public void Fines() { // "Fines" to "fines": name rules
  fs = new FinesService();
  System.out.println("罚款管理：");
  System.out.println("1. 新增罚款记录");
  System.out.println("2. 删除罚款记录");
  System.out.println("3. 修改罚款记录");
  System.out.println("4. 查询罚款记录");
  int choice = KeyboardUtil.readInt();

  switch (choice) {
   case 1:
    System.out.println("新增罚款记录：");
    this.addFines();
    break;
   case 2:
    System.out.println("删除罚款记录：");
    this.deleteFines();
    break;
   case 3:
    System.out.println("修改罚款记录：");
    this.changeFines();
    break;
   case 4:
    System.out.println("查询罚款记录：");
    System.out.println("请输入查询方式：");
    System.out.println("1. 全部查询");
    System.out.println("2. 根据罚款编号查询");
    System.out.println("3. 根据借阅编号查询");
    int choiceQuery = KeyboardUtil.readInt();
    switch (choiceQuery) {
     case 1:
      this.FineAllQuery();
      break;
     case 2:
      this.FineIDQuery();
      break;
     case 3:
      this.BorrowIDQuery();
      break;
    }
    break;
  }
 }

 //增：
 private int addFines() {
  Fines fines = new Fines();

  System.out.print("请输入罚款编号：");
  int FineID = KeyboardUtil.readInt();
  System.out.print("请输入借阅编号：");
  int BorrowID = KeyboardUtil.readInt();
  System.out.print("请输入罚款金额：");
  int Amount = KeyboardUtil.readInt();
  System.out.print("请输入罚款原因：");
  String Reason = KeyboardUtil.readString();
  System.out.print("罚款是否已缴纳（已缴纳/未缴纳）：");
  String PaymentStatus = KeyboardUtil.readString();

  fines.setFineID(FineID);
  fines.setBorrowID(BorrowID);
  fines.setAmount(Amount);
  fines.setReason(Reason);
  fines.setPaymentStatus(PaymentStatus);
  return fs.addFines(fines);

 }

 //删
 private int deleteFines() {

  Fines fines = new Fines();
  System.out.print("请输入需要删除的罚款编号：");
  int FineID = KeyboardUtil.readInt();
  fines.setFineID(FineID);
  return fs.deleteFines(fines);
 }

 //改：
 private int changeFines() {

  Fines fines = new Fines();
  System.out.print("请输入罚款编号：");
  int FineID = KeyboardUtil.readInt();
  System.out.print("请输入新的借阅编号：");
  int BorrowID = KeyboardUtil.readInt();
  System.out.print("请输入新的罚款金额：");
  int Amount = KeyboardUtil.readInt();
  System.out.print("请输入新的罚款原因：");
  String Reason = KeyboardUtil.readString();
  System.out.print("罚款是否已缴纳（已缴纳/未缴纳）：");
  String PaymentStatus = KeyboardUtil.readString();

  fines.setFineID(FineID);
  fines.setBorrowID(BorrowID);
  fines.setAmount(Amount);
  fines.setReason(Reason);
  fines.setPaymentStatus(PaymentStatus);
  return fs.changeFines(fines);

 }

 //查1：
 public void FineAllQuery() {
  List<Fines> finesList = fs.queryFines();
  System.out.println("罚款编号：\t借阅编号：\t罚款金额：\t罚款原因：\t缴纳状态：");
  for (Fines fines : finesList) {
   System.out.println("\t" + fines.getFineID() + "\t\t" + fines.getBorrowID() + "\t\t\t" + fines.getAmount() + "\t\t\t" + fines.getReason() + "\t\t\t" + fines.getPaymentStatus());
  }
 }

 public void FineIDQuery() {
  System.out.print("请输入罚款编号：");
  int FineID = KeyboardUtil.readInt();
  List<Fines> finesList = fs.queryFineID(FineID);
  System.out.println("罚款编号：\t借阅编号：\t罚款金额：\t罚款原因：\t缴纳状态：");
  for (Fines fines : finesList) {
   System.out.println("\t" + fines.getFineID() + "\t\t" + fines.getBorrowID() + "\t\t\t" + fines.getAmount() + "\t\t\t" + fines.getReason() + "\t\t\t" + fines.getPaymentStatus());
  }
 }
 public void BorrowIDQuery(){
  System.out.print("请输入借阅编号：");
  int BorrowID = KeyboardUtil.readInt();
  List<Fines> finesList = fs.queryBorrowID(BorrowID);
  System.out.println("罚款编号：\t借阅编号：\t罚款金额：\t罚款原因：\t缴纳状态：");
  for (Fines fines:finesList){
   System.out.println("\t"+fines.getFineID()+"\t\t"+fines.getBorrowID()+"\t\t\t"+fines.getAmount()+"\t\t\t"+fines.getReason()+"\t\t\t"+fines.getPaymentStatus());
  }
 }
}