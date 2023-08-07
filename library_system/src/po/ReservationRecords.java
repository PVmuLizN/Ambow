package po;
import java.sql.Date;

public class ReservationRecords  {

    private static final long serialVersionUID = 1L;

    private int reservationID;
    private int bookID;
    private int readerID;
    private Date reservationDate;
    private String bookTaken;

    public ReservationRecords() {
    }

    public ReservationRecords(int reservationID, int bookID, int readerID, Date reservationDate, String bookTaken) {
        this.reservationID = reservationID;
        this.bookID = bookID;
        this.readerID = readerID;
        this.reservationDate = reservationDate;
        this.bookTaken = bookTaken;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getBookTaken() {
        return bookTaken;
    }

    public void setBookTaken(String bookTaken) {
        this.bookTaken = bookTaken;
    }
}