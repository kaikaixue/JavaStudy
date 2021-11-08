package top.xkk.chat.protocol.msg;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.protocol.Command;
import top.xkk.chat.protocol.Packet;

import java.util.Date;

/**
 * 群组消息请求
 *
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class MsgGroupRequest extends Packet {

    /**
     * 对话框ID
     */
    private String talkId;
    /**
     * 群员ID
     */
    private String userId;
    /**
     * 传输消息内容
     */
    private String msgText;
    /**
     * 消息类型；0文字消息、1固定表情
     */
    private Integer msgType;
    /**
     * 消息时间
     */
    private Date msgDate;

    public MsgGroupRequest() {
    }

    public MsgGroupRequest(String talkId, String userId, String msgText, Integer msgType, Date msgDate) {
        this.talkId = talkId;
        this.userId = userId;
        this.msgText = msgText;
        this.msgType = msgType;
        this.msgDate = msgDate;
    }


    @Override
    public Byte getCommand() {
        return Command.MsgGroupRequest;
    }

}
