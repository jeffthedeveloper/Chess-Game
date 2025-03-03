public class Pawn extends Piece {

    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
// Movimentação normal
if (this.x == newX && newY == this.y + 1 && board[newX][newY] == null) {
    return true;
}
// Movimentação inicial de 2 casas
if (this.x == newX && this.y == 1 && newY == this.y + 2 && board[newX][newY] == null) {
    return true;
}
// Captura na diagonal
if (Math.abs(newX - this.x) == 1 && newY == this.y + 1 && board[newX][newY] != null && !board[newX][newY].isWhite()) {
    return true;
}
} else {
    // Movimentação normal
    if (this.x == newX && newY == this.y - 1 && board[newX][newY] == null) {
        return true;
    }
    // Movimentação inicial de 2 casas
    if (this.x == newX && this.y == 6 && newY == this.y - 2 && board[newX][newY] == null) {
        return true;
    }// Captura na diagonal
    if (Math.abs(newX - this.x) == 1 && newY == this.y - 1 && board[newX][newY] != null && board[newX][newY].isWhite()) {
        return true;
    }
}
return false;
}
