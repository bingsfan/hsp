package com.smh.map_;

import java.util.*;

/**
 * ClassName: MapFor
 * Package: com.smh.map_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/27 0:23
 * @Version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        Set<String> keySet = map.keySet();
        System.out.println("==========1=========");
        for (String key : keySet) {
            System.out.println(key+"--"+map.get(key));
        }
        System.out.println("==========2=========");
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key =  iterator.next();
            System.out.println(key+"--"+map.get(key));
        }
        System.out.println("==========3=========");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("==========4=========");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            Map.Entry entry1 = entry;
            System.out.println(entry1);
        }
        System.out.println("==========5=========");
        Iterator<Map.Entry<String, String>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry);
        }
    }
}
