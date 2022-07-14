package lesson.library.service.impl;

import lesson.library.domain.Book;
import lesson.library.repository.Repository;
import lesson.library.service.BookService;

public class BookServiceImpl implements BookService {
    private static Repository repository = Repository.getInstance();

    @Override
    public void addBookInTable(Book book) {
        repository.saveBooks(book);
    }
}
