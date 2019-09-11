package com.example.plus.page;

import lombok.Data;

/**
 * PageForm:默认分页大小
 * @author zhangxiaoxiang
 * @date 2019/6/12
 */
@Data
public class PageForm {
    /**
     * 当前页
     */
    private Integer current=1;
    /**
     * 每页记录数
     */
    private Integer size=10;

    /**
     * 用户昵称或手机号搜索
     */
    private String userName;

    /**
     * 根据用户ID搜索
     */
    private String userId;

    /**
     * 查询条件
     */
    private Integer selectType;
    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
}
