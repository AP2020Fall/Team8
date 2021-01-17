package sample.model.reversiModel;

public class Board {
    public int[][] Boards = new int[9][9];
    // 0 is for free spot , 1 for player 1 , 2 for player 2
    private int lastX , lastY;
    public Board(){
        // initialising the Boards
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                this.Boards[i][j]=0;
            }
        }
        //Placing the first ones
        this.Boards[4][4]=1;
        this.Boards[5][5]=1;
        this.Boards[4][5]=2;
        this.Boards[5][4]=2;
        this.lastX=0;
        this.lastY=0;
    }
    public int[][] getBoard() {
        return Boards;
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

