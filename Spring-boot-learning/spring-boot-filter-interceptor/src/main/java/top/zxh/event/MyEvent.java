package top.zxh.event;

import org.springframework.context.ApplicationEvent;

/**
 * @version 1.0
 * @Author zxh
 * @Date 2023/3/27 18:57
 * @注释
 */
public class MyEvent extends ApplicationEvent {
 public MyEvent(Object source) {
  super(source);
 }
}
