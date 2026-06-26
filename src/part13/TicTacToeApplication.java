package part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();

        Label status = new Label("Turn: X");
        status.setFont(Font.font("Monospaced", 40));
        layout.setTop(status);

        GridPane grid = new GridPane();
        layout.setCenter(grid);

        Button[][] board = new Button[3][3];

        String[] turn = {"X"};
        boolean[] gameEnded = {false};

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {

                Button button = new Button("");
                button.setFont(Font.font("Monospaced", 40));

                board[x][y] = button;
                grid.add(button, x, y);

                button.setOnAction(event -> {

                    if (gameEnded[0]) {
                        return;
                    }

                    if (!button.getText().isEmpty()) {
                        return;
                    }

                    button.setText(turn[0]);

                    if (check(board, turn[0])) {
                        status.setText("The end!");
                        gameEnded[0] = true;
                        return;
                    }

                    if (turn[0].equals("X")) {
                        turn[0] = "O";
                    } else {
                        turn[0] = "X";
                    }

                    status.setText("Turn: " + turn[0]);
                });
            }
        }

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    private boolean check(Button[][] board, String player) {

        for (int y = 0; y < 3; y++) {
            if (board[0][y].getText().equals(player)
                    && board[1][y].getText().equals(player)
                    && board[2][y].getText().equals(player)) {
                return true;
            }
        }

        for (int x = 0; x < 3; x++) {
            if (board[x][0].getText().equals(player)
                    && board[x][1].getText().equals(player)
                    && board[x][2].getText().equals(player)) {
                return true;
            }
        }

        if (board[0][0].getText().equals(player)
                && board[1][1].getText().equals(player)
                && board[2][2].getText().equals(player)) {
            return true;
        }

        if (board[2][0].getText().equals(player)
                && board[1][1].getText().equals(player)
                && board[0][2].getText().equals(player)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}