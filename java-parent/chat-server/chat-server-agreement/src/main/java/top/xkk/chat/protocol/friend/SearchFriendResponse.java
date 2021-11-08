package top.xkk.chat.protocol.friend;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.protocol.Command;
import top.xkk.chat.protocol.Packet;
import top.xkk.chat.protocol.friend.dto.UserDto;

import java.util.List;

/**
 * 搜索好友应答
 *
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
