package lesson1.reader;

import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
    public static void main(String[] args) {
        Reader pavel = new Reader("Pavel Pryalkin", 123, "POIT", new GregorianCalendar(2017, 1 , 25).getTime(), 123_23_34);
        pavel.takeBook(25);
        pavel.takeBook("Апокалипсис", "Властелин колец");
        Book book1 = new Book("Матрица", "Ларри и Энди Вачовски");
        Book book2 = new Book("Война миров", "Стивен Спилберг");
        pavel.takeBook(book1, book2);
    }
}
