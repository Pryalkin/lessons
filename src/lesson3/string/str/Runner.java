package lesson3.string.str;

public class Runner {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        example1(str);
        example2(str);
        example3(str);
        example4(str);
        example5(str);
        example6(str);
        example7(str);
        example8(str);
        example9(str);
        example10(str);
        example11(str);
    }

    private static void example11(String str) {
        String str1 = str.substring(0, str.indexOf("Java"));
        String str2 = str.substring(str.indexOf("Java")+"Java".length());
        System.out.println(str1 + str2);
    }

    private static void example10(String str) {
        System.out.println(str.toUpperCase());
    }

    private static void example9(String str) {
        System.out.println(str.toLowerCase());
    }

    private static void example8(String str) {
        System.out.println(str.replace("a", "o"));
    }

    private static void example7(String str) {
        System.out.println(str.indexOf("Java"));
    }

    private static void example6(String str) {
        System.out.println(str.contains("Java"));
    }

    private static void example5(String str) {
        String str2 = "I love java";
        System.out.println(str.compareTo(str2));
    }

    private static void example4(String str) {
        System.out.println(str.startsWith("I like"));
    }

    private static void example3(String str) {
        System.out.println(str.endsWith("!!!"));
    }

    public static void example2(String str){
        System.out.println(str.charAt(str.length()-1));
    }

    private static void example1(String str) {
        System.out.println(str);
    }

}
