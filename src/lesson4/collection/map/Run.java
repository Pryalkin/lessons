package lesson4.collection.map;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        hashMap();
        System.out.println("----------------------------------------------");
        treeMap();
        System.out.println("----------------------------------------------");
        linkedHashMap();
    }

    private static void linkedHashMap() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("zero", "Pavel");
        linkedHashMap.put("one", "Ivan");
        linkedHashMap.put("two", "Tatiana");
        linkedHashMap.put("three", "Ira");
        linkedHashMap.put("four", "Maria");
        linkedHashMap.put("five", "Petr");
        System.out.println(linkedHashMap);
        for (String key: linkedHashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String value: linkedHashMap.values()) {
            System.out.println(value);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Map.Entry<String,String> mapEntry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }

    private static void treeMap() {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("zero", "Pavel");
        treeMap.put("one", "Ivan");
        treeMap.put("two", "Tatiana");
        treeMap.put("three", "Ira");
        treeMap.put("four", "Maria");
        treeMap.put("five", "Petr");
        System.out.println(treeMap);
        for (String key: treeMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String value: treeMap.values()) {
            System.out.println(value);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Map.Entry<String,String> mapEntry : treeMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }

    private static void hashMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("zero", "Pavel");
        hashMap.put("one", "Ivan");
        hashMap.put("two", "Tatiana");
        hashMap.put("three", "Ira");
        hashMap.put("four", "Maria");
        hashMap.put("five", "Petr");
        System.out.println(hashMap);
        for (String key: hashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String value: hashMap.values()) {
            System.out.println(value);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Map.Entry<String,String> mapEntry : hashMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }
}
