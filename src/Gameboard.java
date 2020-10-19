public class Gameboard {

    public int currentPosition;
    public int startPosition;
    // facevalue ikke integreret
    public int facevalue;
    // accountvalue ikke integreret
    public int accountValue;

    public Gameboard() {

        startPosition = 0;
        currentPosition = 0;

    }


    public Gameboard(int lastposition) {
        currentPosition = lastposition + facevalue;
    }

// player.setposition
    //player.getposition



    public int lastposition() {
        int lastposition = currentPosition - facevalue;
// If
        return lastposition;
    }

    public int getCurrentPosition() {

        return currentPosition;
    }


    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
        switch(currentPosition)

    {
        case 1:
            System.out.println("");
            break;
        case 2:
            System.out.println("Tower");
            System.out.println("Your balance is now" + accountValue + 250);
            setplayeraccountbalance(getPlayerAccountBalance + 250);
            break;
        case 3:
            System.out.println("Crater");
            System.out.println("Your balance is now" + accountValue - 100);
            break;
        case 4:
            System.out.println("Palace gates");
            System.out.println("Your balance is now" + accountValue + 100);
            break;
        case 5:
            System.out.println("Cold Desert");
            System.out.println("Your balance is now" + accountValue - 20);
            break;
        case 6:
            System.out.println("Walled city");
            System.out.println("Your balance is now" + accountValue + 180);
            break;
        case 7:
            System.out.println("Monastery");
            System.out.println("Your balance is now" + accountValue + 0);
            break;
        case 8:
            System.out.println("Black cave");
            System.out.println("Your balance is now" + accountValue - 70);
            break;
        case 9:
            System.out.println("Huts in the mountain");
            System.out.println("Your balance is now" + accountValue + 60);
            break;
        case 10:
            System.out.println("The Werewall");
            System.out.println("Your balance is now" + accountValue - 80);
            System.out.println("You get an extra turn");
            //Mangler til ekstra tur
            break;
        case 11:
            System.out.println("The pit");
            System.out.println("Your balance is now" + accountValue - 50);
            break;
        case 12:
            System.out.println("Goldmine");
            System.out.println("Your balance is now" + accountValue + 650);
            break;
    }


}
