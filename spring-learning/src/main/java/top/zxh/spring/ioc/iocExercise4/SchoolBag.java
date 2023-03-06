package top.zxh.spring.ioc.iocExercise4;

import java.util.List;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class SchoolBag {
    //颜色
    private String color ;
    //铅笔盒
    private List<Pen> pencilCase;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPencilCase() {
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
               "color='" + color + '\'' +
               ", pencilCase=" + pencilCase +
               '}';
    }
}
