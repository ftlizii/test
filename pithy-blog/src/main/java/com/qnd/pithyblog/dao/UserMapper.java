package com.qnd.pithyblog.dao;

import com.qnd.pithyblog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String username);
    void insertUser(Integer id,String username,Integer age);
    void updateUser(Integer id,String username,Integer age);
    void deleteUser(String username);
}
