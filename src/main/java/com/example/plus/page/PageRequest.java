package com.example.plus.page;

import lombok.Data;

/**
 * PageRequest:接收组装参数查询
 *
 * @author zhangxiaoxiang
 * @date 2019/6/12
 */
@Data
public class PageRequest {
    /**
     * 分页需求
     */
    private PageNavigation pageNavigation;
    /**
     *接收的具体对象
     */
    private PageCondition pageCondition;




}
