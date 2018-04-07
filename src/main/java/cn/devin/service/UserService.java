package cn.devin.service;


import cn.devin.dao.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    User queryById(Integer id);

    boolean deleteById(Integer id);

    List<User> queryAll();

    User login(String username,String password);
}
