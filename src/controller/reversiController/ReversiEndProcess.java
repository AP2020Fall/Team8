package controller.reversiController;

public class ReversiEndProcess {
    public static void SaveData(ReversiGame reversiGame){}
    public static void CalculatePointsAndSetWinner(ReversiGame reversiGame){
        int Player1Score = 0;
        int Player2Score = 0;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (reversiGame.getBoard().getBoard()[i][j]==1){
                    Player1Score ++;
                }else if (reversiGame.getBoard().getBoard()[i][j]==2){
                    Player2Score ++;
                }
            }
        }
        if (Player1Score > Player2Score){
            reversiGame.setWinner(reversiGame.getPlayer1());
            System.out.println("Winner is player with username :"+ reversiGame.getPlayer1().getUsername()+ " With points : " + Player1Score + "-" + Player2Score);
        }else if(Player1Score < Player2Score){
            reversiGame.setWinner(reversiGame.getPlayer2());
            System.out.println("Winner is player with username :"+ reversiGame.getPlayer2().getUsername()+ " With points : " + Player2Score + "-" + Player1Score);
        }else{ // in case the points are equal
            reversiGame.GameIsEven();
            System.out.println("both players reached the score of "+ Player1Score+" and this game is even !!");
        }
    }
}
