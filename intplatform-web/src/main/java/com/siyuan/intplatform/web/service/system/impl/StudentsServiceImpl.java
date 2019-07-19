package com.siyuan.intplatform.web.service.system.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.siyuan.intplatform.api.vo.student.StudentQueryBody;
import com.siyuan.intplatform.web.dao.system.StudentsDao;
import com.siyuan.intplatform.web.entity.system.Students;
import com.siyuan.intplatform.web.service.system.StudentsService;
import com.siyuan.intplatform.web.util.PageInfoCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangshuwei
 * @since 2019-07-16
 */
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsDao, Students> implements StudentsService {

    @Autowired
    private StudentsDao studentsDao;

    @Override
    public Page<Students> queryStudentInfos(StudentQueryBody studentQueryBody) {
        Page page = PageInfoCheck.getRowBounds(studentQueryBody);
        List list = studentsDao.queryStudentInfos(studentQueryBody, page);
        page.setRecords(list);
        return page;


    }
}
