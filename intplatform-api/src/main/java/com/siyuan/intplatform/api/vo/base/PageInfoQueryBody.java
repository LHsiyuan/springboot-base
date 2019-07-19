package com.siyuan.intplatform.api.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 8:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 分页查询体
 * \
 */
@ApiModel(value = "分页查询体")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageInfoQueryBody {
    @ApiModelProperty("页码")
    private Integer pageIndex;

    @ApiModelProperty("每页记录数")
    private Integer pageRows;

    @ApiModelProperty("开始时间,格式yyyy-MM-dd HH:mm:ss")
    private String startTime;

    @ApiModelProperty("结束时间,格式yyyy-MM-dd HH:mm:ss")
    private String endTime;
}
