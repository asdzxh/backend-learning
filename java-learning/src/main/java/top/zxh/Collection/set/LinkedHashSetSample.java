package top.zxh.Collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<>();
        mobileSet.add("13377778888");
        mobileSet.add("13377778889");
        mobileSet.add("13377778885");
        mobileSet.add("13377778884");
        System.out.println(mobileSet);
    }
}
