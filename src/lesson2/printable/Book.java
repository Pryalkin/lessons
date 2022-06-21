package lesson2.printable;

public class Book implements Printable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + name);
    }

    public static void printBooks(Printable[] printables){
        for (Printable printable: printables) {
            if (printable instanceof Book){
                System.out.println(((Book) printable).name);
            }
        }
    }
}
