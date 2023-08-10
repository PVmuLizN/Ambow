package main;

import po.ReservationRecords;
import service.ReservationService;
import utils.KeyboardUtil;

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
public class ReservationRecordsMain {
    private ReservationService bs=null;

    public void RRmain(){
        System.out.println("预约管理：");
        System.out.println("1. 新增预约记录：" );
        System.out.println("2. 删除预约记录：");
        System.out.println("3. 修改预约记录：");
        System.out.println("4. 查询预约记录：");

        int i = KeyboardUtil.readInt();
        switch (i){
            case 1:
                this.addReservationRecords();
                break;
            case 2:
                this.Delete();
                break;
            case 3:
                this.ReservationRecordsUpdate();
                break;
            case 4:
                System.out.println("预约ID"+"\t\t\t"+"图书ID"+"\t\t\t"+"读者ID"+"\t\t"+"预约日期"+"\t\t\t\t"+"是否取出");
                this.queryReservationRecords();
                break;
        }



    }
    //增
    public void addReservationRecords(){
        bs = new ReservationService();
        ReservationRecords rr=new ReservationRecords();
        System.out.println("请添加预约ID：");
        int ReservationID = KeyboardUtil.readInt();
        rr.setReservationID(ReservationID);
        System.out.println("请输入图书ID：");
        int BookID = KeyboardUtil.readInt();
        rr.setBookID(BookID);
        System.out.println("请输入读者ID：");
        int ReaderID = KeyboardUtil.readInt();
        rr.setReaderID(ReaderID);
        System.out.println("请输入预约日期；");
        String ReservationDate = KeyboardUtil.readString();
        rr.setReservationDate(ReservationDate);
        System.out.println("请输入是否取走");
        String BookTaken = KeyboardUtil.readString();
        rr.setBookTaken(BookTaken);
        bs.addAllreservationRecords(rr);

    }

    //查
    public void queryReservationRecords(){
        bs = new ReservationService();
        List<ReservationRecords> reservationRecords = bs.queryAllReservationRecords();
        for (ReservationRecords fs : reservationRecords){
            System.out.println(fs.getReservationID()+"\t\t\t\t\t"+fs.getBookID()+"\t\t\t"+fs.getReaderID()+"\t\t\t"+fs.getReservationDate()+"\t\t\t\t"+fs.getBookTaken());
        }


    }

    //改
    public void ReservationRecordsUpdate(){
        bs=new ReservationService();
        System.out.println("请输入修改的预约ID：");
        int ReservationID = KeyboardUtil.readInt();
        System.out.println("请输入修改的图书ID：");
        int BookID = KeyboardUtil.readInt();
        System.out.println("请输入修改的读者ID：");
        int ReaderID = KeyboardUtil.readInt();
        System.out.println("请输入修改的日期：");
        String ReservationDate = KeyboardUtil.readString();
        System.out.println("请修改是否取出：");
        String BookTaken = KeyboardUtil.readString();
        ReservationRecords rr = new ReservationRecords();
        rr.setReservationID(ReservationID);
        rr.setBookID(BookID);
        rr.setReaderID(ReaderID);
        rr.setReservationDate(ReservationDate);
        rr.setBookTaken(BookTaken);
        bs.ReservationRecordsUpdate(rr);
    }

    //删
    public void Delete(){
        bs = new ReservationService();
        System.out.println("输入要删除的预约ID：");
        int ReservationID = KeyboardUtil.readInt();
        ReservationRecords rr = new ReservationRecords();
        rr.setReservationID(ReservationID);
        bs.Delete(rr);
    }

    public void main(){

    }


}


