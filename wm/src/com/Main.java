package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer > map1 = new HashMap<String, Integer >();
        map1.put("jack", 20);
        map1.put("rose", 18);
        map1.put("lucy", 17);
        map1.put("java", 25);
        System.out.println(map1);
        // 添加重复的键值（值不同）,会返回集合中原有（重复键）的值，		 System.out.println(map1.put("jack", 30)); //20

        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("张三丰", 100);
        map2.put("虚竹", 20);
        System.out.println("map2:" + map2);
// 从指定映射中将所有映射关系复制到此映射中。
        map1.putAll(map2);
        System.out.println("map1:" + map1);
        System.out.println("value:" + map1.remove("java"));
        map1.clear();
        System.out.println("map1:" + map1);
    }
}