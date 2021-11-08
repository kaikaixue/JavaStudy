package top.xkk.chat.client.event;

import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;
import top.xkk.chat.client.infrastructure.util.BeanUtil;
import top.xkk.chat.client.infrastructure.util.CacheUtil;
import top.xkk.chat.protocol.login.LoginRequest;
import top.xkk.chat.ui.view.login.ILoginEvent;

@Slf4j
public class LoginEvent implements ILoginEvent {

    @Override
    public void doLoginCheck(String userId, String userPassword) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new LoginRequest(userId, userPassword));
        CacheUtil.userId = userId;
    }

}
