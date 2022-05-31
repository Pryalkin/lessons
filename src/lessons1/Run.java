package lessons1;

// Создать консольную игру "Крестики нолики"
// Пользователь играет с компьютером
// Использовать минимум:
// 1) один условный оператор if
// 2) один оператор switch
// 3) один оператор цикла while
// 4) один оператор цикла do while
// 5) один оператор цикла for
// 6) один оператор цикла foreach
// 6) одну тернарную операцию
// 7) один оператор break
// 8) один оператор continue
// 9) один оператор return
// 10) создать алгоритм

import java.util.Scanner;

public class Run {

    static int ticTacToe[][] = new int[3][3];
    static boolean flagToEndTheGame = true;
    static int user;
    static int computer;

    public static void main(String[] args) {
        gameInitialization();
        int count = 1;
        while (flagToEndTheGame){
            if (count < 9) {
                System.out.println("Ход номер " + count);
                arrayOutputTicTacToe();
                checkUserProgress(user);
                arrayOutputTicTacToe();
                checkComputerProgress(computer);
            }
            count++;
        }
        System.out.println("Игра завершена!");
    }

    private static void checkComputerProgress(int symbolForTheUser) {
        boolean userMove;
        do {
            userMove = makeTheComputerMove(false, symbolForTheUser);
        } while (userMove);
    }

    private static boolean makeTheComputerMove(boolean userMove, int symbolForTheUser) {
        System.out.println("Компьютер выбирает зону.");
        int random_number = 1 + (int) (Math.random() * 9);
        return cellSelection(userMove, random_number, symbolForTheUser);
    }

    private static void checkUserProgress(int user) {
        boolean userMove;
        do {
            userMove = makeTheUserMove(false, user);
        } while (userMove);
    }

    private static boolean makeTheUserMove(boolean userMove, int user) {
        System.out.println("Выберите зону.");
        System.out.println("0 - завершить игру.");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        return cellSelection(userMove, i, user);
    }

    private static boolean cellSelection(boolean userMove, int i, int symbol) {
        switch (i){
            case 1:
                userMove = actionToInfectACell(1, userMove, symbol);
                break;
            case 2:
                userMove = actionToInfectACell(2, userMove, symbol);
                break;
            case 3:
                userMove = actionToInfectACell(3, userMove, symbol);
                break;
            case 4:
                userMove = actionToInfectACell(4, userMove, symbol);
                break;
            case 5:
                userMove = actionToInfectACell(5, userMove, symbol);
                break;
            case 6:
                userMove = actionToInfectACell(6, userMove, symbol);
                break;
            case 7:
                userMove = actionToInfectACell(7, userMove, symbol);
                break;
            case 8:
                userMove = actionToInfectACell(8, userMove, symbol);
                break;
            case 9:
                userMove = actionToInfectACell(9, userMove, symbol);
                break;
            case 0:
                flagToEndTheGame = false;
                break;
            default:
                System.out.println("Error");
                userMove = true;
        }
        return userMove;
    }

    private static boolean actionToInfectACell(int i, boolean userMove, int symbol) {
        if (checkCellContent(i)){
            changeArrayTicTacToe(i, symbol);
        } else {
            userMove = true;
            System.out.println("Эта ячейка занята! Выберите другую!");
        }
        return userMove;
    }

    private static boolean checkCellContent(int i) {
        boolean cellCheck = false;
        switch (i){
            case 1:
                cellCheck = ticTacToe[0][0] == i ? true : false;
                break;
            case 2:
                cellCheck = ticTacToe[0][1] == i ? true : false;
                break;
            case 3:
                cellCheck = ticTacToe[0][2] == i ? true : false;
                break;
            case 4:
                cellCheck = ticTacToe[1][0] == i ? true : false;
                break;
            case 5:
                cellCheck = ticTacToe[1][1] == i ? true : false;
                break;
            case 6:
                cellCheck = ticTacToe[1][2] == i ? true : false;
                break;
            case 7:
                cellCheck = ticTacToe[2][0] == i ? true : false;
                break;
            case 8:
                cellCheck = ticTacToe[2][1] == i ? true : false;
                break;
            case 9:
                cellCheck = ticTacToe[2][2] == i ? true : false;
                break;
            default:
                System.out.println("Error");
        }
        return cellCheck;
    }

    private static void changeArrayTicTacToe(int x, int symbol) {
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                if (ticTacToe[i][j] == x){
                    ticTacToe[i][j] = symbol;
                }
            }
        }
    }

    private static void gameInitialization() {
        fillArrayTicTacToe();
        checkSymbolChoice();
    }

    private static void checkSymbolChoice() {
        boolean flagSymbol;
        do
            flagSymbol = symbolChoice(true);
        while(!flagSymbol);
    }

    private static void arrayOutputTicTacToe() {
        for (int line[] : ticTacToe) {
            for (int meaning : line) {
                System.out.print("| " + meaning + " |");
            }
            System.out.println();
        }
    }

    private static void fillArrayTicTacToe() {
        int y= 1;
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = y;
                y++;
            }
        }
    }

    private static boolean symbolChoice(boolean flagSymbol){
        System.out.println("Выберите символ для игры.");
        System.out.println("1 - X; 2 - O.");
        Scanner in = new Scanner(System.in);
        int symbol = in.nextInt();
        switch (symbol){
            case 1:
                System.out.println("Игрок ставит 11, а компьютер 00.");
                user = 11;
                computer = 00;
                break;
            case 2:
                System.out.println("Игрок ставит 00, а компьютер 11.");
                user = 00;
                computer = 11;
                break;
            default:
                System.out.println("Error!");
                flagSymbol = false;
        }
        return flagSymbol;
    }
}
