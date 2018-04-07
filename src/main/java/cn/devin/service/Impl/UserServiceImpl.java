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

    public boolean deleteById(Integer id) {
        int result = userMapper.deleteByPrimaryKey(id);
        if (result < 1) {
            return false;
        }
        return true;
    }

    public List<User> queryAll() {
        return userMapper.selectAll();
    }

    public User login(String username, String password) {
        if (username == null) {
            throw new RuntimeException("用户名为空");
        }
        if (password == null) {
            throw new RuntimeException("密码为空");
        }
        User loginUser = userMapper.selectByUsername(username);
        if (loginUser == null) {
            throw new RuntimeException("不存在用户");
        } else if (!password.equals(loginUser.getPassword())) {
            throw new RuntimeException("密码错误");
        } else {
            return loginUser;
        }
    }
}
