package model;

import java.sql.Date;

public class User {
    private String userName;
    private String passWord;
    private String name;
    private String sex;
    private int phoneNumber;
    private String email;
    private Date birthday;
    private String address;
    private int numOfPurchases;
    private String role;

    public User() {
    }

    public User(String userName, String passWord, String name, String sex,
                int phoneNumber, String email, Date birthday, String address,
                int numOfPurchases, String role){
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.numOfPurchases = numOfPurchases;
        this.role = role;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfPurchases() {
        return numOfPurchases;
    }

    public void setNumOfPurchases(int numOfPurchases) {
        this.numOfPurchases = numOfPurchases;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
