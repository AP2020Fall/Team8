package model;

public abstract class GamePlayer {
    private Player player;
    private int currentScore;
    private int totalScore;
    private boolean isMyTurn;
    private GameResult result;
    private Game chosenGame;
    public abstract void increaseScore();
    public abstract void endTurn();

    public GamePlayer(Player player) {
        this.player = player;
    }
}
