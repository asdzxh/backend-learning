package top.zxh.spring.ioc.iocExercise4;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class Pen {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{" +
               "name='" + name + '\'' +
               '}';
    }
}
