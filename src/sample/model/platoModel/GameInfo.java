package sample.model.platoModel;

import java.time.LocalDateTime;

public class GameInfo {
    private Player player;
    private Player competitor;
    private String logId;
    private GameResult gameResult;
    private int point;
    private LocalDateTime dateTime;
    private String gameName;

    public GameInfo(Player player, Player competitor, String logId, LocalDateTime dateTime, String gameName) {
        this.player = player;
        this.competitor = competitor;
        this.logId = logId;
        this.dateTime = dateTime;
        this.gameName = gameName;
    }
    //  private String instruction;
}
