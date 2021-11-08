package top.xkk.chat.protocol.login;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.protocol.Command;
import top.xkk.chat.protocol.Packet;

/**
 * 重连请求
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class ReconnectRequest extends Packet {

    private String userId;

    public ReconnectRequest(String userId) {
        this.userId = userId;
    }

    @Override
    public Byte getCommand() {
        return Command.ReconnectRequest;
    }
}
