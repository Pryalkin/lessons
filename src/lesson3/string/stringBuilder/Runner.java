package lesson3.string.stringBuilder;

public class Runner {
    public static void main(String[] args) {
        int i = 3;
        int y = 56;
        System.out.println(example1(i, y));
        System.out.println(example2(i, y));
        System.out.println(example3(i, y));
        System.out.println("--------------------------");
        System.out.println(example4(example1(i, y)));
        System.out.println(example4(example2(i, y)));
        System.out.println(example4(example3(i, y)));
        System.out.println("--------------------------");
        System.out.println(example5(example1(i, y)));
        System.out.println(example5(example2(i, y)));
        System.out.println(example5(example3(i, y)));
    }

    private static StringBuilder example5(StringBuilder sb) {
        int i = sb.indexOf("=");
        sb.replace(i, i + "=".length(), "равно");
        return sb;
    }

    private static StringBuilder example4(StringBuilder sb) {
        int i = sb.indexOf("=");
        sb.deleteCharAt(i);
        sb.insert(i, "равно");
        return sb;
    }

    private static StringBuilder example3(int i, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" * ").append(56).append(" = ").append(i*y);
        return sb;
    }

    private static StringBuilder example2(int i, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" - ").append(56).append(" = ").append(i-y);
        return sb;
    }

    private static StringBuilder example1(int i, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" + ").append(56).append(" = ").append(i+y);
        return sb;
    }


}
