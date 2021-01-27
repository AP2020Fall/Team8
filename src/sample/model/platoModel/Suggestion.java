package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Suggestion {
    private String suggestedGame;
    private String dateOfSuggestion;
    private String suggestionId;
    private String player;
    private static ArrayList<Suggestion> allSugs=new ArrayList<>();
    private LocalDate date;

    public Suggestion(String suggestedGame, String suggestionId,String player) {
        this.suggestedGame = suggestedGame;
      //  dateOfSuggestion= LocalDate.now();
        this.suggestionId = suggestionId;
        allSugs.add(this);
        this.player=player;
        Player.getPlayerWithUser(player).getSuggestions().add(this);
        date=LocalDate.now();
        dateOfSuggestion=date.toString();
    }

    public String getDateOfSuggestion() {
        return dateOfSuggestion;
    }

    public String getPlayer() {
        return player;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSuggestionId() {
        return suggestionId;
    }

    public String getSuggestedGame() {
        return suggestedGame;
    }

    public static ArrayList<Suggestion> getAllSugs() {
        return allSugs;
    }

    public static Suggestion getSugwithId(String idSug){
        for (Suggestion sug : allSugs) {
            if (sug.getSuggestionId().equals(idSug))
                return sug;
        }
        return null;
    }

}
