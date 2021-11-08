package top.xkk.chat.domain.inet.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.xkk.chat.infrastructure.common.PageReq;

/**
 * @author mqxu
 */
@Getter
@Setter
@ToString
public class ChannelUserReq extends PageReq {

    private String userId;
    private String userNickName;

}
