package com.example.plus.page;

import lombok.Data;

/**
 * ReceiveData:接收组装参数查询
 *
 * @author zhangxiaoxiang
 * @date 2019/6/12
 */
@Data
public class ReceiveData<T> {
    /**
     * 分页需求
     */
    private PageForm pageForm;
    /**
     *接收的具体对象
     */
    private T date;

    private String userId;


}
