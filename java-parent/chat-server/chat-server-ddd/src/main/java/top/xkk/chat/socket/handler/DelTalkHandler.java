package top.xkk.chat.socket.handler;

import io.netty.channel.Channel;
import top.xkk.chat.application.UserService;
import top.xkk.chat.protocol.talk.DelTalkRequest;
import top.xkk.chat.socket.MyBizHandler;

/**
 * @author mqxu
 */
public class DelTalkHandler extends MyBizHandler<DelTalkRequest> {

    public DelTalkHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, DelTalkRequest msg) {
        userService.deleteUserTalk(msg.getUserId(), msg.getTalkId());
    }
}
