package com.csy.chain.service;

import com.csy.chain.entity.User;
import com.csy.chain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public void insert(){
        User user = new User();
        user.setId(1);
        user.setUserName("llf");
        user.setRealName("liulingfeng");
        user.setPassWord("password");
        userMapper.insert(user );
    }


}
