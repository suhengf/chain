package com.csy.chain.mapper;

import com.csy.chain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);

    void insert(User user);
}
