package library.library.DTO;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BorrowDTO {
    private long borrowNumber;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    private double penalityFee;
    private CustomerDTO customer;
    private List<ReservationDTO> reservations = new ArrayList<>();

    private List<BookCopiesDTO> bookCopies = new ArrayList<>();

    public BorrowDTO(long borrowNumber) {
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

    public double getPenalityFee() {
        return penalityFee;
    }

    public void setPenalityFee(double penalityFee) {
        this.penalityFee = penalityFee;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<ReservationDTO> getReservations() {
        return reservations;
    }

    public void setReservations(ReservationDTO reservation) {
        reservations.add(reservation);
    }

    public List<BookCopiesDTO> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(BookCopiesDTO bookCopy) {
        bookCopies.add(bookCopy);
    }

    @Override
    public String toString() {
        return "BorrowDTO{" +
                "borrowNumber=" + borrowNumber +
                ", checkoutDate=" + checkoutDate +
                ", returnDate=" + returnDate +
                ", penalityFee=" + penalityFee +
                ", customer=" + customer +
                ", reservations=" + reservations +
                ", bookCopies=" + bookCopies +
                '}';
    }
}
