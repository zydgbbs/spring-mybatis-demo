package com.zydgbbs.test;

import com.zydgbbs.domain.User;
import com.zydgbbs.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        User user = userMapper.getUserById(29);
        System.out.println(user);
    }
}
