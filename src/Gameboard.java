import
public class Gameboard {

    public int currentPosition;
    public int startPosition;
    // facevalue ikke integreret
    // accountvalue ikke integreret





    public Gameboard() {
        currentPosition = Player.getPosition + Dice.getFaceValue;

    }

// player.setposition
    //player.getposition



    public int currentPosition() {
        if (Player.getPosition + Dice.getFaceValue > 11) {
            currentPosition = (Player.getPosition + Dice.getFaceValue) - 11;}
        else{
            currentPosition = Player.getPosition + Dice.getFaceValue;}

            return currentPosition;
        Player.setPosition = currentPosition;
        }



        switch(currentPosition)

    {
        case 2:
            System.out.println("Felt 2: Tower");
            System.out.println("Your balance is now" + Account.getBalance + 250);
            Account.setbalance(Account.getBalance + 250);
            break;
        case 3:
            System.out.println("Felt 3: Crater");
            System.out.println("Your balance is now" + Account.getBalance - 100);
            Account.setbalance(Account.getBalance - 100);
            break;
        case 4:
            System.out.println("Felt 4: Palace gates");
            System.out.println("Your balance is now" + Account.getBalance + 100);
            Account.setbalance(Account.getBalance + 100);
            break;
        case 5:
            System.out.println("Felt 5: Cold Desert");
            System.out.println("Your balance is now" + Account.getBalance - 20);
            Account.setbalance(Account.getBalance - 20);
            break;
        case 6:
            System.out.println("Felt 6: Walled city");
            System.out.println("Your balance is now" + Account.getBalance + 180);
            Account.setbalance(Account.getBalance + 180);
            break;
        case 7:
            System.out.println("Felt 7: Monastery");
            System.out.println("Your balance is now" + Account.getBalance + 0);
            Account.setbalance(Account.getBalance + 0);
            break;
        case 8:
            System.out.println("Felt 8: Black cave");
            System.out.println("Your balance is now" + Account.getBalance - 70);
            Account.setbalance(Account.getBalance - 70);
            break;
        case 9:
            System.out.println("Felt 9: Huts in the mountain");
            System.out.println("Your balance is now" + Account.getBalance + 60);
            Account.setbalance(Account.getBalance + 60);
            break;
        case 10:
            System.out.println("Felt 10: The Werewall");
            System.out.println("Your balance is now" + Account.getBalance - 80);
            System.out.println("You get an extra turn");
            //Mangler til ekstra tur
            Account.setbalance(Account.getBalance - 80);
            break;
        case 11:
            System.out.println("Felt 11: The pit");
            System.out.println("Your balance is now" + Account.getBalance - 50);
            Account.setbalance(Account.getBalance - 50);
            break;
        case 12:
            System.out.println("Felt 12: Goldmine");
            System.out.println("Your balance is now" + Account.getBalance + 650);
            Account.setbalance(Account.getBalance + 650);
            break;
    }


}
