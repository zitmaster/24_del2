public class Rules {
    public Rules()
    {
    }
    public void gameRules(int currentAccountValue)
    {
<<<<<<<<< Temporary merge branch 1:src/Rules.java
        int AccountValue = currentAccountValue;
=========
        Game.Account account = new Game.Account(); //change this
>>>>>>>>> Temporary merge branch 2:src/Game/Rules.java
        //ends the game if the current player's account balance reaches 3000 or above.
        if (AccountValue >= 3000)
        System.exit(0);
    }

}
