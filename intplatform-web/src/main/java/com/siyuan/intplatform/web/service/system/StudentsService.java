package com.siyuan.intplatform.web.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.siyuan.intplatform.api.vo.student.StudentQueryBody;
import com.siyuan.intplatform.web.entity.system.Students;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangshuwei
 * @since 2019-07-16
 */
public interface StudentsService extends IService<Students> {

    Page<Students> queryStudentInfos(StudentQueryBody studentQueryBody);

}
