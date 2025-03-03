package chess;

import boardgame.Position; // Importa a classe Position

public class ChessPosition {

    // Converte a posição algébrica (ex: "a1") para as coordenadas do tabuleiro
    public static Position fromAlgebraicNotation(String notation) {
        char column = notation.charAt(0); // Coluna (letra)
        int row = Integer.parseInt(notation.substring(1)); // Linha (número)

        int columnIndex = column - 'a'; // Converte a letra para índice (0-7)
        int rowIndex = 8 - row; // Converte a linha para índice (0-7)

        return new Position(rowIndex, columnIndex); // Retorna a posição no tabuleiro
    }

    // Converte as coordenadas do tabuleiro para a notação algébrica (ex: "a1")
    public static String toAlgebraicNotation(Position position) {
        char column = (char) ('a' + position.getColumn()); // Converte o índice da coluna para letra
        int row = 8 - position.getRow(); // Converte o índice da linha para número

        return "" + column + row; // Retorna a notação algébrica
    }
}
