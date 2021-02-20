package com.mys.my.zhanglao.wx.miniapp.domain.result;


public class CommonResultCodes {

    public static final Integer CODE_SUCCESS = 200;
    public static final String MSG_SUCCESS = "success";

    //以下是系统错误码以及通用错误
    public static final Integer CODE_FAILURE = 10001;
    public static final String MSG_FAILURE = "操作失败";

    public static final Integer CODE_PARAM_LACK = 10002;
    public static final String MSG_PARAM_LACK = "缺少字段";

    public static final Integer CODE_FORMAT_ERROR = 10003;
    public static final String MSG_FORMAT_ERROR = "格式错误";

    public static final Integer CODE_APM_EXCEPTION = 10004;
    public static final String MSG_APM_EXCEPTION = "接口异常报警";

    public static final Integer CODE_SERVER_ERROR = 10005;
    public static final String MSG_SERVER_ERROR = "服务内部错误";

    public static final Integer CODE_BUSINESS_EXCEPTION = 10006;
    public static final String MSG_BUSINESS_EXCEPTION = "后台接口异常报警";


}
