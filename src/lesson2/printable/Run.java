package lesson2.printable;

public class Run {
    public static void main(String[] args) {
        Printable book1 = new Book("Война и мир");
        Printable book2 = new Book("Детские сказки");
        Printable magazine1 = new Magazine("Psychologies");
        Printable magazine2 = new Magazine("Профиль");
        Printable[] printables = new Printable[]{book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
    }
}
