package com.boot.demo.bootdemo.service;

import com.boot.demo.bootdemo.domain.User;
import com.boot.demo.bootdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther yanyunfan
 * @date 2019/3/12 14:31
 * @description
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    //第一种方式对应的Service
    public List<User> listAll() {
        return userMapper.selectAll();
    }

    //第二种方式对应的Service
    public int saveUser(User user) {
        return userMapper.save(user);
    }

    //第三种方式对应的Service，通用mapper，直接调用现成的增删改查sql
    public int delUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
