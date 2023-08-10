package main;

import dao.BorrowreCordsDao;
import po.BorrowreCords;
import service.BorrowreCordsService;
import utils.KeyboardUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张东旭
 */
public class BorrowreCordsCordsMain {
    BorrowreCordsService bs;
    public void BorrowCaords(){
        int i = 0;
        bs = new BorrowreCordsService();
        System.out.println("借阅记录表！");
        System.out.println("1.查询借阅记录");
        System.out.println("2.新增借阅记录");
        System.out.println("3.修改借阅记录");
        System.out.println("4.删除借阅记录");
        int choice = KeyboardUtil.readInt();
        switch (choice) {
            case 1:
                this.queryAllBorrowCords();
                break;
            case 2:
                this.addBorrowreCords();
                break;
            case 3:
                this.BorrowreCordsUpdate();
                break;
            case 4:
                this.Delete();
                break;
            default:
                System.out.println("Something went wrong!!!");
        }
    }
    public void queryAllBorrowCords(){
        List<BorrowreCords> borrowreCords= bs.queryAllBorrowCords();
        System.out.println("借阅ID"+"\t"+"图书ID"+"\t"+"读者ID"+"\t"+"借阅日期"+"\t"+"\t"+"归还日期"+"\t"+"\t"+"实际归还日期"+"\t"+"是否归还");
        for (BorrowreCords b:borrowreCords){
            System.out.println(b.getBorrowID()+"\t"+"\t"+b.getBookID()+"\t"+"\t"+b.getReaderID()+"\t"+"\t"+b.getBorrowDate()+"\t"+b.getDueDate()+"\t"+b.getReturnDate()+"\t"+b.getReturned());
        }
    }
    public void addBorrowreCords(){
        bs = new BorrowreCordsService();
        System.out.println("请输入需要添加的数据：");
        System.out.println("需要添加的借阅ID");
        int borrowid= KeyboardUtil.readInt();
        System.out.println("需要添加的图书ID");
        int bookid =KeyboardUtil.readInt();
        System.out.println("需要添加的读者ID");
        int readerid =KeyboardUtil.readInt();
        System.out.println("需要添加的借阅日期");
        String borrowdate = KeyboardUtil.readString();
        System.out.println("需要添加的归还日期");
        String duedate = KeyboardUtil.readString();
        System.out.println("需要添加的实际归还日期");
        String returndate = KeyboardUtil.readString();
        System.out.println("添加的是否归还");
        String returned = KeyboardUtil.readString();
        BorrowreCords  b = new BorrowreCords();
        b.setBorrowID(borrowid);
        b.setBookID(bookid);
        b.setReaderID(readerid);
        b.setBorrowDate(borrowdate);
        b.setDueDate(duedate);
        b.setReturnDate(returndate);
        b.setReturned(returned);
        int a =bs.addBorrowerCards(b);
        if (a > 0){
            System.out.println("新增成功");
        }else{
            System.out.println("新增失败");
        }

    }
    public void BorrowreCordsUpdate(){
        queryAllBorrowCords();
        bs = new BorrowreCordsService();
        BorrowreCords borrowreCords = new BorrowreCords();
        System.out.println("请输入需要修改的数据：");
        System.out.println("需要修改的图书ID");
        int bookid= KeyboardUtil.readInt();
        System.out.println("需要修改的读者ID");
        int readerid =KeyboardUtil.readInt();
        System.out.println("需要修改的借阅日期");
        String borrowdate=KeyboardUtil.readString();
        System.out.println("需要修改的归还日期");
        String  duedate= KeyboardUtil.readString();
        System.out.println("需要修改的实际归还日期");
        String returndate = KeyboardUtil.readString();
        System.out.println("修改是否归还");
        String returned  = KeyboardUtil.readString();
        System.out.println("需要修改的借阅ID");
        int borrowid = KeyboardUtil.readInt();
        BorrowreCords br = new BorrowreCords();
        br.setBookID(bookid);
        br.setBorrowDate(borrowdate);
        br.setReaderID(readerid);
        br.setDueDate(duedate);
        br.setReturnDate(returndate);
        br.setReturned(returned);
        br.setBorrowID(borrowid);
        bs.BorrowreCordsUpdate(br);

    }
    public void Delete(){
        System.out.println("输入需要删除的借阅编号");
        int borrowID = KeyboardUtil.readInt();
        bs.Delete(borrowID);
    }
}
