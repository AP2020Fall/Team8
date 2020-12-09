package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Suggestion {
    private  Game suggestedGame;
    private LocalDateTime dateOfSuggestion;
    private String suggestionId;
    private ArrayList<Suggestion> allSugs;

    public Suggestion(Game suggestedGame, LocalDateTime dateOfSuggestion, String suggestionId) {
        this.suggestedGame = suggestedGame;
        this.dateOfSuggestion = dateOfSuggestion;
        this.suggestionId = suggestionId;
        allSugs.add(this);
    }

    public void setSuggestedGame(Game suggestedGame) {
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
