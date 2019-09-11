package com.example.plus.controller;



import com.example.plus.page.ReceiveData;
import com.example.plus.page.ResultDataVO;
import com.example.plus.page.UserForm;
import com.example.plus.service.UserService;
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
    public Object getUserPage(@RequestBody ReceiveData<UserForm> receiveData) {
        ResultDataVO resultDataVO= userService.getUserPage(receiveData);
        return null;

    }


}
