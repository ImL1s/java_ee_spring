package com.spring.test;

import com.spring.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        User use = new User();
    }

    @Test
    void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/applicationContext.xml");
        User user = (User) context.getBean("user");
        user.run();
    }
}
