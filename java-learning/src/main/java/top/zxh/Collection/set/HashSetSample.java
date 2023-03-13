package top.zxh.Collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class HashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new HashSet<>();
        //通过add方法增加新的元素
        mobileSet.add("78148325922");
        mobileSet.add("54624532124");
        mobileSet.add("68954428387");

        //Set集合不允许出现重复，add方法返回值代表是否真正在集合中插入数据
        boolean isChanged = mobileSet.add("8565252352365");
        System.out.println("Set集合是否发生改变："+isChanged);

        //对于已有的数据，再次调用add方法写入将返回false
        isChanged = mobileSet.add("8565252352365");
        System.out.println("Set集合是否发生改变："+isChanged);
        System.out.println(mobileSet);

        //Set集合可以使用所有Collection接口定义的方法
        int size = mobileSet.size();
        boolean result= mobileSet.contains("8565252352365");
        System.out.println(result);
        //需要额外注意的是，get等以索引获取数据的方法属于list接口，因此set实现类无法使用


    }
}
