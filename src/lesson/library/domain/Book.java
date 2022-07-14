package lesson.library.domain;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private Genre genre;
    private Date date;

    public Book(int id, String title, Genre genre, Date date) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", date=" + date +
                '}';
    }
}
