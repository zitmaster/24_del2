package Game;

public class Player {
    private final int currentPlayerPosition = 0;

     //Tests the method below
    /*
    public static void main(String[] args)
    {
        int i;
        Game.Player p = new Game.Player("babyboy");
        for(i = 0; i < 10; i++)
        {
        p.setCurrentPlayer(p.getCurrentPlayer());
        System.out.println(p.getName() + p.getCurrentPlayer());
        }
    }
    */


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