package lesson.library.service.impl;

import lesson.library.domain.Book;
import lesson.library.domain.Library;
import lesson.library.exception.FoundBookIdException;
import lesson.library.repository.Repository;
import lesson.library.service.LibraryService;

import java.util.Collection;

public class LibraryServiceImpl implements LibraryService {

    private Repository repository = Repository.getInstance();

    @Override
    public void addLibrary(Library library) {
        repository.saveLibraries(library);
    }

    @Override
    public boolean addBook(Book book, String nameLibrary){
        Collection<Library> col = repository.getLibraries().values();
        for (Library l : col) {
            if (l.getName().equals(nameLibrary)){
                for (Book b: l.getBooks()) {
                    if (b.getId() == book.getId()){
                        try {
                            throw new FoundBookIdException("Книга под таким id уже есть!");
                        } catch (FoundBookIdException e) {
                            System.out.println(e.getMessage());
                        }
                        return false;
                    }
                }
                l.getBooks().add(book);
            }
        }
        return true;
    }

    @Override
    public boolean removeBook(int id, String nameLibrary) {
        Collection<Library> col = repository.getLibraries().values();
        for (Library l : col) {
            if (l.getName().equals(nameLibrary)){
                for (Book b: l.getBooks()) {
                    if (b.getId() == id){
                        l.getBooks().remove(id);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Library getLibrary(String name) {
        Collection<Library> col = repository.getLibraries().values();
        for (Library l: col) {
            if (l.getName().equals(name)){
                return l;
            }
        }
        return null;
    }
}
