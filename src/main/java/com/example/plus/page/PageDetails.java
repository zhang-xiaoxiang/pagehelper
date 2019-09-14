package com.example.plus.page;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 返回分页实体类(分页详情)
 * </p>
 *
 * @author jc
 * @since 2019-06-04
 */
@Component
@Data
public class PageDetails {
    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页的数量
     */
    private Integer pageSize;
    /**
     * 数据库查询出来的总记录数
     */
    private Long total;

    /**
     * 获取返回数据
     *
     * @param pageInfo 需要PageInfo的对象
     * @return 分页详情
     */
    public PageDetails getPageDetails(PageInfo pageInfo) {
        PageDetails pageDetails = new PageDetails();
        pageDetails.setPageNum(pageInfo.getPageNum());
        pageDetails.setPageSize(pageInfo.getPageSize());
        pageDetails.setTotal(pageInfo.getTotal());
        return pageDetails;

    }

}
