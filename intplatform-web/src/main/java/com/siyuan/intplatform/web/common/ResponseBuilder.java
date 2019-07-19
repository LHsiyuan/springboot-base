package com.siyuan.intplatform.web.common;

import com.siyuan.intplatform.api.enums.ResultCode;
import com.siyuan.intplatform.api.vo.R;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-16
 * \* Time: 17:12
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 响应消息封装类
 * \
 */
public class ResponseBuilder {

    private ResponseBuilder() {}

    public static <T> R<T> success() {
        return success(null);
    }

    public static <T> R<T> success(T data) {
        ResultCode success = ResultCode.SUCCESS;
        return new R<>(success.getCode(), success.getDesc(), data);
    }

    public static <T> R<T> exception() {
        ResultCode exception = ResultCode.EXCEPTION;
        return new R<>(exception.getCode(), exception.getDesc(), null);
    }

    public static <T> R<T> error(ResultCode exception, T data) {
        return new R<>(exception.getCode(), exception.getDesc(), data);
    }


}
