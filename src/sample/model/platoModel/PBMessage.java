package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PBMessage {
    private  String message;
    private LocalDate time;
    private  Player user;


    public PBMessage(String message, LocalDate time) {
        this.message = message;
        this.time = time;
    }

    public void setUser(Player user) {
        this.user = user;
    }
}
