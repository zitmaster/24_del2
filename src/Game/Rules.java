package Game;

public class Rules {

    public static void gameRules() {
        //ends the game if the current player's account balance reaches 3000 or above.
        if (Controller.getCurrentPlayer().getScore()>= 3000) {
            System.out.println(Controller.getCurrentPlayer().getName() + " won");
            System.exit(0);
        }
    }

}
