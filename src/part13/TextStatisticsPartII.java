package part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsPartII extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea input = new TextArea();

        HBox texts = new HBox();
        texts.setSpacing(10);
        Label letters = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0 ");
        Label longestLabel = new Label("The longest word is: ");

        texts.getChildren().addAll(letters, wordsLabel, longestLabel);

        input.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);

        });

        layout.setBottom(texts);

        layout.setCenter(input);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsPartII.class);
    }
}
