package Game;

import com.sun.tools.javac.Main;

public class Gameloop {
    static boolean game_run = true;
    public static void gameloop(){
        while(game_run)
        if(Controller.getInput().equals("r")){
            System.out.println(Controller.getCurrentPlayer().getName());
            Controller.roll();
            Gameboard.newPosition();
            Rules.gameRules();
            Controller.changePlayer();


        }

    }




}
