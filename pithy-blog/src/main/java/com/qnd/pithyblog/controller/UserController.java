package com.qnd.pithyblog.controller;

import com.qnd.pithyblog.dao.UserMapper;
import com.qnd.pithyblog.domain.User;
import com.qnd.pithyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getUser")
    public User getUserByName(){
        User user = userService.getUserByName("litaihe");
        return user;
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("getinsertUser")
    public void getinsertUser(@RequestParam Integer id,String username,Integer age){ userService.getinsertUser(id,username,age);}

    @RequestMapping("getupdateUser")
    public void getupdateUser(@RequestParam Integer id,String username,Integer age){ userService.getupdateUser(id,username,age);}

    @RequestMapping("getdeleteUser")
    public void getdeleteUser(@RequestParam String username){ userService.getdeleteUser(username);}
}
