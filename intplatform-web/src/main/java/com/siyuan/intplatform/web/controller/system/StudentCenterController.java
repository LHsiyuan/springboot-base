package com.siyuan.intplatform.web.controller.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.siyuan.intplatform.api.vo.R;
import com.siyuan.intplatform.api.vo.student.StudentQueryBody;
import com.siyuan.intplatform.web.common.ResponseBuilder;
import com.siyuan.intplatform.web.entity.system.Students;
import com.siyuan.intplatform.web.service.system.StudentsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-16
 * \* Time: 16:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RequestMapping("/center/studentCenter")
@RestController
@Api(tags = "接口中心-学生模块分发服务")
public class StudentCenterController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping(value = "queryStudentInfos", method = RequestMethod.POST)
    @ApiOperation(value = "查询学生信息", notes = "查询学生信息")
    public R queryStudentInfos(@RequestBody StudentQueryBody studentQueryBody) throws Exception {
        Page<Students> studentses = studentsService.queryStudentInfos(studentQueryBody);
        return ResponseBuilder.success(studentses);

    }

}
