package lesson.library.repository;

import lesson.library.domain.Book;
import lesson.library.domain.Genre;
import lesson.library.domain.Library;
import lesson.library.domain.User;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static Repository repository;

    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, Library> libraries = new HashMap<>();
    private Map<Integer, Genre> genres = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();

    private Repository() {
    }

    public static Repository getInstance(){
        if (repository == null){
            return new Repository();
        }
        return repository;
    }

    public void saveBooks(Book book) {
        this.books.put(book.getId(), book);
    }

    public void saveLibraries(Library library) {
        this.libraries.put(library.getId(), library);
    }

    public void saveGenres(Genre genre) {
        this.genres.put(genre.getId(), genre);
    }

    public void saveUsers(User user) {
        this.users.put(user.getId(), user);
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public Map<Integer, Library> getLibraries() {
        return libraries;
    }

    public Map<Integer, Genre> getGenres() {
        return genres;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }
}
