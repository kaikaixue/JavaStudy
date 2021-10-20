package top.xkk.notepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/notepad.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(Main.class.getResource("view/notepad.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),700,500);
        stage.setScene(scene);
        stage.setTitle("Notepad");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
