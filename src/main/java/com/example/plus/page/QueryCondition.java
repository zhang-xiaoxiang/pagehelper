package com.example.plus.page;

import com.example.plus.entity.User;
import lombok.Data;

/**
 * ConditionalConstructor:条件构造器
 *
 * @author XXX
 * @date 2019/9/12
 */

@Data
public class QueryCondition<T> {
    // private Class<T> tClass;
    private T t;
    private Class<T> tClass;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;

    public static void main(String[] args) {




    }

}
