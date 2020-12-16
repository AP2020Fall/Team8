package controller;

import model.Admin;
import model.Player;

import java.time.LocalDateTime;
import java.util.Date;

public class AdminMenu {
    private static Admin admin;
    public void validDate(LocalDateTime start,LocalDateTime end){

    }

    public static void setAdmin(Admin admin) {
        AdminMenu.admin = admin;
    }

    public void processAddEvent(LocalDateTime start, LocalDateTime end, int score){}
    public void viewEvents(){}
    public void editEvent(String field,String eventID,String newValud){}
    public void processViewEvent(){}
    public void processRemoveEvent(){}
    public boolean userNameValidationForSug(){return true;}
    public void addSuggestion(String userName){

    }
    public void idSugValidation(String suggestionId){}
    public void  removeSuggestion(){}
    public String  viewUser(){
       return Player.getAllPlayers().toString();
    }

}
