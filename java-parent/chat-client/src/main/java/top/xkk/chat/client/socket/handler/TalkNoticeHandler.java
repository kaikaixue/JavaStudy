package top.xkk.chat.client.socket.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;
import top.xkk.chat.client.application.UIService;
import top.xkk.chat.protocol.talk.TalkNoticeResponse;
import top.xkk.chat.ui.view.chat.IChatMethod;

public class TalkNoticeHandler extends SimpleChannelInboundHandler<TalkNoticeResponse> {

    private final UIService uiService;

    public TalkNoticeHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TalkNoticeResponse msg) throws Exception {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            chat.addTalkBox(-1, 0, msg.getTalkId(), msg.getTalkName(), msg.getTalkHead(), msg.getTalkSketch(), msg.getTalkDate(), false);
        });
    }

}
