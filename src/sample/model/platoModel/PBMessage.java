package sample.model.platoModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PBMessage {
  //  private String dateOfSuggestion;
    private  String message;
 //   private String  time;
 //   private  Player user;
    private LocalDate date;


    public PBMessage(String message) {
        this.message = message;
        date=LocalDate.now();
      //  this.time = time;


    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
