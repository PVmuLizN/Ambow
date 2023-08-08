package main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import po.Admin;
import po.Books;
import service.BooksService;
import service.service_impl.BooksServiceImpl;
import utils.KeyboardUtil;
import view.BooksView;
/**
 * @time Tue Aug  8 11:58:07 CST 2023
 * @implNote 目前这个类中的所有增删改查方法的返回值类型与service相同，将来要改成自然语言提示（void）.
 */
public class LibraryMain {
    private BooksService bs = null;

    public void start() {
        System.out.println("欢迎来到图书信息管理系统");
        System.out.println("请输入您的用户名");
        String loginName = KeyboardUtil.readString();
        System.out.println("Input your password: ");
        String password = KeyboardUtil.readString();
        System.out.println(loginName + password);

        Admin user = new Admin(loginName, password);

        Admin users = new User();
        users = bs.login(user);
        if (users != null) {
            // 登录成功调用主界面
            BooksView.mainView();
            // 接收选择的数值
            int a = KeyboardUtil.readInt();
            switch (a) {
                case 1:
                    System.out.println("查询");
                    this.queryBooks();
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

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryBooks() {
        bs = new BooksServiceImpl();
        List<Books> booksRes = new ArrayList();
        System.out.println("1.query all books\t2.query by id\t3.query by isbn\t4.query by conditions");
        int choice = KeyboardUtil.readInt();
        switch (choice) {
            case 1:
                this.queryAllBooks();
                break;
            case 2:

                System.out.println("请输入书籍id:");
                int id = KeyboardUtil.readInt();
                booksRes.add(this.queryBooksById(id));
                break;
            case 3:
                System.out.println("input isbn");
                String isbn = KeyboardUtil.readString();
                booksRes.add(this.queryBooksByIsbn(isbn);
                break;
            case 4:
                System.out.println("input title");
                String title = KeyboardUtil.readString();
                System.out.println("input publisher");
                String publisher = KeyboardUtil.readString();
                System.out.println("input publish date");
                Date date = KeyboardUtil.readDate();
                System.out.println("input status");
                String status = KeyboardUtil.readString();
                List<Books> booksByTitle = this.queryBooksByTitle(title);
                List<Books> booksByPublisher = this.queryBooksByPublisher(publisher);
                List<Books> booksByDate= this.queryBooksByPublicationDate(date);
                List<Books> booksByStatus = this.queryBooksByStatus(status);

                booksRes = getIntersection(booksByTitle, booksByPublisher, booksByDate, booksByStatus);
            default:
                System.out.println("Something went wrong!!!");

        }
        return booksRes;

    }

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryAllBooks() {
        return bs.queryAllBooks();
    }

    /**
     * @author weihuanchun
     * @return
     */
    private Books queryBooksById(int id) {
        return bs.queryBooksById(id);
    }

    /**
     * @author weihuanchun
     * @return
     */
    private Books queryBooksByIsbn(String isbn) {
        return bs.queryBooksByIsbn(isbn);
    }

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryBooksByTitle(String title) {
        return bs.queryBooksByTitle(title);
    }

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryBooksByPublisher(String publisher) {
        return bs.queryBooksByPublisher(publisher);
    }

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryBooksByPublicationDate(Date date) {
        return bs.queryBooksByPublicationDate(date);
    }

    /**
     * @author weihuanchun
     * @return
     */
    private List<Books> queryBooksByStatus(String status) {
        return bs.queryBooksByStatus(status);
    }

    /**
     * @author weihuanchun
     * @purpose 取交集
     * @return
     */
    private static ArrayList<Books> getIntersection(List<Books> booksByTitle, List<Books> booksByPublisher,
            List<Books> booksByDate, List<Books> booksByStatus) {
        ArrayList<Books> intersection = new ArrayList<>();
        for (int i = 0; i < booksByTitle.size(); i++) {
            Books element = booksByTitle.get(i);
            if (booksByPublisher.contains(element) && booksByDate.contains(element)
                    && booksByStatus.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }

}
