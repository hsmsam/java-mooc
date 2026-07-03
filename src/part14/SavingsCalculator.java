package part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        VBox vbox = new VBox();

        BorderPane row1 = new BorderPane();
        BorderPane row2 = new BorderPane();

        Label header1 = new Label("Monthly savings");
        Label header2 = new Label("Yearly interest rate");

        Slider slider1 = new Slider(25, 250, 25);
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);

        Slider slider2 = new Slider(0, 10, 1);
        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);

        Label slider1Label = new Label();
        Label slider2Label = new Label();

        slider1Label.textProperty().bind(slider1.valueProperty().asString("%.0f"));
        slider2Label.textProperty().bind(slider2.valueProperty().asString("%.0f"));

        row1.setLeft(header1);
        row1.setCenter(slider1);
        row1.setRight(slider1Label);
        row2.setLeft(header2);
        row2.setCenter(slider2);
        row2.setRight(slider2Label);

        vbox.getChildren().addAll(row1, row2);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);

        Runnable updateChart = () -> {

            double monthly = slider1.getValue();
            double yearly = monthly * 12;

            XYChart.Series<Number, Number> savingsOnly = new XYChart.Series<>();
            XYChart.Series<Number, Number> withInterest = new XYChart.Series<>();

            double balance = 0;

            for (int year = 0; year <= 30; year++) {

                savingsOnly.getData().add(new XYChart.Data<>(year, yearly * year));

                if (year > 0) {
                    balance = (balance + yearly) * (1 + slider2.getValue() / 100.0);
                }

                withInterest.getData().add(new XYChart.Data<>(year, balance));
            }

            lineChart.getData().clear();
            lineChart.getData().addAll(savingsOnly, withInterest);
        };

        slider1.valueProperty().addListener((obs, oldValue, newValue) -> updateChart.run());

        slider2.valueProperty().addListener((obs, oldValue, newValue) -> updateChart.run());

        updateChart.run();

        layout.setTop(vbox);
        layout.setCenter(lineChart);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculator.class);
    }
}
