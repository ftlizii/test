package com.qnd.pithyblog.service;

import com.qnd.pithyblog.dao.UserMapper;
import com.qnd.pithyblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserByName(String name){
        return userMapper.selectUserByName(name);
    }
    public void getinsertUser(Integer id,String username,Integer age){ userMapper.insertUser(id,username,age);}
    public void getupdateUser(Integer id,String username,Integer age){ userMapper.updateUser(id,username,age);}
    public void getdeleteUser(String name){ userMapper.deleteUser(name);}
}
