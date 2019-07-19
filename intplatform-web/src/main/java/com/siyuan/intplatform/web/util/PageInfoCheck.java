package com.siyuan.intplatform.web.util;

import com.baomidou.mybatisplus.plugins.Page;
import com.siyuan.intplatform.api.vo.base.BaseQueryBody;
import com.siyuan.intplatform.api.vo.base.PageInfoQueryBody;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 14:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 分页信息校验
 * \
 */
public class PageInfoCheck {

    public static Page getRowBounds(BaseQueryBody baseQueryBody) {
        PageInfoQueryBody pageInfo = baseQueryBody.getPageInfo();
        int offset = 1;
        int limit = 20;
        if (pageInfo != null) {
            if (pageInfo.getPageRows() != null && pageInfo.getPageRows() > 0) {
                limit = pageInfo.getPageRows();
            }
            if (pageInfo.getPageIndex() != null && pageInfo.getPageIndex() > 0) {
                offset = pageInfo.getPageIndex();
            }
        }
        return new Page(offset, limit);
    }

}
