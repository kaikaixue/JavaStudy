package top.xkk.chat.ui.view.chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import top.xkk.chat.ui.Main;
import top.xkk.chat.ui.view.UIObject;

import java.io.IOException;
import java.util.Objects;

public abstract class ChatInit extends UIObject {
    private static final String RESOURCE_NAME = "view/chat/chat.fxml";

    /**
     * 用户ID
     */
    public String userId;
    /**
     * 用户昵称
     */
    public String userNickName;
    /**
     * 用户头像
     */
    public String userHead = "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/x.jpg";

    public IChatEvent chatEvent;

    /**
     * 输入框
     */
    public TextArea txtInput;

    ChatInit(IChatEvent chatEvent) {
        this.chatEvent = chatEvent;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 1243, 820);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        // 设置窗口置顶
        ((Stage) scene.getWindow()).setAlwaysOnTop(true);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        //this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain() {
        // 可以预加载
        txtInput = $("txt_input", TextArea.class);
    }
}
