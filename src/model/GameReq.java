package model;

public class GameReq {
    private Player p1;
     private Player p2;
    private Game game;

    public GameReq(Player p1, Player p2, Game game) {
        this.p1 = p1;
        this.p2 = p2;
        this.game = game;
    }

    public  void acceptReq(){

    }
    public  void sendGameReq(){
        p2.getGameReqs().add(this);
    }
}
