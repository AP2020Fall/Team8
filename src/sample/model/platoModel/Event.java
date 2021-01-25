package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Event {
    private static ArrayList<Event> allEvents=new ArrayList<>();
    private String eventId;
    private String gameName;
    private LocalDate startOfGame;
    private LocalDate endOfGame;
    private int eventScore;

    public static void setAllEvents(ArrayList<Event> allEvents) {
        Event.allEvents = allEvents;
    }


    public String getGameName() {
        return gameName;
    }

    public LocalDate getStartOfGame() {
        return startOfGame;
    }

    public LocalDate getEndOfGame() {
        return endOfGame;
    }

    public int getEventScore() {
        return eventScore;
    }

    public Event(String eventId, String gameName, LocalDate startOfGame, LocalDate endOfGame, int eventScore) {
        this.eventId = eventId;
        this.gameName = gameName;
        this.startOfGame = startOfGame;
        this.endOfGame = endOfGame;
        this.eventScore = eventScore;
        allEvents.add(this);
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

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setStartOfGame(LocalDate startOfGame) {
        this.startOfGame = startOfGame;
    }

    public void setEndOfGame(LocalDate endOfGame) {
        this.endOfGame = endOfGame;
    }

    public void setEventScore(int eventScore) {
        this.eventScore = eventScore;
    }
}
