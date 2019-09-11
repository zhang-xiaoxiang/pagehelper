// package com.example.plus.util;
//
// import com.github.pagehelper.PageInfo;
// import lombok.Data;
//
//
// /**
//  * PageResult:响应分页请求的结果(不包含数据,这样方便前段获取到后遍历,解耦合的意味)
//  * int和对应的包装类各有好处,自行选取
//  *
//  * @author zhangxiaoxiang
//  * @date 2019/9/10
//  */
// @Data
// public class PageResult {
//
//     /**
//      * 当前页码
//      */
//     private Integer current;
//     /**
//      * 每页数量
//      */
//     private Integer pageSize;
//     /**
//      * 数据总条数
//      */
//     private Long totalSize;
//     /**
//      * 页码总数
//      */
//     private Long total;
//
//     /**
//      * 返回分页详情
//      *
//      * @param pageInfo 需要PageInfo的对象
//      * @return 分页详情(不含数据)
//      */
//     public PageResult PageResult(PageInfo pageInfo) {
//         PageResult pageResult = new PageResult();
//         pageResult.setCurrent(pageInfo.getPageNum());
//         pageResult.setPageSize(pageInfo.getPageSize());
//         pageResult.setTotal(pageInfo.getTotal());
//         return pageResult;
//     }
// }