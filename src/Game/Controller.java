package Game;

import java.util.Scanner;

public class Controller {
    private static Player player1 = new Player("Player1", 1);
    private static Player player2 = new Player("Player2", 2);
    private static String input;
    private static Dice dice1 = new Dice();
    private static Dice dice2 = new Dice();
    private static int DiceSum;
    static Scanner scan = new Scanner(System.in);
    private static Player currentPlayer= player1;

    //public static void newGame(){
        /*System.out.println("Welcome, the goal of this game is to reach 3000 points."+
                "Each player starts with 1000 points."+
                "Press 'r' to roll the dices");

    }
    public static void endGame(){
        System.out.println("Game.Player "+ "x");//Jeg er ikke sikker på hvad der skal stå her og har der med indsat x
        System.out.println("Type 'n' to start a new game");}*/


       public static String getInput(){
        input = scan.nextLine();
        return input;
       }
       public static void roll(){
        dice1.roll();
        dice2.roll();
       DiceSum = (dice1.getFaceValue()+ dice2.getFaceValue());
    }
        public static int GetDiceSum(){
        return DiceSum;
    }

    public static void changePlayer(){
        if((currentPlayer == player1) && (currentPlayer.getCurrentPlayerPosition() != 9)){
            currentPlayer = player2;
        }else if((currentPlayer == player2) && (currentPlayer.getCurrentPlayerPosition() != 9)){
            currentPlayer = player1;
        }
    }

    public static Player getCurrentPlayer(){
        return currentPlayer;
    }

    }

