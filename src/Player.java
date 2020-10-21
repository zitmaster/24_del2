public class Player {
    private static int currentPlayer;
    private boolean isTurn = false;
    private String name;


     //Tests the method below
    /*public static void main(String[] args)
    {
        int i;
        Player p = new Player();
        for(i = 0; i < 10; i++)
        {
        p.nextPlayer();
        System.out.println(p.getCurrentPlayer());
        }
    }*/


    public Player(String name) {
        this.name = name;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setCurrentPlayer(int currentPlayerNumber) {
        this.currentPlayer = currentPlayerNumber;
    }

    public int getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String getName() {
        return name;
    }


}
