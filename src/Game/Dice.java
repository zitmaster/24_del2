package Game;

public class Dice {

    private final static int diceFaces = 6;
    private int faceValue;
    private String diceName;

    // test method
//    public static void main(String[] args)
//    {
//        Dice dice1 = new Dice("dice1");
//        Dice dice2 = new Dice("dice2");
//        int i;
//        for(i = 0; i < 20; i++)
//        {
//            dice1.roll();
//            dice2.roll();
//            System.out.println("You rolled");
//            System.out.print(dice1.faceValue + " and ");
//            System.out.println(dice2.faceValue);
//            System.out.print("Sum of dices ");
//            System.out.println(dice1.faceValue+dice2.faceValue);
//            java.lang.System.exit(0);
//        }
//    }


    public Dice(String nameInput)
    // sets a constructor for the object Dice.
    {
        String diceName;
        int faceValue;
    }

    public void roll()
    // method that generates a random value for faceValue contingent on diceFaces and numberofDices.
    {
        faceValue = (int) (Math.random() * diceFaces) + 1;
        System.out.print(faceValue +" ");
    }


//  used for tests
//    public void setFaceValue(int value) // unnecessary
//    {
//        if (value > 0 && value <= diceFaces)
//            faceValue = value;
//    }
//
//    public int getFaceValue()
//    {
//        return faceValue;
//    }
//
//    public String toString() // May delete later. Keep if print String variable of dice faceValue is necessary.
//    {
//        String faceValueToString = Integer.toString();
//        return faceValueToString;
//    }

}