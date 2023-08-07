package po;

public class Readers {
    private int readerID;
    private String name;
    private String IDCardNumber;
    private String phoneNumber;
    private String address;

    public Readers() {
    }

    public Readers(int readerID, String name, String IDCardNumber, String phoneNumber, String address) {
        this.readerID = readerID;
        this.name = name;
        this.IDCardNumber = IDCardNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDCardNumber() {
        return IDCardNumber;
    }

    public void setIDCardNumber(String IDCardNumber) {
        this.IDCardNumber = IDCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
