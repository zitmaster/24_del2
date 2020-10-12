public class Dice {

    private final int diceFaces = 6; // edit this variable to customize faces of the dice.
    private final int numberOfDices = 2; //edit this variable to customize the number of dices.
    private int faceValue;



   public Dice()
           // sets a constructor for the object Dice.
        {
            faceValue = 0;
        }

        public int roll()
                // method that generates a random value for faceValue contingent on diceFaces and numberofDices.
        {
            faceValue = (int)(Math.random()*diceFaces) + 1;
            faceValue = faceValue*numberOfDices;
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
            String result = Integer.toString(faceValue);
            return result;
        }

}

