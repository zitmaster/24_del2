import java.util.Scanner;

public class Gameloop {

    private static void gameloop(){
        Main.scanner();

        if(Main.input.toLowerCase().equals("r")){
            System.out.println(Dice.roll());
            //Husk til mødet at spørge om hvor score henne

            Player.nextPlayer();
        }

    }

}
