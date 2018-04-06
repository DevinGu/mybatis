package cn.devin.dao.mapper;

import cn.devin.dao.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}