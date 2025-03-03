public class Knight extends Piece {
    private Board board; // A referência para o tabuleiro

    // Construtor

    public Knight(int row, int column, boolean isWhite, Board board) {
        super(row, column, isWhite);
        this.board = board;

    }

    @Override
    public boolean isValidMove(Position newPosition) {
        int deltarow = Math.abs(newPosition.getRow() - this.position.getRow());
        int deltaColumn = Math.abs(newPosition.getColumn() - this.position.getColumn());

        // Verifica se o movimento é válido para o cavalo (2x1 ou 1x2)
        if ((deltaRow == 2 && deltaColumn == 1) || (deltaRow == 1 && deltaColumn == 2)) {
            return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);

            // Verifica se a posição está dentro dos limites do tabuleiro
            if (board.isPositionValid(newPosition)) {
                return true;

            }
        }

    }
}
