package top.xkk.chat.socket.handler;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import top.xkk.chat.application.UserService;
import top.xkk.chat.domain.user.model.ChatRecordInfo;
import top.xkk.chat.domain.user.model.UserInfo;
import top.xkk.chat.infrastructure.common.Constants;
import top.xkk.chat.infrastructure.common.SocketChannelUtil;
import top.xkk.chat.protocol.msg.MsgGroupRequest;
import top.xkk.chat.protocol.msg.MsgGroupResponse;
import top.xkk.chat.socket.MyBizHandler;

/**
 * 群组消息发送
 *
 * @author xkk
 */
public class MsgGroupHandler extends MyBizHandler<MsgGroupRequest> {

    public MsgGroupHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, MsgGroupRequest msg) {
        // 获取群组通信管道
        ChannelGroup channelGroup = SocketChannelUtil.getChannelGroup(msg.getTalkId());
        if (null == channelGroup) {
            SocketChannelUtil.addChannelGroup(msg.getTalkId(), channel);
            channelGroup = SocketChannelUtil.getChannelGroup(msg.getTalkId());
        }
        // 异步写库
        userService.asyncAppendChatRecord(new ChatRecordInfo(msg.getUserId(), msg.getTalkId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate(), Constants.TalkType.Group.getCode()));
        // 群发消息
        UserInfo userInfo = userService.queryUserInfo(msg.getUserId());
        MsgGroupResponse msgGroupResponse = new MsgGroupResponse();
        msgGroupResponse.setTalkId(msg.getTalkId());
        msgGroupResponse.setUserId(msg.getUserId());
        msgGroupResponse.setUserNickName(userInfo.getUserNickName());
        msgGroupResponse.setUserHead(userInfo.getUserHead());
        msgGroupResponse.setMsg(msg.getMsgText());
        msgGroupResponse.setMsgType(msg.getMsgType());
        msgGroupResponse.setMsgDate(msg.getMsgDate());
        channelGroup.writeAndFlush(msgGroupResponse);
    }

}
