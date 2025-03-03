package application;

import java.util.Scanner;

public class UI {

    // Definições de cores ANSI para melhorar a visualização do tabuleiro e peças.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // Método para limpar a tela, dependendo do sistema operacional
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\u001B[H\u001B[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para imprimir o tabuleiro de xadrez com as cores
    public static void printBoard(String[][] board) {
        System.out.println(ANSI_RESET);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(ANSI_BLACK_BACKGROUND + " " + board[row][col] + " " + ANSI_RESET);
                } else {
                    System.out.print(ANSI_WHITE_BACKGROUND + " " + board[row][col] + " " + ANSI_RESET);
                }
            }
            System.out.println();
        }
    }

    // Método para ler a posição de uma peça (exemplo: "e2")
    public static String readPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a posição da peça (ex: e2): ");
        String position = scanner.nextLine();
        return position;
    }

    // Método para ler a jogada do jogador (exemplo: "e2 e4")
    public static String readMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a jogada (ex: e2 e4): ");
        String move = scanner.nextLine();
        return move;
    }

    // Método para imprimir o estado da partida
    public static void printMatch(String status) {
        System.out.println(ANSI_YELLOW + "Estado da Partida: " + status + ANSI_RESET);
    }

    // Método para exibir a peça
    public static void printPiece(String piece) {
        switch (piece.toLowerCase()) {
            case "p":
                System.out.print(ANSI_WHITE + "Peão" + ANSI_RESET);
                break;
            case "r":
                System.out.print(ANSI_BLUE + "Rei" + ANSI_RESET);
                break;
            case "q":
                System.out.print(ANSI_CYAN + "Rainha" + ANSI_RESET);
                break;
            case "b":
                System.out.print(ANSI_GREEN + "Bispo" + ANSI_RESET);
                break;
            case "n":
                System.out.print(ANSI_PURPLE + "Cavalo" + ANSI_RESET);
                break;
            case "k":
                System.out.print(ANSI_RED + "Rei" + ANSI_RESET);
                break;
            default:
                System.out.print(ANSI_RESET + "Peça desconhecida" + ANSI_RESET);
        }
    }
}
