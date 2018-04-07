package cn.devin.service.test;

import cn.devin.dao.entity.User;
import cn.devin.dao.mapper.UserMapper;
import cn.devin.service.Impl.UserServiceImpl;
import cn.devin.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class})
@PowerMockIgnore("javax.management.*")
public class UserServiceMockTest {

    private User user;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService = new UserServiceImpl();

    @Before
    public void init() {
        user = new User();
        user.setId(3);
        user.setName("devin");
        user.setPassword("098765");
    }

    @Test
    public void getByid() {
        PowerMockito.when(userMapper.selectByPrimaryKey(3)).thenReturn(user);
        User userTemp = userService.queryById(3);
        Assert.assertEquals(userTemp,user);
    }

    @Test
    public void deleteById(){
        PowerMockito.when(userMapper.deleteByPrimaryKey(4)).thenThrow(new Exception("mock exception"));
        boolean result = userService.deleteById(4);
        Assert.assertEquals(result,true);
    }

    @Test
    public void login() {
    }
}
