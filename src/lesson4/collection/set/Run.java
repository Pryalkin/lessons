package lesson4.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {
        hashSet();
        System.out.println("---------------------------------------");
        linkedHashSet();
        System.out.println("---------------------------------------");
        treeSet();
    }

    private static void hashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Petya");
        hashSet.add("Luba");
        hashSet.add("Ivan");
        hashSet.add("Pavel");
        hashSet.add("Nic");
        hashSet.add("Olga");
        hashSet.add("Alesha");
        hashSet.add("Vova");
        hashSet.add("Ira");
        hashSet.add("Tanya");
        System.out.println(hashSet);
        hashSet.remove("Alesha");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Pavel"));
        for (String name:hashSet) {
            System.out.println(name);
        }
    }

    private static void linkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Petya");
        linkedHashSet.add("Luba");
        linkedHashSet.add("Ivan");
        linkedHashSet.add("Pavel");
        linkedHashSet.add("Nic");
        linkedHashSet.add("Olga");
        linkedHashSet.add("Alesha");
        linkedHashSet.add("Vova");
        linkedHashSet.add("Ira");
        linkedHashSet.add("Tanya");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Alesha");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("Pavel"));
        for (String name:linkedHashSet) {
            System.out.println(name);
        }
    }

    private static void treeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Petya");
        treeSet.add("Luba");
        treeSet.add("Ivan");
        treeSet.add("Pavel");
        treeSet.add("Nic");
        treeSet.add("Olga");
        treeSet.add("Alesha");
        treeSet.add("Vova");
        treeSet.add("Ira");
        treeSet.add("Tanya");
        System.out.println(treeSet);
        treeSet.remove("Alesha");
        System.out.println(treeSet);
        System.out.println(treeSet.contains("Pavel"));
        for (String name:treeSet) {
            System.out.println(name);
        }
    }
}
