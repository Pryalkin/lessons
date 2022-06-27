package lesson3.string.strBuilder;

public class Run {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Object-oriented programming is a programming language model" +
                                                     "organized around objects rather than 'actions' and data rather than logic. "  +
                                                     "Object-oriented programming blabla. Object-oriented programming bla. " +
                                                     "Object-oriented programming is a programming language model" +
                                                     "organized around objects rather than 'actions' and data rather than logic. "  +
                                                     "Object-oriented programming blabla. Object-oriented programming bla.");
        String str = "Object-oriented programming";
        String str2 = "OOP";
        int i = 0;
        int y = 0;
        while (sb.indexOf(str, i) != -1){
            i = sb.indexOf(str, i);
            y++;
            if (y % 2 == 0) {
                sb.replace(i, i + str.length(), str2);
                i += str2.length();
            } else  i += str.length();

        }
        System.out.println(sb);
    }
}
