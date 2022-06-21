package lesson3.object.equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setNumber(123);
        Book book = new Book();
        book.setAuthor("Karnegy");
        book.setName("How to get friends");
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.setNumber(123);

        Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.getAuthor());

//        System.out.println(book.hashCode());
//        System.out.println();

    }


}
