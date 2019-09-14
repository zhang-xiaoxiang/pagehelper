package com.example.plus.page;


import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 返回分页实体和查询结果数据实体类--完整分页结果集(给前端解析的)
 * </p>
 *
 * @author jc
 * @since 2019-06-04
 */
@Component
@Data
public class PageResponse<T> {
    /**
     * 分页详情
     */
    private PageDetails pageDetails;

    /**
     * 查询结果(分页数据)
     */
    private T pageDataList;

    /**
     *
     * @param pageInfo
     * @return 完整分页结果集(给前端解析的)
     */
    public PageResponse getResultDataVO(PageInfo pageInfo){
        PageResponse pageResponse =new PageResponse();
        PageDetails pageDetails =new PageDetails();
        pageDetails.setPageNum(pageInfo.getPageNum());
        pageDetails.setPageSize(pageInfo.getPageSize());
        pageDetails.setTotal(pageInfo.getTotal());
        pageResponse.setPageDataList(pageInfo.getList());
        pageResponse.setPageDetails(pageDetails);
        return pageResponse;

    }

}
