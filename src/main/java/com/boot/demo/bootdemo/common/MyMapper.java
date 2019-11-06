package com.boot.demo.bootdemo.common;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author yanyunfan
 * @date 2019/3/17 2:15
 * @description
 */

public interface MyMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
}
