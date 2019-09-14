package com.example.plus.page;

import lombok.Data;

/**
 * PageNavigation:默认分页大小
 * @author zhangxiaoxiang
 * @date 2019/6/12
 */
@Data
public class PageNavigation {
    /**
     * 当前页
     */
    private Integer pageNum=1;
    /**
     * 每页记录数
     */
    private Integer pageSize=10;


}
