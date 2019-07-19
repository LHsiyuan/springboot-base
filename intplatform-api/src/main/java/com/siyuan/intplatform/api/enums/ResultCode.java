package com.siyuan.intplatform.api.enums;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-16
 * \* Time: 17:13
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 响应结果码枚举类
 * \
 */
public enum ResultCode {

    SUCCESS("0000","请求成功!"),
    PARAM_ERR("-1000","请求失败，参数有误"),
    EXCEPTION("-9999","系统异常"),
    TIME_OUT_ERR("-1001","服务超时/异常"),
    BUSINESS_ERR("-1002","业务失败");

    private String code;

    private String desc;

    ResultCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
