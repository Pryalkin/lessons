package lessons1;

// Создать консольную игру "Крестики нолики"
// Использовать минимум:
// 1) один условный оператор if
// 2) один оператор switch
// 3) один оператор цикла while
// 4) один оператор цикла do while
// 5) один оператор цикла for
// 6) одну тернарную операцию
// 7) один оператор break
// 8) один оператор continue
// 9) один оператор return
// 10) создать алгоритм

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        boolean flagSymbol;
        do
            flagSymbol = choiceSymbol(true);
        while(!flagSymbol);
    }

    public static boolean choiceSymbol(boolean flagSymbol){
        System.out.println("Выберите символ для игры.");
        System.out.println("1 - X; 2 - O.");
        Scanner in = new Scanner(System.in);
        int symbol = in.nextInt();
        switch (symbol){
            case 1:
                System.out.println("Вы выбрали X");
                break;
            case 2:
                System.out.println("Вы выбрали O");
                break;
            default:
                System.out.println("Error!");
                flagSymbol = false;
        }
        return flagSymbol;
    }
}
