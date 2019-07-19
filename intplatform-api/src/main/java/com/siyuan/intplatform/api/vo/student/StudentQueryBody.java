package com.siyuan.intplatform.api.vo.student;

import com.siyuan.intplatform.api.vo.base.BaseQueryBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 15:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("查询学生请求体")
public class StudentQueryBody extends BaseQueryBody {

    @ApiModelProperty("关键字查询")
    private String keyWord;

}
