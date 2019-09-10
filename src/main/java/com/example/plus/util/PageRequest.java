package com.example.plus.util;

import lombok.Data;
/**
 * PageForm:默认分页大小
 * @author zhangxiaoxiang
 * @date 2019/6/12
 */
@Data
public class PageRequest {
    /**
     * 当前页
     */
    private Integer current=1;
    /**
     * 每页记录数
     */
    private Integer size=10;





    /**
     * 查询条件
     */
    private Integer selectType;


    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
}
