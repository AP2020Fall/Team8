package controller.reversiController;

import model.Board;
import model.ReversiGame;
import model.ReversiPlayer;
import view.ReversiBoardVisual;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversiCommandProcessor {
    public static void ShowTurn(ReversiGame reversiGame){}
    public static void ProcessCommand(String input , ReversiGame reversiGame){
        String[] splittedInput ;
        Pattern myPattern = Pattern.compile("^(place disk on )\\((\\d),(\\d)\\)$");
        Matcher matcher = myPattern.matcher(input);
        if (matcher.find()){
            int x =Integer.parseInt(matcher.group(2));
            int y =Integer.parseInt(matcher.group(3));
            if (Board.isValidCordinate(x,y)) {
                if (!reversiGame.getCurrentPlayer().hasmadeMove()){
                    if (reversiGame.getBoard().setDot(Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), reversiGame.getCurrentPlayer())) {
                        reversiGame.getCurrentPlayer().setHasMadeMove(true);
                    }
                }else{
                    System.out.println("you have made your move buddy , wait!");
                }
            }else{
                System.out.println("Coordinates must be inside the table");
            }
        }else if (input.equals("end of my turn")){
            if (reversiGame.getCurrentPlayer().hasmadeMove()) {
                reversiGame.switchCurrentPlayer();
                reversiGame.getCurrentPlayer().setHasMadeMove(false);
                System.out.println("player Changed to "+ reversiGame.getCurrentPlayer().getUsername());
                if (!CanMakeMove(reversiGame.getBoard(),reversiGame.getCurrentPlayer()) || reversiGame.getBoard().isBoardFull()){ // agar player badi natavanad harkat konad bazi ra bakhte ya age takhte por shode bashe
                    reversiGame.setGameIsOnGoing(false);
                    System.out.println("The game is finished ");
                }
            }else {
                System.out.println("in your turn you should place the disk");
            }
        }else if (input.equals("show grid")){
            ReversiBoardVisual.showBoardNull();
        }else if (input.equals("show disks")){
            ReversiBoardVisual.showBoardWithDots(reversiGame);
        }else if (input.equals("show available coordinates")){
            ReversiBoardVisual.ShowAvailableMoves(reversiGame,reversiGame.getCurrentPlayer());
        }else if (input.equals("Who is next?")){
            System.out.println("its player "+ reversiGame.getCurrentPlayer().getUsername() +"'s turn!");
        }else if (input.equals("show score")){
            ReversiBoardVisual.showPoints(reversiGame.getBoard(),reversiGame.getPlayer1(),reversiGame.getPlayer2());
        }else if(input.equals("show last move")){
            ReversiBoardVisual.showLastMove(reversiGame.getBoard());
        }else{
            System.out.println("please enter valid command");
        }

    }
    public static boolean CanMakeMove(Board board , ReversiPlayer player){
        int playerNum = player.getPlayerNum();
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (board.isValid(i,j,playerNum))
                    return true;
            }
        }
        return false;
    }

}
