package com.zydgbbs.test;

import com.zydgbbs.domain.User;
import com.zydgbbs.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*方式一UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        User user = userMapper.getUserById(29);
        System.out.println(user);*/

        //方式三 mybatis plus，方式四 通用mapper
        //方式二
        UserMapper userMapper = context.getBean("userMapper2",UserMapper.class);
        User user = userMapper.getUserById(29);
        System.out.println(user);
    }
}
