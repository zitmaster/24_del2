public class Player {
    private static int currentPlayer = 0;
    private static final int playerAmount = 2;

    public Player
    {
    }

    // sets current player at the beginning of the round
    public void nextPlayer()
    {
        currentPlayer = (currentPlayer + 1) % playerAmount;
    }

    public void setCurrentPlayer(int currentPlayer)
    {
        Player.currentPlayer = currentPlayer;
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }
}
