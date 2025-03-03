♟️ Chess-Game

A Simple Chess Game Made With Java Language! 🚀

📌 Sobre o Projeto

Este projeto é um jogo de xadrez desenvolvido em Java, utilizando uma arquitetura baseada em classes e conceitos de Programação Orientada a Objetos (POO). O objetivo é criar uma implementação funcional do jogo, permitindo movimentação das peças e validação de jogadas.

📦 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

📁 src/
   ├── 📂 boardgame/  # Contém as classes base para o tabuleiro
   │   ├── Board.java
   │   ├── Piece.java
   │   ├── Position.java
   │   ├── BoardException.java
   │
   ├── 📂 chess/       # Contém as regras e implementação do xadrez
   │   ├── ChessMatch.java
   │   ├── ChessPiece.java
   │   ├── ChessPosition.java
   │   ├── ChessException.java
   │   ├── Color.java

🛠️ Tecnologias Utilizadas

☕ Java (Linguagem principal)

🏗️ Programação Orientada a Objetos (POO)

📦 Maven/Gradle (Opcional para gerenciamento de dependências)

🎯 Como Jogar

Clone o repositório:

git clone https://github.com/seu-usuario/chess-game.git
cd chess-game

Compile o projeto:

javac -d bin src/boardgame/*.java src/chess/*.java

Execute o jogo:

java -cp bin chess.Main

📜 Trechos de Código

📌 Estrutura da Classe Board

public class Board {
    private int rows;
    private int columns;
    private Piece[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Piece[rows][columns];
    }
}

📌 Classe Position

public class Position {
    private int row;
    private int column;
    
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

📌 Tratamento de Exceções com BoardException

public class BoardException extends RuntimeException {
    public BoardException(String message) {
        super(message);
    }
}

📌 Regras do Jogo de Xadrez

O jogo segue as regras tradicionais do xadrez.

As peças só podem se mover de acordo com suas regras específicas.

Não é permitido movimento para fora do tabuleiro.

Implementação futura: Xeque-mate e outras regras avançadas.

🚀 Melhorias Futuras

✅ Implementação de um motor de jogadas válidas
✅ Interface gráfica com JavaFX ou Swing
✅ Jogador vs Computador usando Algoritmos de IA

🤝 Contribuições

Sinta-se à vontade para contribuir com o projeto! Abra uma Issue ou envie um Pull Request. 😃

📜 Licença

Este projeto é distribuído sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE.

🚀 Desenvolvido com paixão por Jefferson Firmino Mendes