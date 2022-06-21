package lesson3.list;

public class Run {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(3);
        list.add(8);
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.add("asd");
        list2.add("wer");
        list2.add("dfg");
        list2.add("rew");
        System.out.println(list2);
        List<Double> list3 = new ArrayList<>();
        list3.add(12.45);
        list3.add(9.32);
        list3.add(3.13);
        list3.add(8.98);
        System.out.println(list3);
        list.remove(0);
        list2.remove(4);
        list3.remove(1);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list);
    }
}
