package cn.devin.service.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//必须要写，相当于提供了spring的环境
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class AppTest {
}
