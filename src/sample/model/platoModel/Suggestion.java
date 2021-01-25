package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Suggestion {
    private String suggestedGame;
    private LocalDate dateOfSuggestion;
    private String suggestionId;
    private Player player;
    private static ArrayList<Suggestion> allSugs=new ArrayList<>();

    public Suggestion(String suggestedGame, String suggestionId,Player player) {
        this.suggestedGame = suggestedGame;
        dateOfSuggestion= LocalDate.now();
        this.suggestionId = suggestionId;
        allSugs.add(this);
        this.player=player;
        dateOfSuggestion=LocalDate.now();
        player.getSuggestions().add(this);
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

    public void setDateOfSuggestion(LocalDate dateOfSuggestion) {
        this.dateOfSuggestion = dateOfSuggestion;
    }

    public void setSuggestionId(String suggestionId) {
        this.suggestionId = suggestionId;
    }

    public static void setAllSugs(ArrayList<Suggestion> allSugs) {
        Suggestion.allSugs = allSugs;
    }
}
