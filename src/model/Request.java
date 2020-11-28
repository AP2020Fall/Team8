package model;

public class Request {
    boolean isAccepted;
    boolean sender;
    boolean receiver;

    public Request(boolean isAccepted, boolean sender, boolean receiver) {
        this.isAccepted = isAccepted;
        this.sender = sender;
        this.receiver = receiver;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public void setSender(boolean sender) {
        this.sender = sender;
    }

    public void setReceiver(boolean receiver) {
        this.receiver = receiver;
    }
}
