package top.xkk.chat.ui.view.chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import top.xkk.chat.ui.Main;
import top.xkk.chat.ui.view.UIObject;

import java.io.IOException;
import java.util.Objects;

public abstract class ChatInit extends UIObject {
    private static final String RESOURCE_NAME = "view/chat/chat.fxml";

    ChatInit() {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 980, 720);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        initView();
        initEventDefine();
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {

    }
}
