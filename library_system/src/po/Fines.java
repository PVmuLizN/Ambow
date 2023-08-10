package po;

import java.math.BigDecimal;

/**
 * ClassName: Fines
 * Package: po
 * Description: 类的描述
 *
 * @Author 陈星
 * @Create 2023/8/8 11:14
 * @Version 1.0 版本号
 */
public class Fines {
    private int fineID;
    private int borrowID;
    private int amount;
    private String reason;
    private String paymentStatus;

    public int getFineID() {
        return fineID;
    }

    public void setFineID(int fineID) {
        this.fineID = fineID;
    }

    public int getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(int borrowID) {
        this.borrowID = borrowID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
