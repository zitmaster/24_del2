package Game;

public class Rules {

    public void gameRules(int currentAccountValue)
    {
        int AccountValue = currentAccountValue;
        //ends the game if the current player's account balance reaches 3000 or above.
        if (AccountValue >= 3000)
            System.exit(0);
    }

}