package Game;
public class Account {
    private final int playerStartScore = 1000;
    private int playerScore;

    // constructor for Account object.
    public Account() {
        playerScore = playerStartScore;
    }

    public void addPlayerScore(int incomingGameBoardScore){
        this.playerScore += incomingGameBoardScore;
    }



    // used for tests
    public void setPlayerScore(int incomingVariable) {
        this.playerScore += incomingVariable;
    }

    //gets the accountBalance of the current player.
    public int getPlayerScore() {
        return playerScore;
    }
}