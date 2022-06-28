package lesson3.string.strB;

public class Runner {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello word");
        method(sb1);
        StringBuilder sb2 = new StringBuilder("I love Java");
        method(sb2);
        StringBuilder sb3 = new StringBuilder("Java!!!");
        method(sb3);
    }

    private static void method(StringBuilder sb) {
        int i = sb.length()/2;
        System.out.println(sb.substring(i-1, i+1));
    }
}
