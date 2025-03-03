public class King extends Piece {

    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        int deltaX = Math.abs(newX - this.x);
        int deltaY = Math.abs(newY - this.y);
        return (deltaX <= 1 && deltaY <= 1);

            // Método para validar o roque
    public boolean canCastle(int newX, int newY, Rook rook) {
        // Implementar lógica para roque, verificando as condições (rei não pode estar
        // em xeque, etc.)
        return false;

    }
}
