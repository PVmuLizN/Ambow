
import java.util.List;

import main.AdminMain;
import main.BooksMain;
import main.BorrowreCordsCordsMain;
import main.FinesMain;
import main.ReadersMain;
import main.ReservationRecordsMain;
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
        // int i = 5;

        while (true) {
            // System.out.println("您还有" + i + "次机会");
            adminCheck = am.start();
            if (adminCheck != null)
                break;
            // i--;
        }
        // if (i < 1) System.exit(0); // 5 次机会

        while (true) {
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

                            if (!books.isEmpty()) {
                                for (Books book : books) {
                                    if (book == null) {
                                        System.out.println("没有找到书籍");
                                    } else {
                                        System.out.println("");
                                        System.out.println(
                                                book.getId() + ", " + book.getIsbn() + ", " + book.getTitle() + ", "
                                                        + book.getAuthor() + ", " +
                                                        book.getPublisher() + ", " + book.getPublicationDate()
                                                        + ", " + book.getStatus());
                                    }

                                }
                            } else {
                                System.out.println("没有找到书籍");
                            }
                            break;
                        case 2:
                            Books book = new Books();
                            int res = bm.modifyBooks(book);
                            if (res != 0) {
                                System.out.println("修改成功！");
                            } else {
                                System.out.println("修改失败");
                            }
                            break;

                    }
                    break;
                case 2:
                    BorrowreCordsCordsMain bcm = new BorrowreCordsCordsMain();
                    bcm.BorrowCaords();
                    break;
                case 3:
                    FinesMain fm = new FinesMain();
                    fm.Fines();
                    break;
                case 4:
                    ReadersMain rm = new ReadersMain();
                    rm.operate();
                    break;
                case 5:
                    ReservationRecordsMain rrm = new ReservationRecordsMain();
                    rrm.RRmain();
                    break;
                case 0:
                    StartView.mainView();
                    break;
                default:
                    System.out.println("请重新选择");
                    StartView.mainView();
                    break;

            }

        }
    }
}
