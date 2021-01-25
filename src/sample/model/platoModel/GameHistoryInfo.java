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

    public GameHistoryInfo( String gameName,Player competitor, LocalDateTime dateTime,GameResult gameResult) {
        this.competitor = competitor;
        this.dateTime = dateTime;
        this.gameName = gameName;
        this.gameResult=gameResult;

    }

    //  private String instruction;
}
