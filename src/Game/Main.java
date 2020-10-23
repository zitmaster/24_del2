import Game.Gameloop;

public class Main {

    public static void main(String[] args) {
        Gameloop.newGame();

        while(true){
            Gameloop.gameloop();
        }
    }
}