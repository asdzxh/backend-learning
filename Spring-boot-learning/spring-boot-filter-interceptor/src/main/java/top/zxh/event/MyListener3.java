package top.zxh.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @version 1.0
 * @Author zxh
 * @Date 2023/3/27 19:26
 * @注释
 */
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {
 @Override
 public void onApplicationEvent(MyEvent event) {
  log.info(String.format("%s 监听到事件源：%s.", MyListener3.class.getName(), event.getSource()));
 }
}
