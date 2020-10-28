package Game;

public class Player {

    private final int startPlayerPosition = 0;
    private int currentPlayerPosition;
    private String name;
    private Account account;

    public Player(String nameReference, int IdInput) {
        this.name = nameReference;
        int ID = IdInput;
        this.account = new Account();
        currentPlayerPosition = startPlayerPosition;
    }
    public void setCurrentPlayerPosition(int gameBoardInput){
        this.currentPlayerPosition = gameBoardInput;

    }
    public String getName(){return this.name;}
    public int getCurrentPlayerPosition() {
        return currentPlayerPosition;
    }
    public int getScore(){return account.getPlayerScore();}
    public void setPlayerScore(int i){account.setPlayerScore(i);}
}