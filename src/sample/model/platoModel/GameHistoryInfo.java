package sample.model.platoModel;

import java.time.LocalDateTime;

public class GameHistoryInfo {
    private Player player;
    private Player competitor;
    private String logId;
    private GameResult gameResult;
    private int point;
    private LocalDateTime dateTime;
    private String gameName;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getCompetitor() {
        return competitor;
    }

    public void setCompetitor(Player competitor) {
        this.competitor = competitor;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    public void setGameResult(GameResult gameResult) {
        this.gameResult = gameResult;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public GameHistoryInfo(String gameName, Player competitor, LocalDateTime dateTime, GameResult gameResult) {
        this.competitor = competitor;
        this.dateTime = dateTime;
        this.gameName = gameName;
        this.gameResult=gameResult;

    }

    //  private String instruction;
}
