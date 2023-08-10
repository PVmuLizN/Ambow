import java.util.ArrayList;
import java.util.List;

import main.AdminMain;
import main.BooksMain;
import po.Admin;
import po.Books;
import service.AdminService;
import utils.KeyboardUtil;
import view.StartView;

public class App {

    public static void main(String[] args) {
        BooksMain bm = null;
        AdminService as = new AdminService();
        AdminMain am = new AdminMain();
        Admin adminCheck = null;
        int i = 5;

        while (i > 0) {
            System.out.println("您还有" + i + "次机会");
            adminCheck = am.start();
            if (adminCheck != null)
                break;
            i--;
        }
        if (i < 1) System.exit(0); // 5 次机会 退出
        StartView.mainView();

        int choose = KeyboardUtil.readInt();
        switch (choose) {

            case 1:
                bm = new BooksMain();
                System.out.println("1.图书查询\t2.图书修改");
                int choice = KeyboardUtil.readInt();
                switch (choice) {
                    case 1:
                        List<Books> books = bm.queryBooks();

                        if (books.size() > 0) {
                            for (Books book : books) {
                                System.out.println("");
                                System.out.println(book.getId() + book.getIsbn() + book.getTitle() + book.getAuthor() +
                                        book.getPublisher() + book.getPublicationDate() + book.getStatus());
                            }
                        } else {
                            System.out.println("没有找到书籍");
                        }
                    case 2:
                        Books book = new Books();
                        int res = bm.modifyBooks(book);
                        if (res != 0) {
                            System.out.println("修改成功！");
                        } else {
                            System.out.println("修改失败");
                        }

                }

            case 2:

        }

    }

    private static boolean checkUser(Admin admin) {
        return admin != null;
    }
    // public static void main(String[] args) throws Exception {
    // if (users != null) {
    // // 登录成功调用主界面
    // StartView.mainView();
    // // 接收选择的数值
    // int a = KeyboardUtil.readInt();
    // switch (a) {
    // case 1:
    // System.out.println("查询");
    // this.queryAllNews();
    // break;
    // case 2:
    // System.out.println("新增");
    // this.addNews();
    // break;
    // case 3:
    // System.out.println("修改");
    // this.queryAllNews();

    // break;
    // case 4:
    // System.out.println("删除");
    // this.queryAllNews();

    // break;
    // case 0:
    // System.out.println("退出......");
    // // 系统正常退出
    // System.exit(0);
    // break;

    // default:
    // System.out.println("没有此选项，请重新输入：");
    // break;
    // }

    // } else {
    // System.out.println("登录失败");
    // }
    // }
}
