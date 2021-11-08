package top.xkk.chat.ui.view.login;

import javafx.scene.control.Alert;
import top.xkk.chat.ui.view.chat.IChatMethod;

/**
 * 窗体的控制管理类，也是一个窗体的管家，它会继承窗体的装载、实现接口方法、初始化界面、初始化事件定义
 */
public class LoginController extends LoginInit implements ILoginMethod {

    private IChatMethod chat;
    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    public LoginController(ILoginEvent loginEvent, IChatMethod chat) {
        super(loginEvent);
        this.chat = chat;
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void doLoginError() {
        // TODO 登陆失败提示
    }

    @Override
    public void doLoginSuccess() {
        // 关闭原窗口
        close();
        // 打开聊天窗口
        chat.doShow();
    }
}
