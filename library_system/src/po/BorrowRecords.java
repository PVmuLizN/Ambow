package po;

import java.sql.Date;

public class BorrowRecords {

    private int borrowID;
    private int bookID;
    private int readerID;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private String returned;

    public BorrowRecords() {
    }

    public BorrowRecords(int borrowID, int bookID, int readerID, Date borrowDate, Date dueDate, Date returnDate,
            String returned) {
        this.borrowID = borrowID;
        this.bookID = bookID;
        this.readerID = readerID;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public int getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(int borrowID) {
        this.borrowID = borrowID;
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

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }
}