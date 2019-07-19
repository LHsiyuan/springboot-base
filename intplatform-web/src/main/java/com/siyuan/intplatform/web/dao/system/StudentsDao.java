package com.siyuan.intplatform.web.dao.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.siyuan.intplatform.api.vo.student.StudentQueryBody;
import com.siyuan.intplatform.web.entity.system.Students;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huangshuwei
 * @since 2019-07-16
 */
public interface StudentsDao extends BaseMapper<Students> {

    List<Students> queryStudentInfos(StudentQueryBody studentQueryBody, Page<Students> page);

}
