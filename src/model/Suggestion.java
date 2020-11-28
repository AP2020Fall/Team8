package model;

import java.util.Date;

public class Suggestion {
    private  Game suggestedGame;
    private Date  dateOfSuggestion;
    private String suggestionId;

    public Suggestion(Game suggestedGame, Date dateOfSuggestion, String suggestionId) {
        this.suggestedGame = suggestedGame;
        this.dateOfSuggestion = dateOfSuggestion;
        this.suggestionId = suggestionId;
    }
}
