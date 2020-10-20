public class Account{
    private int player1Score = 1000;
    private int player2Score = 1000;
    private int currentPlayer;
    private int gameBoardScore;

    // constructor for Account object.
    public Account(int updateScore, int currentPlayer)
    {
        this.currentPlayer = currentPlayer; //current player comes from game.java.
        this.gameBoardScore = updateScore; //updateScore comes from game.java
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


    public void setPlayerAccountBalance(int gameBoardScore, int currentPlayer) // in Game.java account.setPlayer1AccountBalance(getMethod from GameBaord)
    {
        int c = currentPlayer;
        switch (c)
        {
            case 0:
                this.player1Score = gameBoardScore + player1Score; //replace x with GetMethod from GameBoard
                break;
            case 1:
                this.player2Score = gameBoardScore + player2Score; //replace x with GetMethod from GameBoard
                break;
            default:
                System.out.println("invalid playerscore");
        }
    }

    //gets the accountBalance of the current player.
    public int getPlayerAccountBalance(int currentPlayer)
    {
        int y = 0;
        switch (currentPlayer)
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
