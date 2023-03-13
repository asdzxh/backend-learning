package top.zxh.Collection.Exercise;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        System.out.println("排序前:");
        for (String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println("\n" + "排序后:");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s : list) {
            System.out.print(s + "\t");
        }
    }
}
