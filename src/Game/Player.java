package Game;

public class Player {
    private static int currentPlayer = 2;
    private boolean isTurn = false;
    private String name;
    private static int player1Position = 0;
    private static int player2Position = 0;


     //Tests the method below
    /*
    public static void main(String[] args)
    {
        int i;
        Game.Player p = new Game.Player("babyboy");
        for(i = 0; i < 10; i++)
        {
        p.setCurrentPlayer(p.getCurrentPlayer());
        System.out.println(p.getName() + p.getCurrentPlayer());
        }
    }
    */


    public Player(String name) {
        this.name = name;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setCurrentPlayer(int currentPlayerTurn) {
        if (currentPlayerTurn == 1) {
            this.currentPlayer = 2;
        }
        else if (currentPlayerTurn == 2){
            this.currentPlayer = 1;
        }
    }

    public int getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String getName() {
        return name;
    }

    public void setPlayer1Position(int diceSum, int currentPlayer1Position) {
        int x = diceSum + currentPlayer1Position;
        if (x > 12 && x < 24) {
            this.player1Position = x - 11;
        } else if (x == 24) {
            this.player1Position = x - 12;
        } else {
            this.player1Position = x + player1Position;
        }
    }
    public void setPlayer2Position(int diceSum, int currentPlayer2Position) {
        int x = diceSum + currentPlayer2Position;
        if (x > 12 && x < 24) {
            this.player2Position = x - 11;
        } else if (x == 24) {
            this.player2Position = x - 12;
        } else {
            this.player2Position = x + player2Position;
        }
    }
    public int getPlayer1Position(){
        return this.player1Position;
    }
    public int getPlayer2Position(){
        return this.player2Position;
    }
}
