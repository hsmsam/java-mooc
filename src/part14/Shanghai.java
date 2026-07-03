package part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Shanghai extends Application {
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2007, 2017, 2);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series uhData = new XYChart.Series();
        uhData.setName("UH");
        uhData.getData().add(new XYChart.Data(2007, 73));
        uhData.getData().add(new XYChart.Data(2008, 68));
        uhData.getData().add(new XYChart.Data(2009, 72));
        uhData.getData().add(new XYChart.Data(2010, 72));
        uhData.getData().add(new XYChart.Data(2011, 74));
        uhData.getData().add(new XYChart.Data(2012, 73));
        uhData.getData().add(new XYChart.Data(2013, 76));
        uhData.getData().add(new XYChart.Data(2014, 73));
        uhData.getData().add(new XYChart.Data(2015, 67));
        uhData.getData().add(new XYChart.Data(2016, 56));
        uhData.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(uhData);

        Map<String, Map<Integer, Double>> values = new HashMap<>();

        values.keySet().stream().forEach(university -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(university);

            values.get(university).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(data);
        });

        Scene view = new Scene(lineChart);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(Shanghai.class);
    }
}
