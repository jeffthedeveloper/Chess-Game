package boardgame;

public class Position {
    private int row;
    private int column;

    // Construtor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // Getters e Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    // Método para verificar se duas posições são iguais
    public boolean equals(Position other) {
        return this.row == other.row && this.column == other.column;
    }

    // Método para imprimir a posição
    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}
