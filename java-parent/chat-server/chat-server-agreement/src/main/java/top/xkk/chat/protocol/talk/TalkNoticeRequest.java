package top.xkk.chat.protocol.talk;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.protocol.Command;
import top.xkk.chat.protocol.Packet;

/**
 * 对话通知请求
 *
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class TalkNoticeRequest extends Packet {

    private String userId;
    private String friendUserId;
    /**
     * 对话框类型[0好友、1群组]
     */
    private Integer talkType;

    public TalkNoticeRequest() {
    }

    public TalkNoticeRequest(String userId, String friendUserId, Integer talkType) {
        this.userId = userId;
        this.friendUserId = friendUserId;
        this.talkType = talkType;
    }

    @Override
    public Byte getCommand() {
        return Command.TalkNoticeRequest;
    }
}
