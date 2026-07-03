package part14.FinnishParties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FinnishParties extends Application {
    @Override
    public void start(Stage window) throws IOException {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        List<String> lines = Files.readAllLines(
                Paths.get("src/part14/partiesdata.tsv")
        );

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        String firstLine = lines.getFirst();
        String[] years = firstLine.split("\t");

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] pieces = line.split("\t");

            String partyName = pieces[0];

            XYChart.Series data = new XYChart.Series();
            data.setName(partyName);

            for (int x = 1; x < pieces.length; x++) {
                if (!pieces[x].equals("-")) {

                    double value = Double.parseDouble(pieces[x]);
                    int year = Integer.parseInt(years[x]);

                    data.getData().add(
                            new XYChart.Data<Number, Number>(year, value)
                    );
                }
            }

            lineChart.getData().add(data);

        }

        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(FinnishParties.class);
    }
}
