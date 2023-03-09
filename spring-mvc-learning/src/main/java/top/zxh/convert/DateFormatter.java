package top.zxh.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date:2023/3/9
 * Author：zxh
 * Description:
 */
public class DateFormatter implements Formatter<Date> {

    //定义日期格式
    String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date parse(String source, Locale locale) throws ParseException {
        //声明SimpleDateFormate
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);

        return simpleDateFormat.parse(source);
    }

    @Override
    public String print(Date date, Locale locale) {
        return new SimpleDateFormat().format(date);
    }
}
