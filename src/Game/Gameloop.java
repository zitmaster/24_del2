package Game;

import Game.Dice;

public class Gameloop {

    private static void gameloop(){
        Controller.scanner();

        if(Controller.input.toLowerCase().equals("r")){
            System.out.println(Dice.roll());


            Player.nextPlayer();
        }

    }
    public static void newGame(){
        System.out.println("Welcome, the goal of this game is to reach 3000 points."+
                "Each player starts with 1000 points."+
                "Press 'r' to roll the dices");

    }

    public static void endGame(){
        System.out.println("Game.Player "+ "x");//Jeg er ikke sikker på hvad der skal stå her og har der med indsat x
        System.out.println("Type 'n' to start a new game");

        Controller.scanner();

        if(Controller.input.toLowerCase().equals("n")){
            newGame();
        }
    }

}
