package Game;

public class Player {
    private static int currentPLayer = 0;
    private static int amountOfPlayeers = 2;
    private final int startPlayerPosition = 0;
    private int currentPlayerPosition;


    public static Player player1 = new Player("Player1", 1);
    public static Player player2 = new Player("Player2", 2);


    public Player(String nameReference, int IdInput) {
        String name = nameReference;
        int ID = IdInput;
        currentPlayerPosition = startPlayerPosition;
    }

    public static void nextPlayer(){

    }

    public void setCurrentPlayerPosition(int gameBoardInput){
        this.currentPlayerPosition = gameBoardInput;
    }

    public int getCurrentPlayerPosition() {
        return currentPlayerPosition;
    }
}
