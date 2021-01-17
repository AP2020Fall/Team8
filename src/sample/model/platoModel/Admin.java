package sample.model.platoModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import sample.model.platoModel.*;

import javax.management.StandardEmitterMBean;

public class Admin extends Account {
    public static boolean isThereAdmin=false;
    public static String adminId;
    private static ArrayList<Admin> Admin=new ArrayList<>();



    public static ArrayList<Admin> getAdmin() {
        return Admin;
    }

    public Admin(String userName, String passWord) {
        super(userName, passWord);
        Admin.add(this);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }
    public void addEvent(LocalDateTime start, LocalDateTime end, String gameName, int score){
        Event event=new Event( UUID.randomUUID().toString(),gameName,start,end,score);
    }
    public void addSuggestions(String user){}
    public void removeSuggestion(){}

}
