package chess;

import boardgame.Board; // Importa a classe Board
import boardgame.Piece; // Importa a classe Piece para representar as peças do jogo
import boardgame.Position; // Importa a classe Position para manipular coordenadas do tabuleiro

public class ChessMatch {
    private Board board; // O tabuleiro do jogo
    private Color currentPlayer; // Define quem é o jogador da vez (preto ou branco)
    private boolean check; // Verifica se há cheque
    private boolean checkmate; // Verifica se há xeque-mate

    // Construtor da partida de xadrez
    public ChessMatch() {
        this.board = new Board(8, 8); // Cria um tabuleiro 8x8
        this.currentPlayer = Color.WHITE; // Define o jogador inicial como branco
        this.check = false; // Inicialmente, não há cheque
        this.checkmate = false; // Inicialmente, não há xeque-mate
        setupBoard(); // Método para configurar as peças no tabuleiro
    }

    // Configura as peças no tabuleiro no início do jogo
    private void setupBoard() {
        // Exemplo de configuração inicial de peças
        // Adicione as peças de xadrez no tabuleiro
        // board.placePiece(new Pawn(Color.WHITE), new Position(6, 0)); // Exemplo de
        // peça
    }

    // Lógica para mover uma peça (em construção)
    public void movePiece(Position origin, Position destination) {
        // Verifica a validade do movimento e move a peça
    }

    // Lógica para verificar se há cheque
    public boolean isInCheck() {
        // Lógica de verificação de cheque
        return check;
    }

    // Lógica para verificar se há xeque-mate
    public boolean isCheckmate() {
        // Lógica de verificação de xeque-mate
        return checkmate;
    }

    // Troca o jogador
    public void changePlayer() {
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }
}
