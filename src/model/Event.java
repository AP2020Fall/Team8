package model;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    private ArrayList<Event> allEvents;
    private String  eventId;
    private Game gameName;
    private Date startOfGame;
    private  Date endOfGame;
    private int eventScore;

    public Event(String eventId) {
        this.eventId = eventId;
        allEvents.add(this);
    }
    public void joinEvent(Player player){}

    public void setGameName(Game gameName) {
        this.gameName = gameName;
    }

    public void setStartOfGame(Date startOfGame) {
        this.startOfGame = startOfGame;
    }

    public void setEndOfGame(Date endOfGame) {
        this.endOfGame = endOfGame;
    }

    public void setEventScore(int eventScore) {
        this.eventScore = eventScore;
    }
}
