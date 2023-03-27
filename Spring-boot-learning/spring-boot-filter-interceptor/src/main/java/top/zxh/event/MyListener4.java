package top.zxh.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author zxh
 * @Date 2023/3/27 19:28
 * @注释
 */
@Slf4j
@Component
public class MyListener4 {
  @EventListener
 public void listener(MyEvent event){
   log.info(String.format("%s 监听到事件源：%s.", MyListener4.class.getName(), event.getSource()));

  }
}
