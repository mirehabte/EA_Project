package libraryRestClient.library.domain;



import libraryRestClient.library.client.Book;
import libraryRestClient.library.client.BookCopies;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;



public class Borrow {

    private long borrowNumber;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    private Customer customer;


    private List<Reservation> reservations;
    //private List<BookCopies> bookCopies = new ArrayList<>();

//    @Autowired
//    ApplicationProperties applicationProperties;

    public Borrow(){}

    public Borrow(long borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    public long getBorrowNumber() {
        return borrowNumber;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


    @Override
    public String toString() {
        return "Borrow{" +
                "borrowNumber=" + borrowNumber +
                ", checkoutDate=" + checkoutDate +
                ", returnDate=" + returnDate +
                ", customer=" + customer +
                ", reservations=" + reservations +
                '}';
    }
}
