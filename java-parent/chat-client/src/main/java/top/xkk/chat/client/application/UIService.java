package top.xkk.chat.client.application;

import top.xkk.chat.ui.view.chat.IChatMethod;
import top.xkk.chat.ui.view.login.ILoginMethod;

public class UIService {


    private ILoginMethod login;
    private IChatMethod chat;

    public ILoginMethod getLogin() {
        return login;
    }

    public void setLogin(ILoginMethod login) {
        this.login = login;
    }

    public IChatMethod getChat() {
        return chat;
    }

    public void setChat(IChatMethod chat) {
        this.chat = chat;
    }
}
