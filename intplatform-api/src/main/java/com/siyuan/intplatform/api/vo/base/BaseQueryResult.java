package com.siyuan.intplatform.api.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 8:42
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 基础查询结果
 * \
 */
@ApiModel(value = "基础查询结果")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseQueryResult {
    @ApiModelProperty("分页信息")
    private PageInfo pageInfo;
}