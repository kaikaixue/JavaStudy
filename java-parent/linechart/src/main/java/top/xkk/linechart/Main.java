package top.xkk.linechart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import top.xkk.linechart.view.Controller;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Main.class.getResource("view/sample.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        Scene scene = new Scene(root, 800, 500);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        controller.setStage(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
