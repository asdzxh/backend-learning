package top.zxh.Exception.tryCatch;

import java.io.IOException;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class ExceptionalTest {
    private boolean test01(){
        boolean ret = true;
        try {
            ret = test02();
        } catch (Exception e) {
            System.out.println("test error"+e.getMessage());
            ret = false;
        }finally {
            System.out.println("test01,finnaly,return->"+ret);
            return ret;
        }
    }

    private boolean test02() {
        boolean ret = true;
        try {
            // 问题1：test03 发生异常了，虽然 try catch 了，但调用的地方没有接收
            test03();
            System.out.println("因为test03报错，我不应该执行。");
            return ret;
        } catch (Exception e) {
            System.out.println("test02 error:" + e.getMessage());
            ret = false;
        } finally {
            System.out.println("test02 finally, return -> " + ret);
            return ret;
        }
    }

    private boolean test03()  {
        boolean ret = true;
        try {
            System.out.println("即将发生异常");
            int a = 1 / 0;
            System.out.println("发生异常后，还会执行我吗？");
            return true;
        } catch (ArithmeticException e) {
            System.out.println("test03 error:" + e.getMessage());
            ret = false;
            throw new IOException();
        } finally {
            System.out.println("test03 finally, return -> " + ret);
            return ret;
        }
    }



    public static void main(String[] args) {
        ExceptionalTest main = new ExceptionalTest();
        try {
            boolean b = main.test01();
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
