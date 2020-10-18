public class Dice {

    private final int diceFaces = 6; // edit this variable to customize faces of the dice.
    private final int numberOfDices = 2; //edit this variable to customize the number of dices.
    private static int faceValue; // sum of dice facevalues.
    private int diceRollValue; // equivalent to the number that is produced when rolling a dice.


    // tests dice method - Simon needs to optimize this so that the frequence of each faceValue sum is reflected.
    public static void main(String[] args)
    {
     Dice dice = new Dice();
     int i;
     for(i = 0; i < 1000; i++)
     {
         dice.roll();
        System.out.println(dice.getFaceValue());
        faceValue = 0;
     }
    }


   public Dice()
           // sets a constructor for the object Dice.
        {
            faceValue = 0;
        }

        public int roll()
                // method that generates a random value for faceValue contingent on diceFaces and numberofDices.
        {
            int j;
            for (j = 0; j < numberOfDices; j++)
            {
                diceRollValue = (int) (Math.random() * diceFaces) + 1;
                faceValue = diceRollValue + faceValue;
            }
            return faceValue;
        }

        public void setFaceValue(int value)
        {
            if (value > 0 && value <= diceFaces*numberOfDices)
                faceValue = value;
        }

        public int getFaceValue()
        {
            return faceValue;
        }

        public String toString()
        {
            String faceValueToString = Integer.toString(faceValue);
            return faceValueToString;
        }

}
