package part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Button firstButton = new Button("To the second view!");

        layout.setTop(new Label("First view!"));
        layout.setCenter(firstButton);

        Scene first = new Scene(layout);

        VBox secondLayout = new VBox();
        secondLayout.setSpacing(10);
        Button secondButton = new Button("To the third view!");
        Label secondView = new Label("Second view!");
        secondLayout.getChildren().add(secondButton);
        secondLayout.getChildren().add(secondView);

        Scene second = new Scene(secondLayout);

        GridPane thirdLayout = new GridPane();
        Label thirdView = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");

        thirdLayout.add(thirdView, 0, 0);
        thirdLayout.add(thirdButton, 1, 1);

        Scene third = new Scene(thirdLayout);

        firstButton.setOnAction(actionEvent -> {
            window.setScene(second);
        });

        secondButton.setOnAction(actionEvent -> {
            window.setScene(third);
        });

        thirdButton.setOnAction(actionEvent -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
