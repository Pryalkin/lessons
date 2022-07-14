package lesson.library.domain;

import lesson.library.exception.FoundBookIdException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static int counter = 0;
    private int id;
    private String name;
    private List<Book> books;

    public Library(String name) {
        counter++;
        id = counter;
        this.name = name;
        this.books = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks(){
        return books;
    }


    public boolean editBook(Book book){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()){
                books.remove(i);
                books.add(book);
                return true;
            }
        }
        return false;
    }

}
