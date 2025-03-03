public class Rook extends Piece {

    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {

        if (this.x != newX && this.y != newY) {
            return false;
        }
        return (this.x == newX || this.y == newY);

        // Verificar se o caminho está bloqueado
        return !isPathBlocked(newX, newY, board);
    }
}
