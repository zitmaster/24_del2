public class Account{
    private int player1Score = 1000;
    private int player2Score = 1000;
    private int x;

    // constructor for Account object.
    public Account(int updateScore)
    {
        player1Score += updateScore;
        player2Score += updateScore;
    }

    //test method below//

    public static int i;
    public static void main(String[] args){
        Account account = new Account();

        for(i = 0; i < 5; i++)
        {
            account.setPlayerAccountBalance(5);

        System.out.println("Player 1 "+account.getPlayerAccountBalance());
            System.out.println("Player 2 "+account.getPlayerAccountBalance());
        }
    }


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
