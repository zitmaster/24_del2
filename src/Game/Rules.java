package Game;

public class Rules {

    public void gameRules(int currentAccountValue, String currentPlayername) {
        int accountValue = currentAccountValue;
        String currentPlayer = currentPlayername;
        //ends the game if the current player's account balance reaches 3000 or above.
        if (accountValue >= 3000) {
            System.out.println(currentPlayer + " won");
            System.exit(0);
        }
    }

}
