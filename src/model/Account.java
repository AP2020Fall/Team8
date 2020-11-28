package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private String lastName;
    private String userName;
    private String accountID;
    private String passWord;
    private String email;
    private String phone;
    private static ArrayList<Account> allAccounts;
    private Date platoAge;

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }
    public void setDetails(String name,String lastName,String accountID,String email,String phone){
        this.name=name;
        this.lastName=lastName;
        this.accountID=accountID;
        this.email=email;
        this.phone=phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setPlatoAge(Date platoAge) {
        this.platoAge = platoAge;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
