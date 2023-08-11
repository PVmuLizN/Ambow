package main;

import po.Readers;
import service.ReadersService;
import utils.KeyboardUtil;

import java.util.List;

/**
 * @Sundengyue
 */

public class ReadersMain {

    public void operate(){
        System.out.println("欢迎来到读者管理系统");
        System.out.println("1.查询\t2.增加\t3.更改\t4.删除\t0.退出");
        System.out.println("请选择：");
        int a = KeyboardUtil.readInt();
        switch (a){
            case 1:
                System.out.println("1.查询全部\t2.读者编号查询\t3.读者姓名查询\t0.返回");
                System.out.println("查询操作：");
                int  j = KeyboardUtil.readInt();
                switch (j){
                    case 1:
                        queryReaders();
                        break;
                    case 2:
                        idQueryReaders();
                        break;
                    case 3:
                        nameQueryReaders();
                        break;
                    case 0:
                        operate();
                        break;
                    default:
                        System.out.println("输入有误");

                }

                break;
            case 2:
                System.out.println("添加读者信息");
                addReaders();
                break;
            case 3:
                System.out.println("更改读者信息");
                updateReaders();
                break;
            case 4:
                System.out.println("删除读者信息");
                deleteReaders();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("输入有误");
        }
    }
    ReadersService rs = new  ReadersService();
    public void addReaders(){
        System.out.println("请输入读者姓名：");
        String name = KeyboardUtil.readString();
        System.out.println("请输入读者身份证号：");
        String idcardnumber = KeyboardUtil.readString();
        System.out.println("请输入读者手机号：");
        String phonenumber = KeyboardUtil.readString();
        System.out.println("请输入读者家庭住址：");
        String address = KeyboardUtil.readString();
        Readers r = new Readers();
        r.setName(name);
        r.setIdcardnumber(idcardnumber);
        r.setPhonenumber(phonenumber);
        r.setAddress(address);
        int i = rs.addReaders(r);
        if (i>0){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }

    }

    public void queryReaders(){
        List<Readers> readers = rs.queryReaders();
        for (Readers r : readers){
            System.out.println("读者编号："+r.getReaderid()+"\t"+"读者姓名："+r.getName()+"\t\t"+"读者身份证号："+r.getIdcardnumber()+"\t"+"读者电话："+r.getPhonenumber()+"\t"+"读者家庭住址："+r.getAddress());
        }

    }



    public void updateReaders(){
        this.queryReaders();
        System.out.println("请输入要更改的读者编号：");
        int readersid = KeyboardUtil.readInt();
        System.out.println("请输入更改的读者姓名：");
        String name = KeyboardUtil.readString();
        System.out.println("请输入更改的读者身份证号：");
        String idcardnumber = KeyboardUtil.readString();
        System.out.println("请输入更改的读者手机号：");
        String phonenumber = KeyboardUtil.readString();
        System.out.println("请输入更改的读者家庭住址：");
        String address = KeyboardUtil.readString();
        Readers r = new Readers();
        r.setName(name);
        r.setIdcardnumber(idcardnumber);
        r.setPhonenumber(phonenumber);
        r.setAddress(address);
        r.setReaderid(readersid);
        int i = rs.updateReaders(r);
        if (i>0){
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }
    }


    //删除

    public void deleteReaders(){
        queryReaders();
        System.out.println("请输入要删除的读者编号：");
        int readerid = KeyboardUtil.readInt();
        int i = rs.deleteReaders(readerid);
        if (i>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    //根据id查询
    public void idQueryReaders(){
        System.out.println("请输入要查询的读者编号：");
        int readerid  = KeyboardUtil.readInt();
        rs.idQueryReaders(readerid);
        List<Readers> readers = rs.idQueryReaders(readerid);
        if(readers.size()==0){
            System.out.println("没有此读者信息");
        }
        for (Readers r : readers){
            System.out.println("读者编号："+r.getReaderid()+"\t"+"读者姓名："+r.getName()+"\t\t"+"读者身份证号："+r.getIdcardnumber()+"\t"+"读者电话："+r.getPhonenumber()+"\t"+"读者家庭住址："+r.getAddress());
        }

    }

    //根据姓名查询
    public void nameQueryReaders(){
        System.out.println("请输入要查询的读者姓名：");
        String name = KeyboardUtil.readString();
        rs.nameQueryReaders(name);
        List<Readers> readers = rs.nameQueryReaders(name);
        if(readers.size()==0){
            System.out.println("没有此读者信息");
        }
        for (Readers r : readers){
            System.out.println("读者编号："+r.getReaderid()+"\t"+"读者姓名："+r.getName()+"\t\t"+"读者身份证号："+r.getIdcardnumber()+"\t"+"读者电话："+r.getPhonenumber()+"\t"+"读者家庭住址："+r.getAddress());
        }

    }


    public static void main(String[] args) {
        ReadersMain rm = new ReadersMain();
        rm.operate();
    }
}
