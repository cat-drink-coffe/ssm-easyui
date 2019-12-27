
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.yuan.domain.User;
import com.yuan.service.UserService;
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
    public void TestUserService() throws Exception {
        @SuppressWarnings("resource")

        User user = new User();
        user.setAge(1);
        user.setUserName("zhangsan");
        user.setPassword("123456");
        user.setTrueName("张三");
        userService.add(user);
    }
}