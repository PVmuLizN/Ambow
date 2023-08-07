package main;

import utils.KeyboardUtil;

public class LibraryMain {
    public void start() {
        System.out.println("欢迎来到图书信息管理系统");
        System.out.println("请输入您的用户名");
        String loginName = KeyboardUtil.readString();
        System.out.println("Input your password: ");
        String password = KeyboardUtil.readString();
        System.out.println(loginName + password);

        User user = new User(loginName, password);

        User users = new User();
        users = bs.login(user);
        if (users != null) {
            // 登录成功调用主界面
            BooksView.mainView();
            // 接收选择的数值
            int a = KeyboardUtil.readInt();
            switch (a) {
                case 1:
                    System.out.println("查询");
                    this.queryAllBooks();
                    break;
                case 2:
                    System.out.println("新增");
                    this.addBooks();
                    break;
                case 3:
                    System.out.println("修改");
                    this.updateBooks();

                    break;
                case 4:
                    System.out.println("删除");
                    this.deleteBooks();

                    break;
                case 0:
                    System.out.println("退出......");
                    // 系统正常退出
                    System.exit(0);
                    break;

                default:
                    System.out.println("没有此选项，请重新输入：");
                    break;
            }

        } else {
            System.out.println("登录失败");
        }

    }
}
