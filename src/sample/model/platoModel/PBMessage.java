package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PBMessage {
    private  String message;
    private String  time;
    private  Player user;


    public PBMessage(String message) {
        this.message = message;
      //  this.time = time;
       LocalDate timeSent = LocalDate.now();

        time = timeSent.format(DateTimeFormatter.ofPattern("hh:mm"));

    }

    public void setUser(Player user) {
        this.user = user;
    }
}
