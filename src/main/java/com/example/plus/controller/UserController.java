package com.example.plus.controller;


import com.example.plus.page.PageCondition;
import com.example.plus.page.PageRequest;
import com.example.plus.page.PageResponse;
import com.example.plus.service.UserService;
import com.example.plus.page.PageInitialize;
import com.example.plus.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    @Autowired
    private PageCondition pageCondition;

    // @RequestMapping("/get")
    // public Object getUser(@RequestBody User user){
    //     System.out.println("注意入参是json格式的才行: "+user.getUserId());
    //    return  userService.getUser(user.getUserId());
    // }


    /**
     * REST风格
     *
     * @param userid
     * @return
     */
    @GetMapping("/info/{userid}")
    public Object getUser(@PathVariable("userid") String userid) {
        System.out.println("这种直接在接口传参数 ");
        return userService.getUser(userid);
    }

    @GetMapping("/page/user")
    public Result getUserPage(@RequestBody PageRequest pageRequest) {
        System.out.println("查询条件===>" + pageRequest.getPageCondition());
        /**
         * 分页请求还原json格式
         */
        PageCondition condition = PageInitialize.getPageInitializeUtil(pageRequest.getPageCondition());
        System.out.println("查询条件json===>" + condition);
        PageResponse pageResponse = userService.getUserPage(pageRequest);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("查询用户信心成功!");
        result.setData(pageResponse);
        return result;

    }


}
