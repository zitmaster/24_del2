package Game;

import Game.Account;
import Game.Dice;

public class Gameboard
{

    public void newPosition()
    {
        Player.setCurrentPlayerPosition((Player.getCurrentPlayerPosition()+ Dice.dice1.getdiceSum())%11);
        switch(Player.getCurrentPlayerPosition())
        {
            case 0:
                System.out.println("Tile 11: The pit");
                System.out.println("Your balance is now: " + Account.getPlayerScore() - 50);
                Account.addPlayerScore(-50);
                break;
            case 1:
                System.out.println("Tile 12: Goldmine");
                System.out.println("Your balance is now" + Account.getPlayerScore + 650);
                Account.addPlayerScore(650);
                break;
            case 2:
                System.out.println("Tile 2: Tower");
                System.out.println("Your balance is now: " + Account.getPlayerScore + 250);
                Account.addPlayerScore(250);
                break;
            case 3:
                System.out.println("Tile 3: Crater");
                System.out.println("Your balance is now: " + Account.getPlayerScore - 100);
                Account.addPlayerScore(-100);
                break;
            case 4:
                System.out.println("Tile 4: Palace gates");
                System.out.println("Your balance is now: " + Account.getPlayerScore + 100);
                Account.addPlayerScore(100);
                break;
            case 5:
                System.out.println("Tile 5: Cold Desert");
                System.out.println("Your balance is now: " + Account.getPlayerScore - 20);
                Account.addPlayerScore(-20);
                break;
            case 6:
                System.out.println("Tile 6: Walled city");
                System.out.println("Your balance is now: " + Account.getPlayerScore + 180);
                Account.addPlayerScore(180);
                break;
            case 7:
                System.out.println("Tile 7: Monastery");
                System.out.println("Your balance is now: " + Account.getPlayerScore + 0);
                Account.addPlayerScore(0);
                break;
            case 8:
                System.out.println("Tile 8: Black cave");
                System.out.println("Your balance is now: " + Account.getPlayerScore - 70);
                Account.addPlayerScore(-70);
                break;
            case 9:
                System.out.println("Tile 9: Huts in the mountain");
                System.out.println("Your balance is now: " + Account.getPlayerScore + 60);
                Account.addPlayerScore(60);
                break;
            case 10:
                System.out.println("Tile 10: The Werewall");
                System.out.println("Your balance is now: " + Account.getPlayerScore - 80);
                System.out.println("You get an extra turn");
                //Mangler til ekstra tur
                Account.addPlayerScore(-80);
                break;
            default:
                System.out.println("Error: Tile not valid");
        }
    }


}
