package part14.Hurray;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class Hurray extends Application {
    @Override
    public void start(Stage window) {
        BorderPane pane = new BorderPane();

        AudioClip sound = new AudioClip("file:src/part14/Hurray/Applause-Yannick_Lemieux.wav");

        Button button = new Button("Hurray!");
        pane.setCenter(button);

        button.setOnAction(actionEvent -> {
            System.out.println("Clicked");
            sound.play();
        });

        Scene scene = new Scene(pane, 600, 400);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(Hurray.class);
    }
}
