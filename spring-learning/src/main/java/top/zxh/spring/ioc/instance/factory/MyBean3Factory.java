package top.zxh.spring.ioc.instance.factory;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
