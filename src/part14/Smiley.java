package part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Smiley extends Application {
    @Override
    public void start(Stage window) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        painter.setFill(Color.WHITE);
        painter.fillOval(170, 90, 300, 300);

        painter.setStroke(Color.BLACK);
        painter.setLineWidth(3);
        painter.strokeOval(170, 90, 300, 300);

        painter.setFill(Color.BLACK);
        painter.fillOval(250, 180, 20, 20);

        painter.fillOval(365, 180, 20, 20);

        painter.strokeArc(250, 220, 140, 100, 180, 180, ArcType.OPEN);


        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(Smiley.class);
    }
}
