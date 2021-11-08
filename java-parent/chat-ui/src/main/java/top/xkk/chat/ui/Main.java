package top.xkk.chat.ui;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import top.xkk.chat.ui.view.chat.ChatController;
import top.xkk.chat.ui.view.chat.IChatEvent;
import top.xkk.chat.ui.view.chat.IChatMethod;
import top.xkk.chat.ui.view.chat.group_bar_friend.ElementFriendNewUser;
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
        IChatMethod chat = new ChatController(new IChatEvent() {
            @Override
            public void doQuit() {
                System.out.println("退出操作！");
            }

            @Override
            public void doSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate) {
                System.out.println("发送消息");
                System.out.println("userId：" + userId);
                System.out.println("talkType[0好友/1群组]：" + talkType);
                System.out.println("talkId：" + talkId);
                System.out.println("msg：" + msg);
                System.out.println("msgType[0文字消息/1固定表情]：" + msgType);
            }

            @Override
            public void doEventAddTalkUser(String userId, String userFriendId) {
                System.out.println("填充到聊天窗口[好友] userFriendId：" + userFriendId);
            }

            @Override
            public void doEventAddTalkGroup(String userId, String groupId) {
                System.out.println("填充到聊天窗口[群组] groupId：" + groupId);
            }

            @Override
            public void doEventDelTalkUser(String userId, String talkId) {
                System.out.println("删除对话框：" + talkId);
            }

            @Override
            public void addFriendNew(String userId, ListView<Pane> listView) {
                System.out.println("新的朋友");
                // 添加朋友
                listView.getItems().add(new ElementFriendNewUser("1000004", "彼岸花开", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/1.jpg", 0).pane());
                listView.getItems().add(new ElementFriendNewUser("1000005", "开到荼蘼", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/2.jpg", 1).pane());
            }

            @Override
            public void doFriendNewSearch(String userId, String text) {
                System.out.println("搜索好友：" + text);
            }

            @Override
            public void doEventAddNewUser(String userId, String friendId) {
                System.out.println("添加好友：" + friendId);
            }
        });
                chat.doShow();
                chat.addTalkBox(0, 0, "007", "杨阳学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/yy.jpg", "我的神", new Date(), false);
                chat.addTalkBox(0, 0, "005", "陈蓉琪学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/crq.jpg", "啥问题都能解决", new Date(), false);
                chat.addTalkBox(0, 0, "004", "王林学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/wl.jpg", "活跃气氛大师", new Date(), false);
                chat.addTalkBox(0, 0, "003", "张怡沁学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/zyq.jpg", "引路人咯", new Date(), false);

//                chat.addTalkMsgUserLeft("002","好好学习", new Date(), true, false, true);
                chat.addTalkBox(0, 0, "001", "许老师", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/mqxu.jpg", "许老师yyds", new Date(), false);
                chat.addTalkBox(0, 0, "008", "张浩杰学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/zhj.jpg", "是个问题都能解决，牛", new Date(), false);
                chat.addTalkBox(0, 0, "002", "王锋学长", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/wf.jpg", "照顾我的锋哥", new Date(), false);
//                chat.addTalkMsgRight("002","好好加班",new Date(), false, false, true);
//                chat.addTalkMsgUserLeft("002","好好学习", new Date(), false, false, true);
                chat.addTalkBox(0, 0, "006", "尚宇驰学姐", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg", "大哥", new Date(), false);
//                chat.addTalkMsgRight("006","好好加班",new Date(), false, false, false);
//                chat.addTalkMsgUserLeft("006","明天一起打羽毛球哈", new Date(), false, false, true);

                // 群组
                chat.addFriendGroup("2000001","松山院","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/ssy.png");

                // 群组 - 对话框
                chat.addTalkBox(0,1, "0001", "松山院", "https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/ssy.png","", new Date(), false);
//                chat.addTalkMsgRight("0001", "松山院与我们同在", new Date(), false, false, false);

                // 好友
                chat.addFriendUser(false, "008", "许老师","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/mqxu.jpg");
                chat.addFriendUser(false, "007", "杨阳学长","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/yy.jpg");
                chat.addFriendUser(false, "006", "尚宇驰学姐","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/syc.jpg");
                chat.addFriendUser(false, "005", "陈蓉琪学姐","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/crq.jpg");
                chat.addFriendUser(false, "004", "王林学姐","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/wl.jpg");
                chat.addFriendUser(false, "003", "张怡沁学姐","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/zyq.jpg");
                chat.addFriendUser(false, "001", "张浩杰学长","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/zhj.jpg");
                chat.addFriendUser(false, "002", "王锋学长","https://javafx-study.oss-cn-hangzhou.aliyuncs.com/avatar/wf.jpg");
            }


    public static void main(String[] args) {
        launch(args);
    }
}