package chess;

import boardgame.BoardException; // Importa a exceção personalizada da classe BoardException

public class ChessException extends BoardException {
    // Esta classe herda de BoardException e pode ser usada para lançar exceções
    // específicas do xadrez

    // Construtor da exceção personalizada
    public ChessException(String message) {
        super(message); // Passa a mensagem para a classe pai (BoardException)
    }
}
