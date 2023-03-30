package top.zxh.exception.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuth {
    String value();
}
