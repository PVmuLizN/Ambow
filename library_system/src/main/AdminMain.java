package main;

import po.Admin;
import service.AdminService;
import utils.KeyboardUtil;



/**
 * @author SunDengyue
 */
public class AdminMain {
    AdminService bs = new AdminService();

    public Admin start() {
        System.out.println("欢迎来到图书管理系统");
        System.out.println("请输入您的用户名:");
        String loginname = KeyboardUtil.readString();
        System.out.println("请输入您的密码:");
        String password = KeyboardUtil.readString();

        Admin admin = new Admin();
        admin.setLoginname(loginname);
        admin.setPassword(password);
        return bs.login(admin);
    }
}

// BookView.mainBook();
// int a = InPutUtil.getInt();
// switch (a) {
// case 1:
// BookView.select();

// System.out.println("请输入要查询的内容：");
// int i = InPutUtil.getInt();
// switch (i) {
// case 1:
// System.out.println("图书信息");

// break;
// case 2:
// System.out.println("读者信息");

// break;
// case 3:
// System.out.println("借阅信息");

// break;
// case 4:
// System.out.println("预约记录");

// break;
// case 5:
// System.out.println("罚款记录");

// break;
// default:
// System.out.println("输入有误,没有此选项");
// break;
// }

// break;
// case 2:
// BookView.select();
// System.out.println("请输入要新增的内容：");
// int i1 = InPutUtil.getInt();
// switch (i1) {
// case 1:
// System.out.println("图书信息");

// break;
// case 2:
// System.out.println("读者信息");

// break;
// case 3:
// System.out.println("借阅信息");

// break;
// case 4:
// System.out.println("预约记录");

// break;
// case 5:
// System.out.println("罚款记录");

// break;
// default:
// System.out.println("输入有误,没有此选项");
// break;
// }

// break;
// case 3:
// System.out.println("修改");
// BookView.select();
// System.out.println("请输入要修改的内容：");
// int i2 = InPutUtil.getInt();
// switch (i2) {
// case 1:
// System.out.println("图书信息");

// break;
// case 2:
// System.out.println("读者信息");

// break;
// case 3:
// System.out.println("借阅信息");

// break;
// case 4:
// System.out.println("预约记录");

// break;
// case 5:
// System.out.println("罚款记录");

// break;
// default:
// System.out.println("输入有误,没有此选项");
// break;
// }

// break;
// case 4:
// System.out.println("删除");
// BookView.select();
// System.out.println("请输入要删除的内容：");
// int i3 = InPutUtil.getInt();
// switch (i3) {
// case 1:
// System.out.println("图书信息");

// break;
// case 2:
// System.out.println("读者信息");

// break;
// case 3:
// System.out.println("借阅信息");

// break;
// case 4:
// System.out.println("预约记录");

// break;
// case 5:
// System.out.println("罚款记录");

// break;
// default:
// System.out.println("输入有误,没有此选项");
// break;
// }

// break;
// case 0:
// System.out.println("退出");
// System.exit(0);
// break;

// default:
// System.out.println("输入有误,没有此选项");
// break;
// }
// }else{
// System.out.println("用户名或密码错误！");
// System.out.println("1.重新输入********0.退出");

// try {
// int j = InPutUtil.getInt();
// switch (j){
// case 1:
// start();
// break;
// case 0:
// System.exit(0);
// break;
// default:
// System.out.println("输入有误");
// }
// //捕获输入类型不匹配异常
// }catch (InputMismatchException e){
// System.out.println("输入有误");
// }

// }

// }

// }
