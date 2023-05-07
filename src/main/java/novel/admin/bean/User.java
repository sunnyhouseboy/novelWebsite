package novel.admin.bean;

import javax.management.relation.Role;

public class User {
    private int id;
    private String username;
    private String password;
    private Integer age;
    private int isWriter;
    private int isVip;
    private String bookshelf;
    private String concern;
    private String phoneNumber;
    private String sex;
    private String avatar;

    public User() {
    }

    public User(int id, String username, String password, Integer age, int isWriter, int isVip, String bookshelf, String concern, String phoneNumber, String sex, String avatar) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.isWriter = isWriter;
        this.isVip = isVip;
        this.bookshelf = bookshelf;
        this.concern = concern;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getIsWriter() {
        return isWriter;
    }

    public void setIsWriter(int isWriter) {
        this.isWriter = isWriter;
    }

    public int getIsVip() {
        return isVip;
    }

    public void setIsVip(int isVip) {
        this.isVip = isVip;
    }

    public String getBookshelf() {
        return bookshelf;
    }

    public void setBookshelf(String bookshelf) {
        this.bookshelf = bookshelf;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", isWriter=" + isWriter +
                ", isVip=" + isVip +
                ", bookshelf='" + bookshelf + '\'' +
                ", concern='" + concern + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}