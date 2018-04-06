package cn.devin.service.Impl;

import cn.devin.dao.entity.User;
import cn.devin.dao.mapper.UserMapper;
import cn.devin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public User queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
