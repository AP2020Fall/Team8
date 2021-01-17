package sample.model.platoModel;



public class Board {
  /*  public int[][] Boards = new int[9][9];
    // 0 is for free spot , 1 for player 1 , 2 for player 2
    private int lastX , lastY;
    public Board(){
        // initialising the Boards
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
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

    public boolean setDot(int x , int y , @NotNull ReversiPlayer player) {
        int playerNum = player.getPlayerNum();
        if (isValid(x, y, playerNum) && isEmpty(x, y)) {
            Boards[x][y] = playerNum;
            BoardVisual.MoveDone(x, y, player.getPlayerNum());
            setLastX(x);
            setLastY(y);
        } else {
            BoardVisual.NotValidMoveError();
            return false;
        }
        if (isValidUp(x, y, playerNum))
            changeUp(x, y, playerNum);
        if (isValidUpright(x, y, playerNum))
            changeUpright(x, y, playerNum);
        if (isValidUpleft(x, y, playerNum))
            changeUpleft(x, y, playerNum);
        if (isValidLeft(x, y, playerNum))
            changeLeft(x, y, playerNum);
        if (isValidRight(x, y, playerNum))
            changeRight(x, y, playerNum);
        if (isValidDownRight(x, y, playerNum))
            changeDownright(x, y, playerNum);
        if (isValidDownleft(x, y, playerNum))
            changeDownleft(x, y, playerNum);
        if (isValidDown(x, y, playerNum))
            changeDown(x, y, playerNum);
        return true;
    }

    public boolean isEmpty(int x , int y){
        if (Boards[x][y]==0){
            return true;
        }
        return false;
    }
    @Test
    public void isEmptyTest(){
        Board board = new Board();
        assertFalse(board.isEmpty(4,4));
        assertTrue(board.isEmpty(4,6));
    }
    public boolean isBoardFull(){
        int n = 0;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (this.Boards[i][j]!=0)
                    n++;
            }
        }
        if (n == 64){
            return true;
        }
        return false;
    }
    @Test
    public void isBoardFullTest(){
        Board board = new Board();
        assertFalse(board.isBoardFull());
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                board.getBoard()[i][j]=1;
            }
        }
        assertTrue(board.isBoardFull());
    }
    public void changeUp(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x][y+i] != playerNum ){
            this.Boards[x][y+i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeUpTest(){
        changeUp(4,3,2);
        assertEquals(getBoard()[4][4],2);
    }
    public void changeDown(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x][y-i] != playerNum ){
            this.Boards[x][y-i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeDownTest(){
        changeDown(4,6,1);
        assertEquals(getBoard()[4][4],1);
    }
    public void changeRight(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x+i][y] != playerNum ){
            this.Boards[x+i][y]=playerNum;
            i++;
        }
    }
    @Test
    public void changeRightTest(){
        changeRight(3,4,2);
        assertEquals(getBoard()[4][4],2);
    }
    public void changeLeft(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x-i][y] != playerNum ){
            this.Boards[x-i][y]=playerNum;
            i++;
        }
    }
    @Test
    public void changeLeftTest(){
        changeLeft(6,4,1);
        assertEquals(getBoard()[5][4],1);
    }
    public void changeUpright(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x+i][y+i] != playerNum && isValidCordinate(x+i,y+i)){
            this.Boards[x+i][y+i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeUprightTest(){
        getBoard()[6][6]=2;
        changeUpright(3,3,2);
        assertEquals(getBoard()[4][4],2);
        assertEquals(getBoard()[5][5],2);
        assertEquals(getBoard()[4][5],2);
        assertEquals(getBoard()[5][4],2);
    }
    public void changeUpleft(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x-i][y+i] != playerNum && isValidCordinate(x-i,y+i)){
            this.Boards[x-i][y+i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeUpleftTest(){
        getBoard()[3][6]=1;
        changeUpleft(6,3,1);
        assertEquals(getBoard()[4][4],1);
        assertEquals(getBoard()[5][5],1);
        assertEquals(getBoard()[4][5],1);
        assertEquals(getBoard()[5][4],1);
        assertEquals(getBoard()[2][7],0);
    }
    public void changeDownleft(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x-i][y-i] != playerNum && isValidCordinate(x-i,y-i)){
            this.Boards[x-i][y-i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeDownleftTest(){
        getBoard()[3][3]=2;
        changeDownleft(6,6,2);
        assertEquals(getBoard()[4][4],2);
        assertEquals(getBoard()[5][5],2);
        assertEquals(getBoard()[4][5],2);
        assertEquals(getBoard()[5][4],2);
        assertEquals(getBoard()[2][7],0);
    }
    public void changeDownright(int x , int y , int playerNum){
        int i = 1;
        while (this.Boards[x+i][y-i] != playerNum && isValidCordinate(x+i,y-i)){
            this.Boards[x+i][y-i]=playerNum;
            i++;
        }
    }
    @Test
    public void changeDownrightTest(){
        getBoard()[6][4]=2;
        changeDownright(4,6,2);
        assertEquals(getBoard()[4][4],1);
        assertEquals(getBoard()[5][5],2);
        assertEquals(getBoard()[4][5],2);
        assertEquals(getBoard()[5][4],2);
        assertEquals(getBoard()[2][7],0);
    }
    // for being valid its need to be valid in minimum of 1 of the ways and it needs to be empty
    public boolean isValid(int x , int y , int playerNum){
        return ((isValidUp(x,y,playerNum) ||
                isValidDown(x,y,playerNum) ||
                isValidLeft(x,y,playerNum) ||
                isValidRight(x,y,playerNum) ||
                isValidDownleft(x,y,playerNum) ||
                isValidDownRight(x,y,playerNum)||
                isValidUpleft(x,y,playerNum) ||
                isValidUpright(x,y,playerNum)) && isEmpty(x,y)
        );
    }
    @Test
    public void isValidTest2(){
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (isValid(i,j,1)){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    @Test
    public void isValidTest(){
        assertTrue(isValid(3,4,2));
        assertFalse(isValid(2,2,1));
        assertFalse(isValid(3,3,2));
        getBoard()[6][6]=2;
        assertTrue(isValid(3,3,2));
        assertTrue(isValid(7,7,1));
    }
    public boolean isValidUp(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = y+1;
        while ( iterator <=8 && this.Boards[x][iterator] == otherPlayerNum){
            iterator++;
        }
        if (iterator == 9){
            return false;
        }else if( this.Boards[x][iterator] == playerNum && iterator!=y+1){
            return true;
        }else if ( this.Boards[x][iterator] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidUpTest(){
        Board board = new Board();
        assertTrue(board.isValidUp(4,3,2));
        assertFalse(board.isValidUp(4,4,2));
        assertTrue(board.isValidUp(5,3,1));
        assertFalse(board.isValidUp(4,5,2));
    }

    public boolean isValidDown(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = y-1;
        while (iterator >=1 && this.Boards[x][iterator] == otherPlayerNum  ){
            iterator--;
        }
        if (iterator == 0){
            return false;
        }else if( this.Boards[x][iterator] == playerNum && iterator!=y-1){
            return true;
        }else if ( this.Boards[x][iterator] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidDownTest(){
        Board board = new Board();
        assertTrue(board.isValidDown(4,6,1));
        assertTrue(board.isValidDown(5,6,2));
        assertFalse(board.isValidDown(1,1,1));
    }
    public boolean isValidLeft(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = x-1;
        while ( iterator >=1 && this.Boards[iterator][y] == otherPlayerNum ){
            iterator--;
        }
        if (iterator == 0){
            return false;
        }else if( this.Boards[iterator][y] == playerNum && iterator!=x-1){
            return true;
        }else if ( this.Boards[iterator][y] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidLeftTest(){
        Board board = new Board();
        assertTrue(board.isValidLeft(6,5,2));
        assertTrue(board.isValidLeft(6,4,1));
        assertFalse(board.isValidLeft(6,4,2));
        assertFalse(board.isValidLeft(2,3,2));
        assertFalse(board.isValidLeft(7,4,1));
    }
    public boolean isValidRight(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int iterator = x+1;
        while ( iterator <= 8 && this.Boards[iterator][y] == otherPlayerNum ){
            iterator++;
        }
        if (iterator == 9){
            return false;
        }else if( this.Boards[iterator][y] == playerNum && iterator!= x+1){
            return true;
        }else if ( this.Boards[iterator][y] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidRightTest(){
        Board board = new Board();
        assertTrue(board.isValidRight(3,5,1));
        assertTrue(board.isValidRight(3,4,2));
        assertFalse(board.isValidRight(6,4,2));
        assertFalse(board.isValidRight(2,3,2));
        assertFalse(board.isValidRight(7,4,1));
    }
    public boolean isValidUpright(int x , int y , int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while (isValidCordinate(x+i , y+i) && this.Boards[x+i][y+i] == otherPlayerNum){
            i++;
        }
        if (!isValidCordinate(x+i,y+i)){
            return false;
        }else if( this.Boards[x+i][y+i] == playerNum && i!=1){
            return true;
        }else if ( this.Boards[x+i][y+i] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidUprightTest(){
        Board board = new Board();
        board.getBoard()[6][6]=2;
        assertTrue(board.isValidUpright(3,3,2));
        assertFalse(board.isValidUpright(3,4,2));
        assertFalse(board.isValidUpright(6,4,2));
        assertFalse(board.isValidUpright(2,3,2));
        assertFalse(board.isValidUpright(7,4,1));
    }
    public boolean isValidUpleft(int x , int y, int playerNum) {
        int otherPlayerNum = 1;
        if (playerNum == 1) {
            otherPlayerNum = 2;
        }
        int i = 1;
        while ( isValidCordinate(x - i, y + i) && this.Boards[x - i][y + i] == otherPlayerNum ) {
            i++;
        }
        if (!isValidCordinate(x - i, y + i)) {
            return false;
        } else if (this.Boards[x - i][y + i] == playerNum && i != 1) {
            return true;
        } else if (this.Boards[x - i][y + i] == 0) {
            return false;
        }
        return false;
    }
    @Test
    public void isValidUpleftTest(){
        Board board = new Board();
        board.getBoard()[3][6]=1;
        assertTrue(board.isValidUpleft(6,3,1));
        assertFalse(board.isValidUpleft(3,4,2));
        assertFalse(board.isValidUpleft(6,4,2));
        assertFalse(board.isValidUpleft(2,3,2));
        assertFalse(board.isValidUpleft(7,4,1));
    }
    public boolean isValidDownleft(int x , int y, int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while ( isValidCordinate(x-i , y-i) && this.Boards[x-i][y-i] == otherPlayerNum  ){
            i++;
        }
        if (!isValidCordinate(x-i,y-i)){
            return false;
        }else if( this.Boards[x-i][y-i] == playerNum && i!=1){
            return true;
        }else if ( this.Boards[x-i][y-i] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidDownleftTest(){
        Board board = new Board();
        board.getBoard()[3][3]=2;
        assertTrue(board.isValidDownleft(6,6,2));
        assertFalse(board.isValidDownleft(3,4,2));
        assertFalse(board.isValidDownleft(6,4,2));
        assertFalse(board.isValidDownleft(2,3,2));
        assertFalse(board.isValidDownleft(7,4,1));
    }
    public boolean isValidDownRight(int x , int y, int playerNum){
        int otherPlayerNum =1;
        if ( playerNum == 1){
            otherPlayerNum =2;
        }
        int i = 1;
        while ( isValidCordinate(x+i , y-i) && this.Boards[x+i][y-i] == otherPlayerNum  ){
            i++;
        }
        if (!isValidCordinate(x+i,y-i)){
            return false;
        }else if( this.Boards[x+i][y-i] == playerNum && i!=1){
            return true;
        }else if ( this.Boards[x+i][y-i] == 0){
            return false;
        }
        return false;
    }
    @Test
    public void isValidDownrightTest(){
        Board board = new Board();
        board.getBoard()[6][3]=1;
        assertTrue(board.isValidDownRight(3,6,1));
        assertFalse(board.isValidDownRight(3,4,2));
        assertFalse(board.isValidDownRight(6,4,2));
        assertFalse(board.isValidDownRight(2,3,2));
        assertFalse(board.isValidDownRight(7,4,1));
    }
    public static boolean isValidCordinate(int x , int y){
        if ( x >= 1 && x <=8 && y >= 1 && y<=8){
            return true;
        }
        return false;
    }
    @Test
    public void isValidCordinateTest(){
        assertFalse(isValidCordinate(0,0));
        assertFalse(isValidCordinate(9,9));
        assertTrue(isValidCordinate(6,1));
        assertFalse(isValidCordinate(7,0));
        assertTrue(isValidCordinate(6,4));
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
    }*/
}

