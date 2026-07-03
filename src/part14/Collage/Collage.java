package part14.Collage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Collage extends Application {

    @Override
    public void start(Stage window) {
        Image sourceImage = new Image("file:src/part14/Collage/monalisa.png");
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int y = 0; y < height / 2; y++) {
            for (int x = 0; x < width / 2; x++) {

                Color color = imageReader.getColor(x * 2, y * 2);

                Color negative = new Color(
                        1.0 - color.getRed(),
                        1.0 - color.getGreen(),
                        1.0 - color.getBlue(),
                        color.getOpacity()
                );

                imageWriter.setColor(x, y, negative);
                imageWriter.setColor(x + width / 2, y, negative);
                imageWriter.setColor(x, y + height / 2, negative);
                imageWriter.setColor(x + width / 2, y + height / 2, negative);
            }
        }

        ImageView imageView = new ImageView(targetImage);

        Pane pane = new Pane(imageView);

        window.setScene(new Scene(pane, width, height));
        window.show();
    }

    public static void main(String[] args) {
        launch(Collage.class);
    }
}