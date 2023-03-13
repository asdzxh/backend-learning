package top.zxh.Collection.map.listSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:集合排序
 */
public class CustomObjectSortSample {
    private static class CustomComparator implements Comparator<Goods>{
        @Override
        public int compare(Goods o1,Goods o2){
            return o2.getTitle().compareTo(o1.getTitle());
        }
    }

    public List<Goods> sort(List<Goods> list){
        CustomComparator comp = new CustomComparator();
        list.sort(comp);
        return list;
    }

    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("1882733333555","商品A"));
        goodsList.add(new Goods("8882733333555","商品B"));
        goodsList.add(new Goods("8382733333555","商品C"));
        goodsList.add(new Goods("1882733333333","商品D"));
        System.out.println("排序前");
        System.out.println(goodsList);

        System.out.println("排序后");
        List<Goods> sort = new CustomObjectSortSample().sort(goodsList);
        System.out.println(sort);
    }
}
