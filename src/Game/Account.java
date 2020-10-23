package Game;

public class Account{
    private int playerScoreTest = 1000;

    // constructor for Game.Account object.
    public Account(String name) {
        int playerScore = 1000;
        String name;
    }

    //test method below//
    /*
    public static int i;
    public static void main(String[] args){
        Game.Account account = new Game.Account();

        for(i = 0; i < 5; i++)
        {
            account.setPlayerAccountBalance(5);

        System.out.println("Game.Player 1 "+account.getPlayerAccountBalance());
            System.out.println("Game.Player 2 "+account.getPlayerAccountBalance());
        }
    }
*/

    public void setPlayerScore(int gameBoardScore) {
        this.playerScoreTest = gameBoardScore + playerScoreTest;
    }
    public void setPlayerScore(int gameBoardScore) {
        this.playerScoreTest = gameBoardScore + playerScoreTest;
    }

    //gets the accountBalance of the current player.
    public int getPlayer1Score() {
        return playerScoreTest;
    }
    public int getPlayer2Score(){
        return playerScoreTest;
    }

}
