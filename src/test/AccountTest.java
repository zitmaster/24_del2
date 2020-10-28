package test;
import Game.Account;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Game.Account test = new Account();
    @org.junit.jupiter.api.Test
    void addPlayerScore() {
        test.addPlayerScore(100);
        assertEquals(test.getPlayerScore(),1100);
        test.addPlayerScore(-200);
        assertEquals(test.getPlayerScore(),900);
    }

    @org.junit.jupiter.api.Test
    void setPlayerScore() {
        test.setPlayerScore(10);
        assertEquals(test.getPlayerScore(),10);
        test.setPlayerScore(-10);
        assertEquals(test.getPlayerScore(),-10);
    }

    @org.junit.jupiter.api.Test
    void getPlayerScore() {
        assertEquals(test.getPlayerScore(),1000);
    }
}