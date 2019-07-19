package com.siyuan.intplatform.api.vo;

import lombok.*;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-16
 * \* Time: 16:57
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 响应信息主体类
 * \
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class R<T> implements Serializable {

    private String sign;
    private String code;
    private String message;
    private T data;

    public R(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public R(String code, String message, T data, String sign) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.sign = sign;
    }


}
