public class Dice {

    private final int diceFaces = 6;
    private final int numberOfDices = 2;
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