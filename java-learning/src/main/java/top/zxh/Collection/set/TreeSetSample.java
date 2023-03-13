package top.zxh.Collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class TreeSetSample {
    static class InterComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public void sort(){
        Set<Integer> set = new TreeSet<>(new InterComparator());
        set.add(100);
        set.add(140);
        set.add(180);
        set.add(200);
        set.add(300);
        System.out.println(set);
    }

    public static void main(String[] args) {
        new TreeSetSample().sort();
    }
}
