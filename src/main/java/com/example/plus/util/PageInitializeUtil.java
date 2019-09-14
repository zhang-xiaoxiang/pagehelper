package com.example.plus.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.plus.page.PageCondition;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * PageInitializeUtil:
 *
 * @author zhangxiaoxiang
 * @date: 2019/09/15
 */
@Data
public class PageInitializeUtil {
    public static PageCondition getPageInitializeUtil(PageCondition pageCondition){
        String pageConditionStr = JSON.toJSONString(pageCondition);
        Map<String, Object> map = new HashMap<>();
        JSONObject pageObject = JSONObject.parseObject(pageConditionStr);
        for (Map.Entry<String, Object> entry : pageObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            map.put(entry.getKey(), entry.getValue());
        }
         pageCondition.setMap(map);
        return pageCondition;
    }
}
