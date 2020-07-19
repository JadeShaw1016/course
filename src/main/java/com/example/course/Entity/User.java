package com.example.course.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3116:46
 */
@Getter
@Setter
@ToString
public class User {
    private Integer id;

    private String name;

    private String sex;

    private String birthday;

    private Integer graduationyear;

    private String post;

    private String cellphone;

    private String email;

    private String wx;


    public User(){

    }

    public User(String name, String sex, String birthday, String graduationyear, String post, String cellphone, String email, String wx)
    {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.graduationyear = Integer.parseInt(graduationyear);
        this.post = post;
        this.cellphone = cellphone;
        this.email = email;
        this.wx = wx;
    }
}