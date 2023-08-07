public class MGame {
    private int roundcnt;
    private Board board;
    private Die[] dice;
    private Player[] players;

    public void playGame(){
        while (roundcnt < N){
            playRound();
        }
    }
    private void playRound(){
       for(Player p : players){
           p.takeTurn();
       }

    }
}
