package top.zxh.Collection.Exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:1. 实现员工信息类 Employee
 * ○ 成员变量：编号id（int），姓名name（String），薪资salary（double）
 * ○ 方法：构造方法和相关的get和set方法
 * 2. 定义三条员工信息添加到 ArrayList 中
 * 3. 将所有员工的姓名和薪资输出，见效果图
 */

public class test1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "张三", 5000.0));
        employees.add(new Employee(2, "李四", 5500.0));
        employees.add(new Employee(3, "赵六", 4000.0));

        System.out.println("员工姓名  " + "员工薪资");
        for (Employee e : employees) {
            System.out.println(e.getName()+"\t\t"+e.getSalary());
        }
    }


}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Employee {
    int id;
    String name;
    Double salary;

}
