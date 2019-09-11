package com.example.plus.mapper;

import com.example.plus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.plus.page.UserForm;

import java.util.List;

/**
 * <p>
 * 客户端用户表 Mapper 接口
 * </p>
 *
 * @author zhangxiaoxiang
 * @since 2019-07-04
 */
public interface UserDao extends BaseMapper<User> {
    List<User> selectUserList(UserForm date);
//这里面有丰富的查询方法,自定义的也可以写在这里
}
