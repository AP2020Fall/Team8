package model;

import javax.swing.*;
import java.time.LocalDateTime;
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
    private LocalDateTime platoAge;

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public static ArrayList<Account> getAllAccounts() {
        return allAccounts;
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

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getPlatoAge() {
        return platoAge;
    }

    public static Account  getAccountWithId(String id){
        for (Account account : allAccounts) {
            if (account.getAccountID()==id)
                return account;
        }
        return null;
    }

    public void setPlatoAge() {
        this.platoAge =LocalDateTime.now();
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
