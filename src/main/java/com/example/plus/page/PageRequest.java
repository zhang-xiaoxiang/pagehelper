package com.example.plus.page;

import lombok.Data;

/**
 * PageRequest:封装前端完整的分页请求
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
