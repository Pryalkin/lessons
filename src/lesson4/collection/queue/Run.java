package lesson4.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Run {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Petya");
        arrayDeque.add("Luba");
        arrayDeque.add("Ivan");
        arrayDeque.add("Pavel");
        arrayDeque.add("Nic");
        arrayDeque.add("Olga");
        arrayDeque.add("Alesha");
        arrayDeque.add("Vova");
        arrayDeque.add("Ira");
        arrayDeque.add("Tanya");
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.element());
        System.out.println(arrayDeque.getLast());
        for (String name : arrayDeque) {
            System.out.println(name);
        }
    }
}
