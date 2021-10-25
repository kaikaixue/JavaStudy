package top.xkk.chat.ui;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import top.xkk.chat.ui.view.chat.ChatController;
import top.xkk.chat.ui.view.chat.IChatEvent;
import top.xkk.chat.ui.view.chat.IChatMethod;
import top.xkk.chat.ui.view.login.ILoginMethod;
import top.xkk.chat.ui.view.login.LoginController;

import java.io.IOException;
import java.util.Date;

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
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            if ("xkk".equals(userId) && "123456".equals(userPassword)) {
                // 登录成功，弹框
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登陆成功");
                alert.showAndWait();
                IChatMethod chat = new ChatController(new IChatEvent() {
                });
                chat.doShow();
                chat.addTalkBox(0, 0, "007", "杨阳学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPDgQ9rjH1K43NBDjNBDg_1080_1080.jpg", "我的神", new Date(), true);
                chat.addTalkBox(0, 0, "005", "陈蓉琪学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPDgQ9rjAoNR3NAsPNArQ_692_707.jpg", "啥问题都能解决", new Date(), true);
                chat.addTalkBox(0, 0, "004", "王林学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPDhJzxumu9WXNArLNArI_690_690.jpg", "活跃气氛大师", new Date(), true);
                chat.addTalkBox(0, 0, "003", "张怡沁学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPD3Irsal6VqvNAm3NAmc_615_621.jpg", "引路人咯", new Date(), true);

//                chat.addTalkMsgUserLeft("002","好好学习", new Date(), true, false, true);
                chat.addTalkBox(0, 0, "001", "张浩杰学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPGpNya3ilVQDNAvTNA-k_1001_756.jpg", "是个问题都能解决，牛", new Date(), true);
                chat.addTalkBox(0, 0, "008", "许老师", "https://t.ly/HEjv", "许老师yyds", new Date(), true);
                chat.addTalkBox(0, 0, "002", "王锋学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPD4PvNY560XjNArbNAtA_720_694.jpg", "照顾我的锋哥", new Date(), true);
                chat.addTalkMsgRight("002","好好加班",new Date(), true, false, true);
                chat.addTalkMsgUserLeft("002","好好学习", new Date(), true, false, true);
                chat.addTalkBox(0, 0, "006", "尚宇驰学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/lADPDgQ9rjEky8fNAbDNAbA_432_432.jpg", "大哥", new Date(), true);
//                chat.addTalkMsgRight("006","好好加班",new Date(), true, false, false);
                chat.addTalkMsgUserLeft("006","明天一起打羽毛球哈", new Date(), false, false, true);
            }
        });
        login.doShow();
//        IChatMethod chat = new ChatController();
//        chat.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}