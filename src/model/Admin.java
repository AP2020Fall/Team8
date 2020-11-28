package model;

import java.util.ArrayList;

public class Admin extends Account {
    private static ArrayList<Admin> Admin;

    public static ArrayList<model.Admin> getAdmin() {
        return Admin;
    }

    public Admin(String userName, String passWord) {
        super(userName, passWord);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }
    public void addEvent(){}
    public void addSuggestions(){}
    public void removeSuggestion(){}

}
