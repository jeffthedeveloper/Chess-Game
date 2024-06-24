public class Pawn extends Piece {

    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        if (isWhite) {
            return (this.x == newX && newY == this.y + 1) ||
                   (this.x == newX && this.y == 1 && newY == this.y + 2);
        } else {
            return (this.x == newX && newY == this.y - 1) ||
                   (this.x == newX && this.y == 6 && newY == this.y - 2);
        }
    }
}
