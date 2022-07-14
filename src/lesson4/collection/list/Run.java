package lesson4.collection.list;

import lesson1.phone.Phone;
import lesson4.collection.list.PhoneComparator;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        arraList();
        linkedList();
        comparable();
        System.out.println("----------------------------------------");
        comparator();
    }

    private static void comparator() {
        PhoneComparator phoneComparator = new PhoneComparator();
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("453_34_33", "Philips", 255));
        phoneList.add(new Phone("987_65_43", "Sony", 340));
        phoneList.add(new Phone("123_23_56", "Samsung", 560));
        Collections.sort(phoneList, phoneComparator);
        for (Phone p: phoneList) {
            System.out.println(p);
        }
    }

    private static void comparable() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("453_34_33", "Philips", 255));
        phoneList.add(new Phone("987_65_43", "Sony", 340));
        phoneList.add(new Phone("123_23_56", "Samsung", 560));
        Collections.sort(phoneList);
        for (Phone p: phoneList) {
            System.out.println(p);
        }
    }

    private static void linkedList() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Petya");
        linkedList.add("Luba");
        linkedList.add("Ivan");
        linkedList.add("Pavel");
        linkedList.add("Nic");
        linkedList.add("Olga");
        linkedList.add("Alesha");
        linkedList.add("Vova");
        linkedList.add("Ira");
        linkedList.add("Tanya");
        System.out.println(linkedList);
        linkedList.remove(3);
        linkedList.remove("Luba");
        System.out.println(linkedList);
        System.out.println(linkedList.get(7));
        linkedList.sort((s, t1) -> s.compareTo(t1));
        System.out.println(linkedList);
        System.out.println(linkedList.get(Collections.binarySearch(linkedList, "Vova")));
        for (String name: linkedList) {
            System.out.println(name);
        }
    }

    private static void arraList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Petya");
        arrayList.add("Luba");
        arrayList.add("Ivan");
        arrayList.add("Pavel");
        arrayList.add("Nic");
        arrayList.add("Olga");
        arrayList.add("Alesha");
        arrayList.add("Vova");
        arrayList.add("Ira");
        arrayList.add("Tanya");
        System.out.println(arrayList);
        arrayList.remove(2);
        arrayList.remove("Nic");
        System.out.println(arrayList);
        System.out.println(arrayList.get(7));
        arrayList.sort((s, t1) -> s.compareTo(t1));
        System.out.println(arrayList);
        System.out.println(arrayList.get(Collections.binarySearch(arrayList, "Vova")));
        for (String name: arrayList) {
            System.out.println(name);
        }
    }
}
