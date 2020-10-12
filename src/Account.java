public class Account{
    private final int accountStartBalance = 1000;
    private int player1Score = 1000;
    private int player2Score = 1000;

    //test method below//
    /*private int x;
    public static int i;
    public static int j;


    public static void main(String[] args){
        Account account = new Account();
        for(i = 0; i < 5; i++)
        {
            account.setPlayer1AccountBalance(5);

        System.out.println(account.getPlayer1AccountBalance());
        }
    }*/

    public void setPlayer1AccountBalance(int x)
    {
        this.player1Score = x + player1Score;
    }

    public int getPlayer1AccountBalance()
    {
        return this.player1Score;
    }
}