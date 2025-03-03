package boardgame;

public class BoardException extends RuntimeException {

    // Construtor da exceção personalizada
    public BoardException(String message) {
        super(message); // Passa a mensagem de erro para o construtor da classe pai (RuntimeException)
    }
}
