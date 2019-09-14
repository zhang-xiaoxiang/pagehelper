package com.example.plus.page;

import lombok.Data;

/**
 * PageNavigation:请求分页的规格,不传默认给个值比较科学
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
