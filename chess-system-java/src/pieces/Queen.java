public class Queen extends Piece {

    public Queen(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        int deltaX = Math.abs(newX - this.x);
        int deltaY = Math.abs(newY - this.y);

        // Movimentos verticais/horizontais

        if (deltaX == 0 || deltaY == 0) {
            return !isPathBlocked(newX, newY, board);
        }

        // Movimentos diagonais

        if (deltaX == deltaY) {
            return !isPathBlocked(newX, newY, board);
        }
        return false;
    }
}
