package lesson.library.domain;

import lesson.library.enumeration.Role;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int counter = 0;
    private int id;
    private String name;
    private String password;
    private Role role;
    private List<Book> books;

    public User(String name, String password) {
        counter++;
        id = counter;
        this.name = name;
        this.password = password;
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
