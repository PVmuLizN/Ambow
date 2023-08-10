package po;

/**
 * ClassName: aaaaaa
 * Package: main
 * Description: 类的描述
 *
 * @Author 王志鹏
 * @Create 2023/8/10 16:05
 * @Version 1.0 版本号
 */
public class ReservationRecords {
    private int ReservationID;
    private  int BookID;
    private int ReaderID;
    private String ReservationDate;
    private String BookTaken;

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public int getReaderID() {
        return ReaderID;
    }

    public void setReaderID(int readerID) {
        ReaderID = readerID;
    }

    public String getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(String reservationDate) {
        ReservationDate = reservationDate;
    }

    public String getBookTaken() {
        return BookTaken;
    }

    public void setBookTaken(String bookTaken) {
        BookTaken = bookTaken;
    }
}
