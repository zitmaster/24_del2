package Game;
public class Account {
    private final int playerStartScore = 1000;
    private int playerScore;

    // constructor for Account object.
    public Account(String name) {
        int playerScore = playerStartScore;
        String name;
    }

    public void addPlayerScore(int incomingGameBoardScore){
        playerScore += incomingGameBoardScore;
    }



    // used for tests
    public void setPlayerScore(int incomingVariable) {
        this.playerScore = incomingVariable;
    }

    //gets the accountBalance of the current player.
    public int getPlayerScore() {
        return playerScore;
    }
}
