package lesson1.reader;

import java.util.Date;

public class Reader {

    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private Date dateOfBirth;
    private int numberPhone;

    public Reader(String fullName, int libraryCardNumber, String faculty, Date dateOfBirth, int numberPhone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberPhone = numberPhone;
    }

    public void takeBook(int numberOfBooks){
        String line = "";
        if (numberOfBooks % 10 == 1 && numberOfBooks != 11){
            line = " книгу";
        } else if (checkForRemainder2or3or4(numberOfBooks)){
            line = " книги";
        } else {
            line = " книг";
        }
        System.out.println(fullName + " взял " + numberOfBooks + line);
    }

    public void takeBook(String... nameBooks){
        for (String nameBook: nameBooks) {
            System.out.println(fullName + " взял книгу: " + nameBook);
        }
    }

    public void takeBook(Book... books){
        for (Book book: books) {
            System.out.println(fullName + " взял книгу: " + book.getNameBook() + ". Автор " + book.getAuthor());
        }
    }

    public void returnBook(int numberOfBooks){
        String line = "";
        if (numberOfBooks % 10 == 1 && numberOfBooks != 11){
            line = " книгу";
        } else if (checkForRemainder2or3or4(numberOfBooks)){
            line = " книги";
        } else {
            line = " книг";
        }
        System.out.println(fullName + " вернул " + numberOfBooks + line);
    }

    public void returnBook(String... nameBooks){
        for (String nameBook: nameBooks) {
            System.out.println(fullName + " вернул книгу: " + nameBook);
        }
    }

    public void returnBook(Book... books){
        for (Book book: books) {
            System.out.println(fullName + " вернул книгу: " + book.getNameBook() + ". Автор " + book.getAuthor());
        }
    }

    private boolean checkForRemainder2or3or4(int numberOfBooks) {
        if (numberOfBooks % 10 == 2 && numberOfBooks != 12) return true;
        if (numberOfBooks % 10 == 3 && numberOfBooks != 13) return true;
        if (numberOfBooks % 10 == 4 && numberOfBooks != 14) return true;
        return false;
    }

}
