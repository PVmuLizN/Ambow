package po;

public class Admin {
    private int id;
    private String password;
    private Enum authority;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the authority
     */
    public Enum getAuthority() {
        return authority;
    }

    /**
     * @param authority the authority to set
     */
    public void setAuthority(Enum authority) {
        this.authority = authority;
    }

    /**
     * @param id
     * @param password
     * @param authority
     */
    public Admin(int id, String password, Enum authority) {
        this.id = id;
        this.password = password;
        this.authority = authority;
    }

    public Admin() {
    }
}
