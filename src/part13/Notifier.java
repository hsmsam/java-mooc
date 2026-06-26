package part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {
    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        button.setOnAction(actionEvent -> label.setText(textField.getText()));

        layout.getChildren().add(textField);
        layout.getChildren().add(button);
        layout.getChildren().add(label);

        Scene viewport = new Scene(layout);

        window.setScene(viewport);
        window.show();

    }

    public static void main(String[] args) {
        launch(Notifier.class);
    }
}
