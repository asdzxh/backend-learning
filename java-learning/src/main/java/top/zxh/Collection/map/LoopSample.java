package top.zxh.Collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class LoopSample {
    /**
     * 利用for循环遍历所有key，再获取value
     */
    public void doForLoop(Map<String,Object> map){
        Set<String> keys = map.keySet();
        for (String k :keys){
            System.out.println(k +":"+map.get(k));
        }
    }

    /**
     * 利用forEach方法+Lambda表达式循环遍历
     * @param map
     */
    public void doForEach(Map<String,Object> map){
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });

    }

    public void doIterator(Map<String,Object> map){
        Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Object> entry = itr.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String,Object> myMap = new LinkedHashMap<>();
        myMap.put("name","张三");
        myMap.put("age",18);
        myMap.put("height",182);
        myMap.put("weight",60);
        System.out.println(myMap);
        System.out.println("-------------------------------------------------------");

        LoopSample loopSample = new LoopSample();
        loopSample.doForLoop(myMap);
        System.out.println("-------------------------------------------------------");

        loopSample.doIterator(myMap);
        System.out.println("-------------------------------------------------------");

        loopSample.doForEach(myMap);

    }
}
