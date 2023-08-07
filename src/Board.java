public class Board {
    private Square[] squares;

    public Square getSquare(Square oldLoc, int fvTot){
        Square newLoc = oldLoc;
        for(int i=0; i < 40; i++){
            if(squares[i] == oldLoc){
                newLoc = squares[i+fvTot];
            }
        }
        return newLoc;
    }
}
