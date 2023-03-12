package top.zxh.Exception.tryCatch;
import lombok.extern.slf4j.Slf4j;


/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
@Slf4j
public class tryCatchDemo1 {
    public static void main(String[] args) {
        /*
        什么时候 catch，什么时候throws？

        功能内容可以解决，用catch，解决不了，用throws告诉调用者，由调用者解决。
         */
        try{
            //代码区
            throw new Exception();
        }catch(Exception e){
            //log.error可以向控制台和Logback指定的文件同时输入
            log.error("error: {}", e);
        }finally{
            //最后必须执行的部分
        }
    }

    public void test() throws Exception{
        throw new Exception();

    }
}
