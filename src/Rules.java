public class Rules {

    // ISAK - ?? Hvad skal der ske i Rules.gameRules()? Der er en public metode til gameRules.
    public Rules()
    {
    Rules.gameRules();
    }
    // ISAK - Ingen ny account her.
    // Regel til at skifte spiller efter turen er taget?
    public void gameRules()
    {
        Account account = new Account(); //change this
        //ends the game if the current player's account balance reaches 3000 or above.
        if (account.getPlayerAccountBalance() >= 3000)
        {
            Main.endGame(); // need to implement in Game.java class
        }


    }
}
