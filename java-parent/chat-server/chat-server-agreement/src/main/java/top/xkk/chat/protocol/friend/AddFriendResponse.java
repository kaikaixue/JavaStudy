package top.xkk.chat.protocol.friend;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.protocol.Command;
import top.xkk.chat.protocol.Packet;

/**
 * 添加好友应答
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class AddFriendResponse extends Packet {

    private String friendId;
    private String friendNickName;
    private String friendHead;

    public AddFriendResponse() {
    }

    public AddFriendResponse(String friendId, String friendNickName, String friendHead) {
        this.friendId = friendId;
        this.friendNickName = friendNickName;
        this.friendHead = friendHead;
    }

    @Override
    public Byte getCommand() {
        return Command.AddFriendResponse;
    }
}
