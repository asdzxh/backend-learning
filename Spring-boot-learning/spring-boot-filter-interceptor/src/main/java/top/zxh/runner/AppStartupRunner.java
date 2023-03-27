package top.zxh.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 19:09
 * @注释
 */
@Component
@Slf4j
public class AppStartupRunner implements ApplicationRunner {
 @Override
 public void run(ApplicationArguments args) throws Exception {
  log.info("ApplicationRunner参数名称: {}", args.getOptionNames());
  log.info("ApplicationRunner参数值: {}", args.getOptionValues("age"));
  log.info("ApplicationRunner参数: {}", Arrays.toString(args.getSourceArgs()));
 }

}
