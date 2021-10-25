package top.xkk.chat.ui.view.face;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import top.xkk.chat.ui.Main;
import top.xkk.chat.ui.view.UIObject;
import top.xkk.chat.ui.view.chat.ChatInit;
import top.xkk.chat.ui.view.chat.IChatEvent;
import top.xkk.chat.ui.view.chat.IChatMethod;

import java.io.IOException;
import java.util.Objects;

/**
 * 初始化表情框
 */
public abstract class FaceInit extends UIObject {

    private static final String RESOURCE_NAME = "view/face/face.fxml";

    public Pane rootPane;
    public ChatInit chatInit;
    public IChatEvent chatEvent;
    public IChatMethod chatMethod;

    FaceInit(final UIObject obj) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        // 模态窗口
        initModality(Modality.APPLICATION_MODAL);
        initOwner(obj);
        //初始化页面和事件
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain() {
        rootPane = $("face", Pane.class);
    }

    public Parent root() {
        return super.root;
    }

}
