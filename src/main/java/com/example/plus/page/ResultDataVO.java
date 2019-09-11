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
public class ResultDataVO<T> {
    /**
     * 分页详情
     */
    private PageVO pageVO;

    /**
     * 查询结果(分页数据)
     */
    private T dataList;

    /**
     *
     * @param pageInfo
     * @return 完整分页结果集(给前端解析的)
     */
    public ResultDataVO getResultDataVO(PageInfo pageInfo){
        ResultDataVO resultDataVO=new ResultDataVO();
        PageVO pageVO=new PageVO();
        pageVO.setCurrent(pageInfo.getPageNum());
        pageVO.setSize(pageInfo.getPageSize());
        pageVO.setTotal(pageInfo.getTotal());
        resultDataVO.setDataList(pageInfo.getList());
        resultDataVO.setPageVO(pageVO);
        return resultDataVO;

    }

}
