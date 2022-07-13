package library.library.domain;

import library.library.client.Book;
import library.library.client.BookCopies;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private long id;
    private LocalDate reservationDate;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();

    public Reservation(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public long getId() {
        return id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + id +
                ", reservationDate=" + reservationDate +
                ", books=" + books +
                '}';
    }
}
