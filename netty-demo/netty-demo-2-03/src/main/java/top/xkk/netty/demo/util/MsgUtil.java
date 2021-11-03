package top.xkk.netty.demo.util;

import top.xkk.netty.demo.domain.MsgInfo;

public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
