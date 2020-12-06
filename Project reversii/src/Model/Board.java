package Model;

import java.awt.*;

public class Board {
    private int[][] Board = new int[9][9];
    // 0 is for free spot , 1 for player 1 , 2 for player 2
    private int lastX , lastY;
    public int[][] getBoard() {
        return Board;
    }
    public void setDot(int x , int y , int playerNum){

    }
    public boolean isValid(int x , int y , int playerNum){
        return (isValidUp(x,y,playerNum) ||
                isValidDown(x,y,playerNum) ||

                )
    }
    public boolean isValidUp(int x , int y , int playerNum){
       int otherPlayerNum =1;
       if ( playerNum == 1){
           otherPlayerNum =2;
       }
       int iterator = y+1;
       while (this.Board[x][iterator] == otherPlayerNum && iterator <=8){
           iterator++;
       }
       if (iterator == 9){
           return false;
       }else if( this.Board[x][iterator] == playerNum){
           return true;
       }else if ( this.Board[x][iterator] == 0){
           return false;
       }
       return false;
    }
    public boolean isValidDown(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = y-1;
        while (this.Board[x][iterator] == otherPlayerNum && iterator >=1){
            iterator--;
        }
        if (iterator == 0){
            return false;
        }else if( this.Board[x][iterator] == playerNum){
            return true;
        }else if ( this.Board[x][iterator] == 0){
            return false;
        }
        return false;
    }
    public boolean isValidLeft(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = x-1;
        while (this.Board[iterator][y] == otherPlayerNum && iterator >=1){
            iterator--;
        }
        if (iterator == 0){
            return false;
        }else if( this.Board[iterator][y] == playerNum){
            return true;
        }else if ( this.Board[iterator][y] == 0){
            return false;
        }
        return false;
    }
    public void setLastX(int lastX) {
        this.lastX = lastX;
    }

    public void setLastY(int lastY) {
        this.lastY = lastY;
    }

    public int getLastX() {
        return lastX;
    }

    public int getLastY() {
        return lastY;
    }
}

