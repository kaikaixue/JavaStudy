package top.xkk.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.xkk.chat.infrastructure.po.Groups;

@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}
