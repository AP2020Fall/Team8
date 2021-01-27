package sample.model.platoModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import sample.model.platoModel.*;

import javax.management.StandardEmitterMBean;

public class Admin{
    public static boolean isThereAdmin=false;
    public static String adminId;
    private static ArrayList<Admin> Admin=new ArrayList<>();
    private String name;
    private String lastName;
    private String userName;
    private String accountID;
    private String passWord;
    private String email;
    private String phone;
    private LocalDateTime platoAge;


    public void setDetails(String name, String lastName, String accountID, String email, String phone){
        this.name=name;
        this.lastName=lastName;
        this.accountID=accountID;
        this.email=email;
        this.phone=phone;
        System.out.println(this.getAccountID()+" "+name+" "+lastName+" "+accountID+" "+email);
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


    public void setPlatoAge() {
        this.platoAge = LocalDateTime.now();
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
    public static ArrayList<Admin> getAdmin() {
        return Admin;
    }
    public static Admin getAdminWithUser(String user){
        for (sample.model.platoModel.Admin admin : Admin) {
            if (admin.getUserName().equalsIgnoreCase(user))
                return admin;
        }
        return null;
    }

    public String getUserName() {
        return userName;
    }

    public Admin(String userName, String passWord) {
       this.userName=userName;
       this.passWord=passWord;
        Admin.add(this);
    }

    public void addSuggestions(String user){}
    public void removeSuggestion(){}

    public static void setAdmin(ArrayList<sample.model.platoModel.Admin> admin) {
        Admin = admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPlatoAge(LocalDateTime platoAge) {
        this.platoAge = platoAge;
    }
}
