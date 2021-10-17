package com.example.java.jfx.basic;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PieChartExample extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        PieChart pieChart = new PieChart();
        pieChart.setData(getCharData());
        pieChart.setTitle("饼图");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);

        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    private ObservableList<PieChart.Data> getCharData() {
        ObservableList<PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new PieChart.Data("Java", 17), new PieChart.Data("JavaFX", 31), new PieChart.Data("Swing", 10), new PieChart.Data("IO", 20), new PieChart.Data("NIO", 17));
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }
}