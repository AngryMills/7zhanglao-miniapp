package com.mys.my.zhanglao.wx.miniapp.domain.result;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ApiResult<T> implements Serializable {

    protected Integer code = 200;
    protected String message = "";
    protected T data;

    public ApiResult() {
    }

    public ApiResult(T data) {
        this.data = data;
    }

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ApiResult success() {
        return new ApiResult(CommonResultCodes.CODE_SUCCESS, CommonResultCodes.MSG_SUCCESS);
    }

    public static ApiResult success(Object data) {
        ApiResult r = new ApiResult(CommonResultCodes.CODE_SUCCESS, CommonResultCodes.MSG_SUCCESS, data);
        return r;
    }

    /**
     * 返回操作 只有响应吗和消息
     */
    public static ApiResult result(Integer code) {
        return ApiResult.result(code, "");
    }

    public static ApiResult result(Integer code, String msg) {
        return new ApiResult(code, msg);
    }


    /**
     * 返回操作 只有响应吗和消息
     */
    public static ApiResult fail() {
        return ApiResult.result(400, "操作失败");
    }

    public static ApiResult fail(String msg) {
        ApiResult r = ApiResult.result(400, msg);
        return r;
    }


}
