package top.xkk.chat.ui.view.login;

/**
 * 事件接口类，具体实现交给调用方。例如我们在点击登陆后将属于窗体的功能处理完毕后，实际的验证交给外部
 */
public interface ILoginEvent {

    /**
     * 登陆验证
     *
     * @param userId       用户ID
     * @param userPassword 用户密码
     */
    void doLoginCheck(String userId, String userPassword);

}