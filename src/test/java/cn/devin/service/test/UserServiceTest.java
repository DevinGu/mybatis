package cn.devin.service.test;

import cn.devin.dao.entity.User;
import cn.devin.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.Assert.assertTrue;

public class UserServiceTest extends AppTest {

    @Autowired
    private UserService userService;

    @Test
    public void save(){
        User user = new User();
        user.setName("Devin");
        user.setPassword("asdfghj");

        userService.save(user);

        user = userService.queryById(1);

        assertTrue(user!=null);
    }


}
