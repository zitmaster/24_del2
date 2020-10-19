public class Player {
    private static int currentPlayer = 0;
    private static final int playerAmount = 2;

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


    public Player()
    {
        Player.nextPlayer();
    }

    // sets current player at the beginning of the round. Player 1 is 0 and Player 2 is 1.
    public static void nextPlayer()
    {
        currentPlayer = (currentPlayer + 1) % playerAmount;
    }

    public void setCurrentPlayer(int currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }

    public int getCurrentPlayer()
    {
        return this.currentPlayer;
    }
}
