package com.boot.demo.bootdemo.mapper;

import com.boot.demo.bootdemo.common.MyMapper;
import com.boot.demo.bootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yanyunfan
 * @date 2019/3/12 14:30
 * @description
 */

@Mapper
public interface UserMapper extends MyMapper<User> {
    //第一种方式，注解sql，方便，但维护性略差
    @Select("select * from user")
    List<User> selectAll();

    //第二种方式，xml方式，易维护
    int save(User user);

    //第三种方式：通用mapper，本身提供了很多现成的增删改查sql；例如：int deleteByPrimaryKey()
}
