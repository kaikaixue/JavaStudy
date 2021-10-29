//package com.example.java.jfx.basic.control;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.TilePane;
//import javafx.scene.web.HTMLEditor;
//import javafx.stage.Stage;
//
//public class HtmlEditor extends Application {
//    @Override
//    public void start(Stage stage) {
//        stage.setTitle("HTMLEditor");
//        String text = "<html><body><h1>松山院大家庭</h1></body></html>";
//        TilePane tilePane = new TilePane();
//        HTMLEditor htmlEditor = new HTMLEditor();
//        htmlEditor.setHtmlText(text);
//        tilePane.getChildren().add(htmlEditor);
//        Scene scene = new Scene(tilePane, 600, 500);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
