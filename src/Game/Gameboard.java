package Game;

public class Gameboard {
    Player currentplayer;
    public void newPosition() {
        currentplayer.setCurrentPlayerPosition((currentplayer.getCurrentPlayerPosition()+ Dice.getdiceSum())%11);
        int score = currentplayer.getScore();


        switch(currentplayer.getCurrentPlayerPosition())

    {
        case 1:
            System.out.println("Tile 2: Tower");
            System.out.println("Your balance is now: " + (score + 250));
            currentplayer.setPlayerScore(currentplayer.getScore() + 250);
            break;
        case 2:
            System.out.println("Tile 3: Crater");
            System.out.println("Your balance is now: " + (score - 100));
            currentplayer.setPlayerScore(currentplayer.getScore() - 100);
            break;
        case 3:
            System.out.println("Tile 4: Palace gates");
            System.out.println("Your balance is now: " + (score + 100));
            currentplayer.setPlayerScore(currentplayer.getScore() + 100);
            break;
        case 4:
            System.out.println("Tile 5: Cold Desert");
            System.out.println("Your balance is now: " + (score - 20));
            currentplayer.setPlayerScore(currentplayer.getScore() - 20);
            break;
        case 6:
            System.out.println("Tile 6: Walled city");
            System.out.println("Your balance is now: " + (score + 180));
            currentplayer.setPlayerScore(currentplayer.getScore() + 180);
            break;
        case 7:
            System.out.println("Tile 7: Monastery");
            System.out.println("Your balance is now: " + (score + 0));
            currentplayer.setPlayerScore(currentplayer.getScore() + 0);
            break;
        case 8:
            System.out.println("Tile 8: Black cave");
            System.out.println("Your balance is now: " + (score - 70));
            currentplayer.setPlayerScore(currentplayer.getScore() - 70);
            break;
        case 9:
            System.out.println("Tile 9: Huts in the mountain");
            System.out.println("Your balance is now: " + (score + 60));
            currentplayer.setPlayerScore(currentplayer.getScore() + 60);
            break;
        case 10:
            System.out.println("Tile 10: The Werewall");
            System.out.println("Your balance is now: " + (score - 80));
            System.out.println("You get an extra turn");
            //Mangler til ekstra tur
            currentplayer.setPlayerScore(currentplayer.getScore() - 80);
            break;
        case 11:
            System.out.println("Tile 11: The pit");
            System.out.println("Your balance is now: " + (score - 50));
            currentplayer.setPlayerScore(currentplayer.getScore() - 50);
            break;
        case 12:
            System.out.println("Tile 12: Goldmine");
            System.out.println("Your balance is now" + (score + 650));
            currentplayer.setPlayerScore(currentplayer.getScore() + 650);
            break;
    }


}
}
