package Game;
public class Account {
    public static Account account1 = new Account();
    public static Account account2 = new Account();

    private final int playerStartScore = 1000;
    private int playerScore;

    // constructor for Account object.
    public Account(String nameInput) {
        playerScore = playerStartScore;
        String name = nameInput;
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
