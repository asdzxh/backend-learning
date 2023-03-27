package top.zxh.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 19:08
 * @注释
 */
@Component
@Slf4j
public class CommandLineStartupRunner  implements CommandLineRunner {
 @Override
 public void run(String... args) throws Exception {
  log.info("CommandLineStartupRunner传入参数：{}", Arrays.toString(args));
 }
}
