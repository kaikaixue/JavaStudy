package top.xkk.netty.demo.util;

import top.xkk.netty.demo.domain.MsgBody;

public class MsgUtil {

    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo("使用protobuf通信格式的服务端，XKK");
        return msg.build();
    }

}
