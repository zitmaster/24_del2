public class Rules {



    public void gameRules()
    {
        Account account = new Account();
        //ends the game if the current player's account balance reaches 3000 or above.
        if (account.getPlayerAccountBalance() >= 3000)
        {
            endGame(); // need to implement in Game.java class
        }


    }
}
