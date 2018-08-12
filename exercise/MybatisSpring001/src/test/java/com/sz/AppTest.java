package com.sz;

import static org.junit.Assert.assertTrue;

import com.sz.mapper.UserMapper;
import com.sz.pojo.User;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = ctx.getBean("userMapper", UserMapper.class);
        UserService userService = ctx.getBean("userService",UserService.class);

        User user = new User();
        user.setUsername("admin222333");
        user.setPassword("123123");

        userService.insert(user);

//        userMapper.insert(user);

    }
}
