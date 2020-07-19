package com.example.course.Service;

import com.example.course.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3117:20
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void insetTest(){
        User user = new User();
        user.setName("李四");
        user.setSex("男");
        user.setBirthday("2020-5-31");
        user.setGraduationyear(2020);
        user.setPost("1234");
        user.setCellphone("18965191587");
        user.setEmail("453@qq.com");
        user.setWx("123");
    }


    @Test
    public void updateById(){
        int id = 1;
        User user = new User();
        user.setName("张三");
        user.setSex("男");
        user.setBirthday("2020");
        user.setGraduationyear(2017);
        user.setPost("1234");
        user.setCellphone("18965191587");
        user.setEmail("453@qq.com");
        user.setWx("123");

    }

}
