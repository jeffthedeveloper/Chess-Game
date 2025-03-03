public class Bishop extends Piece {

    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        int deltaX = Math.abs(newX - this.x);
        int deltaY = Math.abs(newY - this.y);
        return (deltaX == deltaY);

        // Verificando se o caminho está bloqueado

        int stepX = (newX > this.x) ? 1 : -1;
        int stepY = (newY > this.y) ? 1 : -1;

        int tempX = this.x + stepX;
        int tempY = this.y + stepY;

        while (tempX != newX && tempY != newY) {
            if (board[tempX][tempY] != null) {
                return false; // Caminho bloqueado
            }
            tempX += stepX;
            tempY += stepY;
        }
        return true;

    }
}