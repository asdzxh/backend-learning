package top.zxh.Collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class LinkedHashMapSample {
    public static void main(String[] args) {
        Map<String,Object> myMap = new LinkedHashMap<>();
        myMap.put("name","张三");
        myMap.put("age",18);
        myMap.put("height",182);
        myMap.put("weight",60);
        //按插入顺序提取数据
        System.out.println(myMap);
    }
}
