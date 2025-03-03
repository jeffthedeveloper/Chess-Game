package chess;

import boardgame.Board; // Importa a classe Board
import boardgame.Piece; // Importa a classe Piece
import chess.Color; // Importa o enum Color

public abstract class ChessPiece extends Piece {
    private Color color; // Cor da peça (preta ou branca)

    // Construtor da peça de xadrez
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color; // Define a cor da peça
    }

    /**
     * Método abstrato para verificar se o movimento é válido.
     * Cada peça implementa sua própria versão desse método.
     */

    public abstract boolean isValidMove(Position start, Position end);
}
