package Game;
public class Dice {
    public static Dice dice1 = new Dice();
    public static Dice dice2 = new Dice();

    private final static int diceFaces = 6;
    private int faceValue;
    private String diceName;
    private int diceSum;

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


    public Dice(){
    // sets a constructor for the object Dice.{
        int faceValue;
    }

    public void roll() {
        dice1.faceValue = (int) (Math.random() * diceFaces) + 1;
        dice2.faceValue = (int) (Math.random() * diceFaces) + 1;
    }

    public int diceSum(){
        diceSum = dice1.faceValue + dice2.faceValue;
        return diceSum;
    }

    public static int getdiceSum() {
        return dice1.faceValue + dice2.faceValue;
    }


    public void setFaceValue(int value) {
        if (value > 0 && value <= diceFaces)
            faceValue = value;
    }

    public int getFaceValue(){
        return faceValue;
    }

    //public String toString(){
    //    String faceValueToString = Integer.toString();
    //    return faceValueToString;
    //}

}