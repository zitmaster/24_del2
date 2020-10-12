public class Account{
    private int player1Score = 1000;
    private int player2Score = 1000;

    //test method below//
    /*
    private int x;
    public static int i;
    public static int j;


    public static void main(String[] args){
        Account account = new Account();
        for(i = 0; i < 5; i++)
        {
            account.setPlayer1AccountBalance(5);

        System.out.println("Player 1 "+account.getPlayer1AccountBalance());
            System.out.println("Player 2 "+account.getPlayer1AccountBalance());

        }
    }
*/
    public void setPlayer1AccountBalance(int x) // private int x to be replaced with getGameBoardScore
    {
        Player p = new Player();

        switch (p.getCurrentPlayer())
        {
            case 0:
                this.player1Score = x + player1Score; //replace x with GetMethod from GameBoard
                break;
            case 1:
                this.player2Score = x + player2Score; //replace x with GetMethod from GameBoard
                break;
            default:
                System.out.println("invalid playerscore");
        }
    }

    public int getPlayer1AccountBalance()
    {
        Player p = new Player();
        int y = 0;
        switch (p.getCurrentPlayer())
        {
            case 0:
                y = this.player1Score; //replace y with GetMethod from GameBoard
            break;
            case 1:
                y = this.player2Score; //replace y with GetMethod from GameBoard
            break;
            default:
                System.out.println("invalid playerscore");
        }
        return y;
    }
}
