package boardgame;

public abstract class Piece {
    protected Position position;

    // Construtor
    public Piece(Position position) {
        this.position = position;
    }

    // Getter e Setter
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    // Método abstrato para verificar se a peça pode se mover para a posição
    public abstract boolean canMoveTo(Position position);

    // Método abstrato para movimentar a peça (necessário implementar nas classes
    // filhas)
    public abstract void move(Position newPosition);

    // Método para representar a peça como string (subclasse deve sobrescrever)
    public abstract String toString();
}
