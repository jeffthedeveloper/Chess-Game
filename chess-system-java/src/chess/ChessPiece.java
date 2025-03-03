package chess;

import boardgame.Board; // Importa a classe Board
import boardgame.Piece; // Importa a classe Piece
import chess.Color; // Importa o enum Color

public abstract class ChessPiece extends Piece {
    private Color color; // Cor da peça (preta ou branca)

    // Construtor da peça de xadrez
    public ChessPiece(int row, int column, Color color, Board board) {
        super(row, column, true); // Chama o construtor da classe Piece
        this.color = color; // Define a cor da peça
    }

    public Color getColor() {
        return color; // Retorna a cor da peça
    }

    public void setColor(Color color) {
        this.color = color; // Define a cor da peça
    }
}
