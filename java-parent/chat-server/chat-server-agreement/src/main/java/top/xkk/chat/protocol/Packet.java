package top.xkk.chat.protocol;

import top.xkk.chat.protocol.friend.AddFriendRequest;
import top.xkk.chat.protocol.friend.AddFriendResponse;
import top.xkk.chat.protocol.friend.SearchFriendRequest;
import top.xkk.chat.protocol.friend.SearchFriendResponse;
import top.xkk.chat.protocol.login.LoginRequest;
import top.xkk.chat.protocol.login.LoginResponse;
import top.xkk.chat.protocol.login.ReconnectRequest;
import top.xkk.chat.protocol.msg.MsgGroupRequest;
import top.xkk.chat.protocol.msg.MsgGroupResponse;
import top.xkk.chat.protocol.msg.MsgRequest;
import top.xkk.chat.protocol.msg.MsgResponse;
import top.xkk.chat.protocol.talk.DelTalkRequest;
import top.xkk.chat.protocol.talk.TalkNoticeRequest;
import top.xkk.chat.protocol.talk.TalkNoticeResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Packet {

    private final static Map<Byte, Class<? extends Packet>> PACK_TYPE = new ConcurrentHashMap<>();

    static {
        PACK_TYPE.put(Command.LoginRequest, LoginRequest.class);
        PACK_TYPE.put(Command.LoginResponse, LoginResponse.class);
        PACK_TYPE.put(Command.MsgRequest, MsgRequest.class);
        PACK_TYPE.put(Command.MsgResponse, MsgResponse.class);
        PACK_TYPE.put(Command.TalkNoticeRequest, TalkNoticeRequest.class);
        PACK_TYPE.put(Command.TalkNoticeResponse, TalkNoticeResponse.class);
        PACK_TYPE.put(Command.SearchFriendRequest, SearchFriendRequest.class);
        PACK_TYPE.put(Command.SearchFriendResponse, SearchFriendResponse.class);
        PACK_TYPE.put(Command.AddFriendRequest, AddFriendRequest.class);
        PACK_TYPE.put(Command.AddFriendResponse, AddFriendResponse.class);
        PACK_TYPE.put(Command.DelTalkRequest, DelTalkRequest.class);
        PACK_TYPE.put(Command.MsgGroupRequest, MsgGroupRequest.class);
        PACK_TYPE.put(Command.MsgGroupResponse, MsgGroupResponse.class);
        PACK_TYPE.put(Command.ReconnectRequest, ReconnectRequest.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return PACK_TYPE.get(command);
    }

    /**
     * ??????????????????
     *
     * @return ???????????????
     */
    public abstract Byte getCommand();

}

