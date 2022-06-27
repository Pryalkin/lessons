package lesson3.string;

public class Runner {
    public static void main(String[] args) {
        String name = "Ivan";
        String grade = "7";
        String subject = "Математике";
        method(name, grade, subject);
    }

    private static void method(String name, String grade, String subject) {
        StringBuilder sb = new StringBuilder("Студент получил по.");
        char[] arrayName = new char[15];
        String n = newMethod(15, name);
        String g = newMethod(3, grade);
        String s = newMethod(10, subject);
        sb.insert(7, n);
        sb.insert(15 + n.length(), g);
        sb.insert(18 + n.length() + g.length(), s);
        System.out.println(sb);
    }

    private static String newMethod(int i, String str) {
        char[] arrayWithCharactersUpdated;
        if (i <= str.length()) arrayWithCharactersUpdated = new char[str.length()+1];
        else arrayWithCharactersUpdated = new char[i];
        char[] arrayWithCharacters = str.toCharArray();
        int h = 0;
        for (int j = 0; j < arrayWithCharactersUpdated.length; j++) {
            if (j >= (arrayWithCharactersUpdated.length - str.length())){
                arrayWithCharactersUpdated[j] = arrayWithCharacters[h];
                h++;
            } else arrayWithCharactersUpdated[j] = ' ';
        }
        return String.valueOf(arrayWithCharactersUpdated);
    }
}
