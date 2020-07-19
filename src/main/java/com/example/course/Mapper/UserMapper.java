package com.example.course.Mapper;

import com.example.course.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3116:46
 */

@Mapper
@Repository
public interface UserMapper {
    int insert(User user);
    int updateById(@Param("updated") User updated, @Param("id") Integer id);
    User findAllById(@Param("id")Integer id);
    int deleteById(@Param("id")Integer id);
    List<User> findAll();

}