public class Player {
    private String name;
    private Die[] dice;
    private Piece piece;
    private Board board;

    public void takeTurn(){
        int fv = 0;
        for(Die d : dice){
            d.roll();
            fv = d.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }
}
