package com.boot.demo.bootdemo.controller;

import com.boot.demo.bootdemo.domain.User;
import com.boot.demo.bootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author yanyunfan
 * @date 2019/3/12 14:32
 * @description
 */

@Controller
public class UserController {
    @Resource
    private UserService userService;

    //第一种方式对应的Controller
    @GetMapping(value = "/listUser")
    @ResponseBody
    public List<User> listAll() {
        return userService.listAll();
    }

    //第二种方式对应的Controller
    @PostMapping(value = "/saveUser")
    @ResponseBody
    public String saveUser(HttpServletRequest request) {
        User user = new User();
        user.setName(request.getParameter("username"));
        user.setCreateDate(new Date());
        return userService.saveUser(user)==1?"SUCCESS":"FAIL";
    }

    //第三种方式对应的Controller
    @GetMapping(value = "/delUser")
    @ResponseBody
    public String delUser(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return userService.delUser(id)==1?"SUCCESS":"FAIL";
    }

    //跳转到主页
    @GetMapping(value = "index")
    public String index(){
        return "index";
    }

    //跳转到登录页面
    @GetMapping(value = "login")
    public String login(){
        return "login";
    }
}
