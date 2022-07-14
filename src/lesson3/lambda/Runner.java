package lesson3.lambda;

import lesson1.phone.Phone;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        printableForMethod();
        System.out.println("---------------------");
        predicateForMethod();
        System.out.println("---------------------");
        consumerForMethod();
        System.out.println("---------------------");
        funtionForMethod();
        System.out.println("---------------------");
        supplierForMethod();
    }

    private static void supplierForMethod() {
        Supplier<Integer> supplier = () -> (int)(Math.random()*10);
        System.out.println(supplier.get());
    }

    private static void funtionForMethod() {
        Function<Integer, String> function = i -> i > 0 ? "Положительное число" : i < 0 ? "Отрицательное число" : "Ноль";
        System.out.println(function.apply(6));
        System.out.println(function.apply(-3));
        System.out.println(function.apply(0));
    }

    private static void consumerForMethod() {
        Consumer<Phone> consumer1 = phone -> System.out.println("Продали телефон " + phone);
        Consumer<Phone> consumer2 = phone -> System.out.println("Отправляем телефон " + phone);
        consumer1.andThen(consumer2).accept(new Phone("1234567", "Iphone", 123));
    }

    private static void predicateForMethod() {
        Predicate<String> predicate = str -> str != null;
        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test(null));
        System.out.println("++++++++++++++++++++");
        Predicate<String> pred = str -> str.isEmpty();
        System.out.println(pred.test(""));
        System.out.println(pred.test("Hello"));
        System.out.println("+++++++++++++++++++++");
        System.out.println(predicate.and(pred).test("ABCD"));
        System.out.println(predicate.and(pred).test(""));
        System.out.println(predicate.and(pred).test(null));
        System.out.println("+++++++++++++++++++++");
        Predicate<String> pr1 = str -> str.startsWith("J");
        Predicate<String> pr2 = str -> str.startsWith("N");
        Predicate<String> pr3 = str -> str.endsWith("A");
        Predicate generalPredicate = pr1.or(pr2).and(pr3);
        System.out.println(generalPredicate.test("JONSON"));
        System.out.println(generalPredicate.test("NICK"));
        System.out.println(generalPredicate.test("OBAMA"));
        System.out.println(generalPredicate.test("NANA"));
    }

    private static void printableForMethod(){
        Printable printable = () -> System.out.println("I am print");
        printable.print();
    }
}
