package top.zxh.exception.consts;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description:
 */
public interface MsgConsts {
    //message常量维护

    String SUCCESS = "请求响应成功";

    String PARAM_ERROR = "参数非法";

    String UNAUTHORIZED = "参数非法";

    String FORBIDDEN_ERROR = "访问被拒绝";

    String INPUT_ERROR="输入的数据错误或没有权限访问资源！";

    String SYSTEM_ERROR="系统出现异常，请稍后再试或联系管理员！";

    String OTHER_ERROR="系统出现未知异常，请联系管理员！";


    //code常量维护

    int CODE_200=400;

    int CODE_400=400;

    int CODE_401=401;

    int CODE_403=403;

    int CODE_500=500;

    int CODE_999=999;

    int INPUT_CODE=400;
    int SYSTEM_CODE=500;
    int OTHER_CODE=999;





}
