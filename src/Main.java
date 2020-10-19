import java.util.Scanner;

public class Main {
    private static String input;

    public static void scanner(){
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
    }
    /*
    public static void main(String[] args){
        Dice dice = new Dice();

        System.out.println(dice.getFaceValue());
    }
    */
    public static void newGame(){
        System.out.println("Welcome, the goal of this game is to reach 3000 points."+
                "Each player starts with 1000 points."+
                "Press 'r' to roll the dices");

    }

    public static void endGame(){
        System.out.println("Player "+ );
        System.out.println("Type 'n' to start a new game");

        scanner();

        if(input.toLowerCase().equals("n")){
            newGame();
        }
    }


}
