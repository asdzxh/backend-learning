package top.zxh.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;


/**
 * @version 1.0
 * @Author zxh
 * @Date 2023/3/27
 * @注释
 */
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
 @Override
 public void onApplicationEvent(MyEvent event) {
  log.info(String.format("%s 监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
 }
}
