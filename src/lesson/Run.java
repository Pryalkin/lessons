package lesson;

import java.util.Scanner;

public class Run {

    private static boolean authentication;

    public static void main(String[] args) {
        initialization();
        logic();
    }

    private static void logic() {
        Scanner login = new Scanner(System.in);
        System.out.println("Введите login: ");
        String lgn = login.next();
        Scanner password = new Scanner(System.in);
        System.out.println("Введите password: ");
        String pass = password.next();
        for (User user : Users.getUsers()) {
            if (user.getLogin().equals(lgn)){
                if (user.getPassword().equals(pass)){
                    authentication = true;
                    break;
                } else authentication = false;
            } else authentication = false;
        }
        if (authentication){
            System.out.println("Пользователь авторизовался!");
        }

    }

    private static void initialization() {
        Product diablo = new Product("Diablo", 46, 9.1);
        Product lineage = new Product("Lineage", 65, 9.3);
        Category games = new Category("Games");
        games.addProduct(diablo);
        games.addProduct(lineage);
        Product matrix = new Product("Матрица", 34, 8.1);
        Product warOfTheWorlds = new Product("Война миров", 24, 7.3);
        Category films = new Category("Films");
        films.addProduct(matrix);
        films.addProduct(warOfTheWorlds);
        Users users = new Users();
        User pavel = new User("pavel", "pavel");
        users.addUser(pavel);
    }
}
