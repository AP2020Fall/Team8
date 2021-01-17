package sample.model.platoModel;

public class Request {
    boolean isAccepted;
    boolean isPending=true;
    Player sender;
    Player receiver;

    public Request(Player sender, Player receiver) {
        this.sender = sender;
        this.receiver = receiver;
       // receiver.getFriendRequest().add(this);
    }

    public void setPending(boolean pending) {
        isPending = pending;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public void setSender(Player sender) {
        this.sender = sender;
    }

    public void setReceiver(Player receiver) {
        this.receiver = receiver;
    }
}
