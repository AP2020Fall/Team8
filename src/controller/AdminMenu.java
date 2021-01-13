package controller;

import model.*;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdminMenu {
    private static Admin admin;
    public static String validation(LocalDateTime start,LocalDateTime end,String score){
        if (!start.isBefore(end))
            return "start of the date must be before end";
        else if(start.isBefore(LocalDateTime.now()))
            return "start of the date must be after now";
        else if(end.isBefore(LocalDateTime.now()))
            return "end of the date must be after now";
        else if (!score.matches("\\d+"))
            return "you must enter a number!!";
return null;
    }

    public static void setAdmin(Admin admin) {
        AdminMenu.admin = admin;
    }

    public static void processAddEvent(LocalDateTime start, LocalDateTime end, int score,String gameName){
        Event event=new Event(UUID.randomUUID().toString(),gameName,start,end,score);

    }
    public void viewEvents(){
        Event.getAllEvents().toString();
    }
    public String editEvent(String field,String eventID,String newValue){
        if (field.equalsIgnoreCase("score")){
            Event.getEventWithId(eventID).setEventScore(Integer.parseInt(newValue));
        }
        else if (field.equalsIgnoreCase("game")){
            Event.getEventWithId(eventID).setGameName(newValue);
        }
        else
            return "invalid field entered";
        return null;
    }
  //  public void processViewEvent(){Event.toString()}
    public String processRemoveEvent(String  eventId){
       if (Event.getAllEvents().contains(Event.getEventWithId(eventId))){
           Event.getAllEvents().remove(Event.getEventWithId(eventId));
           return "event removed";
       }
       else return "invalid event id";

    }
    public boolean userNameValidationForSug(){return true;}
    public static String addSuggestion(String userName,String gameName){
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(userName))){
            return "invalid userName";
        }
        else if (!gameName.equalsIgnoreCase("reversi")&&!gameName.equalsIgnoreCase("dots and boxs"))
            return "invalid gameName";
        else if (!Player.getPlayerWithUser(userName).getSuggestions().isEmpty()){
        for (Suggestion suggestion : Player.getPlayerWithUser(userName).getSuggestions()) {
            if (suggestion.getSuggestedGame().equalsIgnoreCase(gameName)){
                return "you have already suggested this game";
            }
        }}
        else{
            Suggestion suggestion=new Suggestion(gameName,LocalDateTime.now(),UUID.randomUUID().toString());
            Player.getPlayerWithUser(userName).getSuggestions().add(suggestion);
            return "suggestion added successfully";
        }
        return null;

    }
  //  public void idSugValidation(String suggestionId){}
    public String  removeSuggestion(String suggestionId){
        if (Suggestion.getAllSugs().contains(Suggestion.getSugwithId(suggestionId)))
            return "suggestion removed";
        else
            return "invalid suggestino id";
    }
    public String viewUserProfile(String userName){
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(userName)))
            return Player.getPlayerWithUser(userName).toString();
        else
            return "invalid user entered";
    }
    public String  viewUsers(){
       return Player.getAllPlayers().toString();
    }

}
