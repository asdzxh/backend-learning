package top.zxh.exception.handle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zxh.exception.enums.CustomExceptionType;
import top.zxh.exception.exception.CustomException;
import top.zxh.exception.util.AjaxResponse;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description: 全局异常处理器
 */
@ControllerAdvice
@Slf4j
public class WebExceptionHandler {
    /**
     * 处理程序员主动转换的自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse handleException1(CustomException e){
        if(e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            log.info(CustomExceptionType.SYSTEM_ERROR.getDesc());
        }
        return AjaxResponse.error(e);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        return AjaxResponse.error(new CustomException(CustomExceptionType.PARAM_ERROR, fieldError.getDefaultMessage()));
    }

}
