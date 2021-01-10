package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    private static ArrayList<Event> allEvents=new ArrayList<>();
    private String  eventId;
    private String gameName;
    private LocalDateTime startOfGame;
    private  LocalDateTime endOfGame;
    private int eventScore;

    public Event(String eventId, String gameName, LocalDateTime startOfGame, LocalDateTime endOfGame, int eventScore) {
        this.eventId = eventId;
        this.gameName = gameName;
        this.startOfGame = startOfGame;
        this.endOfGame = endOfGame;
        this.eventScore = eventScore;
    }

    public String getEventId() {
        return eventId;
    }

    public static Event getEventWithId(String eventId){
        for (Event event : allEvents) {
            if(event.getEventId().equals(eventId))
                return event;
        }
        return null;
    }
    public void joinEvent(Player player){}

    public static ArrayList<Event> getAllEvents() {
        return allEvents;
    }

    public void setGameName(String  gameName) {
        this.gameName = gameName;
    }

    public void setStartOfGame(LocalDateTime startOfGame) {
        this.startOfGame = startOfGame;
    }

    public void setEndOfGame(LocalDateTime endOfGame) {
        this.endOfGame = endOfGame;
    }

    public void setEventScore(int eventScore) {
        this.eventScore = eventScore;
    }
}
