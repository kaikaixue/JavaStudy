package top.xkk.chat.ui.view.chat;

public class ChatController extends ChatInit implements IChatMethod{

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        super.show();
    }
}
