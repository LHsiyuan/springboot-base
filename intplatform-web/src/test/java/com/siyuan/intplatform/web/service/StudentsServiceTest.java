package com.siyuan.intplatform.web.service;

import com.alibaba.fastjson.JSONObject;
import com.siyuan.intplatform.api.vo.base.PageInfoQueryBody;
import com.siyuan.intplatform.api.vo.student.StudentQueryBody;
import com.siyuan.intplatform.web.BaseSimpleTest;
import org.junit.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 16:17
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StudentsServiceTest extends BaseSimpleTest {




    /**
     * 請求商品信息
     *
     * @throws Exception
     */
    @Test
    public void queryProductInfos() throws Exception {
        StudentQueryBody studentQueryBody = new StudentQueryBody();
        studentQueryBody.setKeyWord("we");
        studentQueryBody.setPageInfo(new PageInfoQueryBody(1,2,"20180506","20191212"));
        Object o = JSONObject.toJSON(studentQueryBody);

        System.out.println(o.toString());

    }

}
