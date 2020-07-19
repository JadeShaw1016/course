package com.example.course.Service;

import com.example.course.Entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3115:41
 */

public interface UserService {

    public int insert(HttpServletRequest request);

    public int updateById(HttpServletRequest request,Integer id);

    public User findById(Integer id);

    public int deleteById(Integer id);

    public List<User> findAll();
}




