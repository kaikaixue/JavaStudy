package top.xkk.chat.domain.inet.repository;

import top.xkk.chat.domain.inet.model.ChannelUserInfo;
import top.xkk.chat.domain.inet.model.ChannelUserReq;

import java.util.List;

/**
 * @author mqxu
 */
public interface IInetRepository {

    /**
     * queryChannelUserCount
     *
     * @param req req
     * @return long
     */
    Long queryChannelUserCount(ChannelUserReq req);

    /**
     * queryChannelUserList
     *
     * @param req req
     * @return List
     */
    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
