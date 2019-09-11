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
public class PageVO {
    /**
     * 当前页
     */
    private Integer current;

    /**
     * 每页记录数
     */
    private Integer size;
    /**
     * 总记录数
     */
    private Long total;

    /**
     * 获取返回数据
     *
     * @param pageInfo 需要PageInfo的对象
     * @return 分页详情
     */
    public PageVO getPageVO(PageInfo pageInfo) {

        PageVO pageVO = new PageVO();
        pageVO.setCurrent(pageInfo.getPageNum());
        pageVO.setSize(pageInfo.getPageSize());
        pageVO.setTotal(pageInfo.getTotal());
        return pageVO;

    }

}
