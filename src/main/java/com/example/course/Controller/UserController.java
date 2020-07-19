package com.example.course.Controller;

import com.example.course.Entity.User;
import com.example.course.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Administrator
 * @Description: IntelliJ IDEA
 * @create 2020/5/3116:28
 */
@Controller
@RequestMapping("/course")
@ComponentScan(value = "course.service")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/addUser")
    public String toRegisterPage(){
        return "setInfo";
    }

    @RequestMapping("/setInfo")
    public String insert(HttpServletRequest request, Model model){
        userService.insert(request);
        model.addAttribute("msg", "注册成功!");
        return "redirect:/course/getAll";
    }

    @RequestMapping("/find")
    public String toGetUserPage(){
        return "findById";
    }

    @RequestMapping("/getUser")
    public String findById(Model model,Integer id){
        User user =  userService.findById(id);
        model.addAttribute("userinfo",user);
        return "findAllUser";
    }

    @RequestMapping("/findById")
    public String findById(HttpServletRequest request,Model model){
        Integer id = Integer.parseInt(request.getParameter("userId"));
        User user =  userService.findById(id);
        model.addAttribute("userinfo",user);
        return "findAllUser";
    }

    @RequestMapping("/getAll")
    public String findAll(Model model){
        List<User> user =  userService.findAll();
        model.addAttribute("userinfo",user);
        return "findAllUser";
    }

    @RequestMapping("/updateUser")
    public String toupdatePage(HttpServletRequest request,Model model){
        Integer id = Integer.parseInt(request.getParameter("id"));
        model.addAttribute("id",id);
        return "updateInfo";
    }

    @RequestMapping("/updateInfo")
    public String update(HttpServletRequest request, Model model){
        Integer id = Integer.parseInt(request.getParameter("id"));
        userService.updateById(request,id);
        model.addAttribute("msg", "修改成功!");
        return "redirect:/course/getAll";
    }

    @RequestMapping("/deleteUser")
    public String deleteById(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        userService.deleteById(id);
        return "redirect:/course/getAll";
    }


}
