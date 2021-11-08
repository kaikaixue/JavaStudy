package top.xkk.chat.client.socket.handler;

import io.netty.channel.Channel;
import javafx.application.Platform;
import top.xkk.chat.client.application.UIService;
import top.xkk.chat.client.socket.MyBizHandler;
import top.xkk.chat.protocol.friend.AddFriendResponse;
import top.xkk.chat.ui.view.chat.IChatMethod;

public class AddFriendHandler extends MyBizHandler<AddFriendResponse> {

    public AddFriendHandler(UIService uiService) {
        super(uiService);
    }

    @Override
    public void channelRead(Channel channel, AddFriendResponse msg) {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> chat.addFriendUser(true, msg.getFriendId(), msg.getFriendNickName(), msg.getFriendHead()));
    }

}
