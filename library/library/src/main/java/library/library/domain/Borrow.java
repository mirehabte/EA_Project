package library.library.domain;

import library.library.client.Book;
import library.library.client.BookCopies;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;


@Entity
public class Borrow {
    @Id
    private long borrowNumber;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    @Value("${penalityFee}")
    private double penalityFee;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Customer customer;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation")
    private List<Reservation> reservations;
    //private List<BookCopies> bookCopies = new ArrayList<>();

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

    public void checkout(List<Book> books){
        List<BookCopies> bookCopies = new ArrayList<>();
        if(books.size()>0 && books.size()<=4) {
            if (books.stream().flatMap(b -> b.getBookCopies().stream()).filter(b -> !(b.isBorrowed())).count() > 0) {
                for (Book book : books) {
                    for (BookCopies bookCopy : book.getBookCopies()) {
                        if (!(bookCopy.isBorrowed())) {
                            bookCopy.setBorrowed(true);
                            bookCopies.add(bookCopy);
                        } else {
                            System.out.println("This book is not available right now," +
                                    " please please reserve it to get it in the future ..");
                        }
                    }
                }
                this.checkoutDate = LocalDate.now();
                this.returnDate = checkoutDate.plusDays(21);
            } else {
                System.out.println("Sorry We can't those books are not available," +
                        " please please reserve it to get it in the future ..");
            }
        } else {
            System.out.println("You don't have access to checkout. Max checkout is 4");
        }
    }


    public void returnBook(List<BookCopies> bookCopies, LocalDate returnDate){
        this.returnDate = returnDate;
        long usedDays = DAYS.between(returnDate, checkoutDate);
        if(usedDays > 21) {
            double balance = (penality(returnDate) + customer.getOutstandingFee());
            customer.setOutstandingFee(balance);
        }
        for(BookCopies bookCopy: bookCopies){
            bookCopy.setBorrowed(false);
            bookCopies.remove(bookCopy);
            //check if there is a reservation for the book
        }
        //notify to reserved emails ....
    }

    public double penality(LocalDate returnDate){
        long usedDays = DAYS.between(returnDate, checkoutDate);
        long differenceDays = usedDays - 21;
        double totalPenality =  differenceDays*penalityFee;
        return totalPenality;
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
