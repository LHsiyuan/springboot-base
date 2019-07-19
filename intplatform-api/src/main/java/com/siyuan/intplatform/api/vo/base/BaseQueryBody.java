package com.siyuan.intplatform.api.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 8:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 基础查询分页
 * \
 */
@ApiModel(value = "基础查询分页")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseQueryBody {
    @ApiModelProperty("查询分页信息")
    private PageInfoQueryBody pageInfo;
}
