package top.zxh.Exception;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class demo1 {
    public static void main(String[] args) {
        try {
            Class.forName("test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
