package com.example.java.jfx.basic;

import com.example.java.jfx.util.SystemInfoUtil;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PipedReader;
import java.util.Collection;
import java.util.Stack;

public class CPUPieChartExample extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        PieChart pieChart = new PieChart();
        pieChart.setData(getCharData());
//        pieChart.setTitle("CPU使用率");
        pieChart.setTitle("内存使用率");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);

        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public ObservableList<PieChart.Data> getCharData() {
        ObservableList<PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new PieChart.Data("使用", (Double) SystemInfoUtil.getMemInfo().get("isused")), new PieChart.Data("未使用", (Double) SystemInfoUtil.getMemInfo().get("unused")));
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }
}
