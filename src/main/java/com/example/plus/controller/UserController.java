package com.example.plus.controller;


import com.example.plus.entity.User;
import com.example.plus.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 客户端用户表 前端控制器
 * </p>
 *
 * @author zhangxiaoxiang
 * @since 2019-07-04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // @RequestMapping("/get")
    // public Object getUser(@RequestBody User user){
    //     System.out.println("注意入参是json格式的才行: "+user.getUserId());
    //    return  userService.getUser(user.getUserId());
    // }


    //REST风格
    @GetMapping("/get/{userid}")
    public Object getUser(@PathVariable("userid") String userid) {
        System.out.println("这种直接在接口传参数 ");
        return userService.getUser(userid);
    }

}
