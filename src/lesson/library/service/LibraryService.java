package lesson.library.service;

import lesson.library.domain.Book;
import lesson.library.domain.Library;

import java.util.Collection;

public interface LibraryService {
    void addLibrary(Library library);
    boolean addBook(Book book, String nameLibrary);
    boolean removeBook(int id, String nameLibrary);
    Library getLibrary(String name);
}
