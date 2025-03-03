import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessGUI extends Application {

    private static final int SIZE = 8; // Tamanho do tabuleiro
    private static final int TILE_SIZE = 80; // Tamanho de cada casa

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                Rectangle square = new Rectangle(TILE_SIZE, TILE_SIZE);
                square.setFill((row + col) % 2 == 0 ? Color.BEIGE : Color.BROWN);
                grid.add(square, col, row);
            }
        }

        Scene scene = new Scene(grid, SIZE * TILE_SIZE, SIZE * TILE_SIZE);
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
