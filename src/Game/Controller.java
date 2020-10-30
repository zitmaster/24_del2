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


    /**
     * gets input from scanner in controller named scan
     * @return the input of the player
     */
       public static String getInput(){
        input = scan.nextLine();
        return input;
       }

    /**
     * Rolls both dices and sets DiceSum to the sum of the dices
     */
       public static void roll(){
        dice1.roll();
        dice2.roll();
       DiceSum = (dice1.getFaceValue()+ dice2.getFaceValue());
    }
        public static int GetDiceSum(){
        return DiceSum;
    }

    /**
     * Changes players between player 1 and player 2
     */
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

