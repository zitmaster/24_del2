public class Account{
    private int player1Score = 1000;
    private int player2Score = 1000;
    private int gameBoardScore;

    // constructor for Account object.
    public Account()
    {
    }

    //test method below//
    /*
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
*/

    public void setPlayer1Score(int gameBoardScore) {
        this.player1Score = gameBoardScore + player1Score;
    }
    public void setPlayer2Score(int gameBoardScore) {
        this.player2Score = gameBoardScore + player2Score;
    }

    //gets the accountBalance of the current player.
    public int getPlayer1Score() {
        return player1Score;
    }
    public int getPlayer2Score(){
        return player2Score;
    }

}
