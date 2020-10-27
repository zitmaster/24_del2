package Game;

public class Player {
    public static Player player1 = new Player("Player1", 1);
    public static Player player2 = new Player("Player2", 2);

    private final int startPlayerPosition = 0;
    private int currentPlayerPosition;
    private Account account;

    public Player(String nameReference, int IdInput) {
        String name = nameReference;
        int ID = IdInput;
        this.account = new Account();
        currentPlayerPosition = startPlayerPosition;
    }
    public void setCurrentPlayerPosition(int gameBoardInput){
        this.currentPlayerPosition = gameBoardInput;

    }

    public int getCurrentPlayerPosition() {
        return currentPlayerPosition;
    }
    public int getScore(){return account.getPlayerScore();}
    public void setPlayerScore(int i){account.setPlayerScore(i);}
}