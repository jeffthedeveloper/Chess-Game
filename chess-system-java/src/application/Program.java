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
                UI.printMatch(chessMatch);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

    public boolean[][] possibleMoves = chessMatch.possibleMoves(source);
    {
        boolean[][] mat = new boolean[8][8];
        // Preencher a matriz com os movimentos possíveis
        return mat;
        UI.clearScreen();
        UI.printBoard(chessMatch.getPieces(), possibleMoves);

    }

    System.out.println();System.out.print("Target: ");
    ChessPosition target = UI.readChessPosition(sc);chessMatch.performChessMove(source,target);}catch(ChessException|
    InputMismatchException e)
    {
        System.out.println(e.getMessage());
        sc.nextLine(); // clears the buffer
    }
}UI.clearScreen();UI.printMatch(chessMatch);}}}