package com.yuan.util;

import com.yuan.domain.User;
import com.yuan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring.xml"})
public class SqlTest {
    @Autowired
    private UserService userService;

    @Test
    public void TestUserService(){


        User user = new User();
        user.setAge(18);
        user.setUserName("ydz");
        user.setPassword("123");
        user.setTrueName("原东朝");
        userService.add(user);
    }
}