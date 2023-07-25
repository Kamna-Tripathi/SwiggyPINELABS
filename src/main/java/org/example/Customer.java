package org.example;

public class Customer {
    String phoneNo;
    String userName;
    String address;
    String mail;

    public String getPhoneNo() {//Methods --every class should have atleast 2 methods
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMail(String mail) {
        this.mail = mail;

    }

    public String getMail() {
        return mail;
    }
}
