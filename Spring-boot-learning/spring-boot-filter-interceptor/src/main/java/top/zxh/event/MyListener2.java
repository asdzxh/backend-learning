package top.zxh.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author zxh
 * @Date 2023/3/27 19:01
 * @注释
 */
@Component
@Slf4j
public class MyListener2 implements ApplicationListener<MyEvent> {
 @Override
 public void onApplicationEvent(MyEvent event) {
  log.info(String.format("%s 监听到事件源：%s.", MyListener2.class.getName(), event.getSource()));

 }
}
