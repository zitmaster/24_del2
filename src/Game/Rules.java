public class Rules {
    public Rules()
    {
    }
    public void gameRules(int currentAccountValue)
    {
        int AccountValue = currentAccountValue;
        Game.Account account = new Game.Account(); //change this

        //ends the game if the current player's account balance reaches 3000 or above.
        if (AccountValue >= 3000)
        System.exit(0);
    }

}
