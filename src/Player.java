public class Player {
    private static int currentPlayer = 0;
    private static final int playerAmount = 2;
    // ISAK - Skal laves objektorienteret med 2 objekter
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

    // ISAK - Konstruktøren skal have alle informationer til at lave et nyt objekt.
    public Player()
    {
        Player.nextPlayer();
    }
    // ISAK - skal ændres til 2 objekter
    // sets current player at the beginning of the round. Player 1 is 0 and Player 2 is 1.
    public static void nextPlayer()
    {
        currentPlayer = (currentPlayer + 1) % playerAmount;
    }
    // ISAK - skal ændres til 2 objekter
    public void setCurrentPlayer(int currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }
    // ISAK - skal ændres til 2 objekter (kan muligvis stadigvæk godt bruges?)
    public int getCurrentPlayer()
    {
        return this.currentPlayer;
    }
}
