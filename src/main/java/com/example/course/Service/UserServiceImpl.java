package com.example.course.Service;

import com.example.course.Entity.User;
import com.example.course.Mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3115:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(HttpServletRequest request) {
        User user = new User(request.getParameter("name"),request.getParameter("sex"),
                request.getParameter("birthday"),request.getParameter("graduationYear"),
                request.getParameter("post"),request.getParameter("cellphone"),
                request.getParameter("email"),request.getParameter("wx"));
        return userMapper.insert(user);
    }

    @Override
    public int updateById(HttpServletRequest request,Integer id){
        User user = new User(request.getParameter("name"),request.getParameter("sex"),
                request.getParameter("birthday"),request.getParameter("graduationYear"),
                request.getParameter("post"),request.getParameter("cellphone"),
                request.getParameter("email"),request.getParameter("wx"));
        return userMapper.updateById(user,id);
    }

    @Override
    public User findById(Integer id){
        return userMapper.findAllById(id);
    }

    @Override
    public int deleteById(Integer id){
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}




