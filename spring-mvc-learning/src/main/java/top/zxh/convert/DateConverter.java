package top.zxh.convert;

import org.springframework.core.convert.converter.Converter;

import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2023/3/9
 * Author：zxh
 * Description: 日期转换类
 */
public class DateConverter implements Converter<String, Date> {

    //定义日期格式
    private final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException("无效的日期格式，请使用这种格式："+PATTERN);
        }
    }


}
