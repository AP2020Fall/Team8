package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    private ArrayList<Event> allEvents;
    private String  eventId;
    private Game gameName;
    private LocalDateTime startOfGame;
    private  LocalDateTime endOfGame;
    private int eventScore;

    public Event(String eventId, Game gameName, LocalDateTime startOfGame, LocalDateTime endOfGame, int eventScore) {
        this.eventId = eventId;
        this.gameName = gameName;
        this.startOfGame = startOfGame;
        this.endOfGame = endOfGame;
        this.eventScore = eventScore;
    }

    public void joinEvent(Player player){}

    public void setGameName(Game gameName) {
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
