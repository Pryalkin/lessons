package lesson3.generics;

public class Run {
    public static void main(String[] args) {
        Test<String, Integer, Double> test = new Test<>("Hello", 12, 34.33);
        test.method();
    }
}
