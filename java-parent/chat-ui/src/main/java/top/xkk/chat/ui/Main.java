package top.xkk.chat.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import top.xkk.chat.ui.view.chat.ChatController;
import top.xkk.chat.ui.view.chat.IChatMethod;
import top.xkk.chat.ui.view.login.ILoginMethod;
import top.xkk.chat.ui.view.login.LoginController;

import java.io.IOException;

/**
 * 启动主类
 */
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        ILoginMethod login = new LoginController((userId, userPassword) -> {
//            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
//        });
//
//        login.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        IChatMethod chat = new ChatController();
        chat.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}