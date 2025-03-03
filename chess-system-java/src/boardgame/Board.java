package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] board;

    // Construtor
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Piece[rows][columns];
    }

    // Método para adicionar uma peça no tabuleiro
    public void placePiece(Piece piece, Position position) {
        if (isPositionValid(position)) {
            board[position.getRow()][position.getColumn()] = piece;
            piece.setPosition(position);
        } else {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }

    // Método para remover uma peça do tabuleiro
    public void removePiece(Position position) {
        if (isPositionValid(position)) {
            board[position.getRow()][position.getColumn()] = null;
        } else {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }

    // Verifica se a posição está dentro dos limites do tabuleiro
    private boolean isPositionValid(Position position) {
        return position.getRow() >= 0 && position.getRow() < rows &&
                position.getColumn() >= 0 && position.getColumn() < columns;
    }

    // Método para obter a peça em uma posição
    public Piece getPiece(Position position) {
        if (isPositionValid(position)) {
            return board[position.getRow()][position.getColumn()];
        } else {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }

    // Método para verificar se a posição está vazia
    public boolean isPositionEmpty(Position position) {
        return getPiece(position) == null;
    }

    // Método para imprimir o tabuleiro (para depuração ou exibição)
    public void printBoard() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (board[row][col] != null) {
                    System.out.print(board[row][col].toString() + " ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
}
