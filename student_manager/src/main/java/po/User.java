package po;

public class User {
    private int id;
    public  User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + sex + '\'' +
                '}';
    }

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int age;
    private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
