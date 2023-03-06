package top.zxh.spring.ioc.iocExercise;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class Cat {

    private String name;
    private Integer age;


    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }

}
