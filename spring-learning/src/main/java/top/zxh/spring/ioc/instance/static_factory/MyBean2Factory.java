package top.zxh.spring.ioc.instance.static_factory;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class MyBean2Factory {
    public static Bean2 createBean(){
        return new Bean2();
    }
}
