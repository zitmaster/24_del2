package Game;

public class Dice {

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


    public Dice(String nameInput)
    // sets a constructor for the object Dice.{
        String diceName;
        int faceValue;
    }

    public void roll() {
        faceValue = (int) (Math.random() * diceFaces) + 1;
        System.out.print(faceValue +" ");
    }

    public void diceSum(int dice1FaceValue, int dice2FaceValue){
        diceSum = dice1FaceValue + dice2FaceValue;
    }


  used for tests
    public void setFaceValue(int value) {
        if (value > 0 && value <= diceFaces)
            faceValue = value;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        String faceValueToString = Integer.toString();
        return faceValueToString;
    }

}