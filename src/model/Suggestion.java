package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Suggestion {
    private  String suggestedGame;
    private LocalDateTime dateOfSuggestion;
    private String suggestionId;
    private static ArrayList<Suggestion> allSugs;

    public Suggestion(String suggestedGame, LocalDateTime dateOfSuggestion, String suggestionId) {
        this.suggestedGame = suggestedGame;
        this.dateOfSuggestion = dateOfSuggestion;
        this.suggestionId = suggestionId;
        allSugs.add(this);
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
    public void setSuggestedGame(String suggestedGame) {
        this.suggestedGame = suggestedGame;
    }

    public void setDateOfSuggestion(LocalDateTime dateOfSuggestion) {
        this.dateOfSuggestion = dateOfSuggestion;
    }

    public void setSuggestionId(String suggestionId) {
        this.suggestionId = suggestionId;
    }

    public void setAllSugs(ArrayList<Suggestion> allSugs) {
        this.allSugs = allSugs;
    }
}
