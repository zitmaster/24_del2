package Game;

import com.sun.tools.javac.Main;

public class Gameloop {
    static boolean gameRun = true;

    /**
     * gameloop is the loop of the game runs until gamRun is false.
     */
    public static void gameloop(){
        while(gameRun)
        if(Controller.getInput().equals("r")){
            System.out.println(Controller.getCurrentPlayer().getName());
            Controller.roll();
            Gameboard.newPosition();
            Rules.gameRules();
            Controller.changePlayer();


        }

    }




}
