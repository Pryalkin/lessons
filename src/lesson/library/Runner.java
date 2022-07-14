package lesson.library;

import lesson.library.domain.Book;
import lesson.library.domain.Genre;
import lesson.library.domain.Library;
import lesson.library.domain.User;
import lesson.library.enumeration.Role;
import lesson.library.exception.FoundUserException;
import lesson.library.service.BookService;
import lesson.library.service.LibraryService;
import lesson.library.service.UserService;
import lesson.library.service.impl.BookServiceImpl;
import lesson.library.service.impl.LibraryServiceImpl;
import lesson.library.service.impl.UserServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static boolean exit;
    private static boolean authorizationMenu;
    private User user;
    private static LibraryService libraryService = new LibraryServiceImpl();
    private static BookService bookService = new BookServiceImpl();
    private static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        Runner run = new Runner();
        run.start();
    }

    private void start() {
        exit = true;
        authorizationMenu = false;
        while (exit){
            while (authorizationMenu){
                if (user.getRole().equals(Role.ROLE_ADMIN)){
                    menuAlgorithmForAdministrator();
                    } else if(user.getRole().equals(Role.ROLE_USER)) {

                }
            }
            bringUpTheMainMenu();
            Scanner sc  = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i){
                case 1:
                    authorizationMenu = authorization();
                    break;
                case 2:
                    try {
                        registration();
                    } catch (FoundUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                default:

            }

        }
    }

    private void menuAlgorithmForAdministrator() {
        showMenuForAdmin();
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                registrationLibrary();
                break;
            case 2:
                displayMenu1();
                produceMenuAlgorithm1();
                break;
            case 3:
                createBook();
                break;
            case 4:
                deleteBook();
                break;
            case 5:
//                   editBook();
                break;
            case 6:
                break;
            case 7:
                exit = false;
                break;
            default:
                System.out.println("hello");
//                    displayInformationAboutInvalidInput();
            }
        }

    private void registrationLibrary() {
        System.out.println("Введите название библиотеки: ");
        Scanner scName  = new Scanner(System.in);
        String name = scName.next();
        libraryService.addLibrary(new Library(name));
    }

    private void showMenuForAdmin() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Выберите один из пунктов 1, 2, 3, 4, 5 или 6.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1 - Регистрация библиотеки.");
        System.out.println("2 - Вывод всех книг.");
        System.out.println("3 - Добавление книги.");
        System.out.println("4 - Удаление книги.");
        System.out.println("5 - Редактирование книги.");
        System.out.println("6 - Показать пользователей.");
        System.out.println("7 - Выход.");
        System.out.println("++++++++++++++++++++++++++++");
    }


    private void bringUpTheMainMenu() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Выберите один из пунктов 1, 2 или 3.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1 - Авторизация.");
        System.out.println("2 - Регистрация.");
        System.out.println("3 - Выход.");
        System.out.println("++++++++++++++++++++++++++++");
    }

    private boolean authorization(){
        System.out.println("Введите name: ");
        Scanner scName  = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Введите password: ");
        Scanner scPassword  = new Scanner(System.in);
        String password = scPassword.next();
        User user = userService.authorization(name, password);
        if (user != null){
            System.out.println("Вы вошли в систему!");
            this.user = user;
            return true;
        } else {
            System.out.println("Не верный логин или пароль");
            return false;
        }
    }

    private void registration() throws FoundUserException {
        System.out.println("Введите name: ");
        Scanner scName  = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Введите password: ");
        Scanner scPassword  = new Scanner(System.in);
        String password = scPassword.next();
        userService.addUser(name, password);
        System.out.println("Пользователь успешно рарегистрирован!");
    }

//    private void editBook() {
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Введите id книги для редактирования: ");
//        int id = sc1.nextInt();
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Введите новое название книги: ");
//        String title = sc2.next();
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Введите новый жанр книги: ");
//        String genre = sc3.next();
//        Scanner sc4 = new Scanner(System.in);
//        System.out.println("Введите новую дату книги ('dd.MM.yyyy'): ");
//        String date = sc4.next();
//        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//        Date d = null;
//        try {
//            d = format.parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Genre g = new Genre(genre);
//        Book book = new Book(id, title, g, d);
//        String str = library.removeBook(id) ? "Книга успешна изменена!" : "Такой книги нет в библиотеке.";
//        System.out.println(str);
//    }

    private void deleteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id книги: ");
        int id = sc.nextInt();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите название библиотеки: ");
        String nameLibrary = sc5.next();
        String str = libraryService.removeBook(id, nameLibrary) ? "Книга успешна удалена!" : "Такой книги нет в библиотеке.";
        System.out.println(str);
    }

    private void createBook() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите id книги: ");
        int id = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = sc2.next();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите жанр книги: ");
        String genre = sc3.next();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите дату книги ('dd.MM.yyyy'): ");
        String date = sc4.next();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Genre g = new Genre(genre);
        Book book = new Book(id, title, g, d);
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите название библиотеки: ");
        String nameLibrary = sc5.next();
        if (libraryService.addBook(book, nameLibrary)) {
            System.out.println("Книга успехна добавлена!");
        }
    }

    private void produceMenuAlgorithm1() {
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i){
            case 1:
                break;
            case 2:
                Scanner scNameLibrary  = new Scanner(System.in);
                System.out.println("Введите название библиотеки: ");
                String nameLibrary = scNameLibrary.next();
                List<Book> books = libraryService.getLibrary(nameLibrary).getBooks();
                books.sort((Book bk1, Book bk2) -> bk1.getTitle().compareTo(bk2.getTitle()));
                for (Book b: books) {
                    System.out.println(b);
                }
                break;
            case 3:
            case 4:
            default:
        }
    }

    private void displayMenu1() {
        System.out.println("(-_-) (0_-) (-_0) (0_0) (-_-) (0_-) (-_0) (0_0)");
        System.out.println("В какой сортировке вывести книги?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1 - Вывести по алфавиту жанр.");
        System.out.println("2 - Вывести по алфавиту название.");
        System.out.println("3 - Вывести по дате (сначала новые).");
        System.out.println("4 - Вывести по дате (сначала старые).");
        System.out.println("++++++++++++++++++++++++++++");
    }
//
//    private void releaseInformationForGoodbye() {
//        try {
//            System.out.println("Вы вышли из системы.");
//            Thread.sleep(2000);
//            System.out.println("До новых встреч!");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void displayInformationAboutInvalidInput() {
//        try {
//            System.out.println("Вы ввели неверную цифру!");
//            Thread.sleep(2000);
//            System.out.println("Нужно выбрать 1, 2, 3, 4 или 5!");
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void bringUpTheMainMenu() {
//        System.out.println("--------------------------------------------------------");
//        System.out.println("Выберите один из пунктов 1, 2, 3, 4 или 5.");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("++++++++++++++++++++++++++++");
//        System.out.println("1 - Вывод всех книг.");
//        System.out.println("2 - Добавление книги.");
//        System.out.println("3 - Удаление книги.");
//        System.out.println("4 - Редактирование книги.");
//        System.out.println("5 - Выход.");
//        System.out.println("++++++++++++++++++++++++++++");
//    }
}
