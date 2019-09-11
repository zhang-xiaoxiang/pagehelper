package com.example.plus.page;

import lombok.Data;

@Data
public class UserForm {
    /**
     * 用户昵称或手机号搜索
     */
    private String userName;

    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
}
