package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (!chessMatch.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch); // Exibe o status atual da partida
                System.out.println();

                // Solicita a origem da jogada
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                // Obtém os movimentos possíveis para a posição de origem
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);

                // Limpa a tela e imprime o tabuleiro com os movimentos possíveis destacados
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                // Solicita o destino da jogada
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                // Realiza a jogada
                chessMatch.performChessMove(source, target);

            } catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Limpa o buffer do scanner
            }
        }

        UI.clearScreen();
        UI.printMatch(chessMatch); // Imprime o status final da partida
    }
}
