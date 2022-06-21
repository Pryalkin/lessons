package lesson3.object.equalsAndHashCode;

import java.util.Objects;

public class Ticket {
    private int number;
    private String libraryName;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number && Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}
