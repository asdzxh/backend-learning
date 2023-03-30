package top.zxh.exception.enums;

import lombok.Getter;
import top.zxh.exception.consts.Consts;
import top.zxh.exception.consts.MsgConsts;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description: 异常类型枚举
 */
@Getter
public enum CustomExceptionType {

    PARAM_ERROR(Consts.CODE_400,Consts.PARAM_ERROR),
    UNAUTHORIZED_ERROR(Consts.CODE_401,Consts.UNAUTHORIZED_ERROR),
    FORBIDDEN_ERROR(Consts.CODE_403,Consts.FORBIDDEN_ERROR),
    SYSTEM_ERROR(Consts.CODE_500,Consts.SYSTEM_ERROR),
    OTHER_ERROR(Consts.CODE_999,Consts.OTHER_ERROR);



//    PARAM_ERROR(MsgConsts.CODE_400,MsgConsts.PARAM_ERROR),
//
//    UNAUTHORIZED_ERROR(MsgConsts.CODE_401,MsgConsts.UNAUTHORIZED),
//
//    FORBIDDEN_ERROR(MsgConsts.CODE_403,MsgConsts.FORBIDDEN_ERROR),
//
//    /**
//     * 客户端异常
//     */
//    USER_INPUT_ERROR(MsgConsts.INPUT_CODE,MsgConsts.INPUT_ERROR),
//
//    /**
//     * 服务器异常
//     */
//    SYSTEM_ERROR(MsgConsts.SYSTEM_CODE,MsgConsts.SYSTEM_ERROR),
//
//    /**
//     * 未知异常
//     */
//    OTHER_ERROR(MsgConsts.OTHER_CODE,MsgConsts.OTHER_ERROR);




    CustomExceptionType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 异常类型状态码
     */
    private final int code;

    /**
     * 异常类型中文描述
     */
    private final String desc;

    }
