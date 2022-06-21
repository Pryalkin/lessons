package lesson3.object.equalsAndHashCode.equals;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Book x = new Book();
        Book y = new Book();
        Book z = new Book();

        //reflexive
        System.out.println("reflexive");
        System.out.println(x.equals(x));
        System.out.println("");

        //symmetric
        System.out.println("symmetric");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println("");

        //transitive
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println("");

        //consistent
        System.out.println("consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println("");

        //not null
        System.out.println("not null");
        System.out.println(x.equals(null)); // always false

    }
}

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public Book(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title);
    }
}
