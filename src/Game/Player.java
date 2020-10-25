package Game;



public class Player {
    public static Player player1 = new Player("Player1", 1);
    public static Player player2 = new Player("Player2", 2);

    private final int currentPlayerPosition = 0;
    private int currentPlayerPosition;

    public Player(String nameReference, int IdInput) {
        String name = nameReference;
        int ID = IdInput;
        int currentPlayerPosition;
    }
    public void setCurrentPlayerPosition(){

    }

    public int getCurrentPlayerPosition() {
        return currentPlayerPosition;
    }
}