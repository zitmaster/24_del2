public class Rules {



    public void gameRules()
    {
        Account account = new Account();
        if (account.getPlayerAccountBalance() >= 3000)
        {
            endGame(); // need to implement in Game.java class
        }


    }
}
