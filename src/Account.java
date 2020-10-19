public class Account{
    private int player1Score = 1000;
    private int player2Score = 1000;
    private int x;
    // ISAK - Skal konstruktøren ikke tage imod en player som variable i metoden?
    // ISAK - I stedet for at sætte account til 1000 i klassen, så sæt dem i metoden?
    // constructor for Account object.
    public Account()
    {
        setPlayerAccountBalance(int x); //replace x with getMethod from GameBoard.
        System.out.println("Player "+ Player.getCurrentPlayer());"score: " + Account.getPlayerAccountBalance());
// System.out.println needs to go in gameLoop?
    }

    //test method below//
    // ISAK - vil råde dig til at lave alle tests i main klassen
   /* public static int i;
    public static void main(String[] args){
        Account account = new Account();

        for(i = 0; i < 5; i++)
        {
            account.setPlayerAccountBalance(5);

        System.out.println("Player 1 "+account.getPlayerAccountBalance());
            System.out.println("Player 2 "+account.getPlayerAccountBalance());
        }
    }
*/
    // ISAK - her skal ikke instansieres et nyt Player objekt
    public void setPlayerAccountBalance(int x) // in Game.java account.setPlayer1AccountBalance(getMethod from GameBaord)
    {
        Player p = new Player();
        switch (p.getCurrentPlayer())
        {
            case 0:
                this.player1Score = x + player1Score; //replace x with GetMethod from GameBoard
                break;
            case 1:
                this.player2Score = x + player2Score; //replace x with GetMethod from GameBoard
                break;
            default:
                System.out.println("invalid playerscore");
        }
    }
    // ISAK - igen, der skal ikke laves new Player
    //gets the accountBalance of the current player.
    public int getPlayerAccountBalance()
    {
        Player p = new Player();
        int y = 0;
        switch (p.getCurrentPlayer())
        {
            case 0:
                y = this.player1Score;
            break;
            case 1:
                y = this.player2Score;
            break;
            default:
                System.out.println("invalid playerscore");
        }
        return y;
    }
}
