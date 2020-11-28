package model;

public class DotsAndBoxes extends Game {
    public DotsAndBoxes(String gameId, GamePlayer playerOne, GamePlayer playerTwo) {
        super(gameId, playerOne, playerTwo);
    }

      public   boolean isValid(int x1,int x2,int y1,int y2){return true;}

      public   void showValidPosition(){}

       public void showGrid(){}

     public    void drawLine(){}

       public void setLineColor(){}

      public   void showLines(){}

       public void showPossibleDots(){}

      public   void showResult(){}

       public void showScore(){}







public class Board{
    private int[][] Board = new int[8][8];
    private int lastX , lastY;
    public int[][] getBoard() {
        return Board;
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
}}
