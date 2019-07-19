package com.siyuan.intplatform.api.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-16
 * \* Time: 17:27
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 分页信息
 * \
 */
@ApiModel(value = "分页信息")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo {
    @ApiModelProperty("分页总页数")
    private Integer totalPages;

    @ApiModelProperty("每页记录数")
    private Integer pageSize;

    @ApiModelProperty("当前页号")
    private Integer currentPage;

    @ApiModelProperty("总记录数")
    private Integer totalRows;
}
