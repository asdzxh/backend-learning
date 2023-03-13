package top.zxh.Collection.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("三国演义");
        bookList.add(0,"水浒传");
        bookList.add("西游记");
        bookList.add("红楼梦");
        System.out.println(bookList);


        bookList.addFirst("蒸汽革命");
        bookList.addLast("黄金时代");
        System.out.println(bookList);

        //三种遍历方式
        System.out.println("------------------方式一：for循环-------------------");
        for (String book :bookList){
            System.out.print(book+" ");
        }
        System.out.println();
        System.out.println("-----------------方式二：利用forEach方法+Lambda表达式简化循环过程-----------");
        bookList.forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------方式三：利用fIterator迭代器-----------");
        Iterator<String> itr = bookList.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }


    }
}
