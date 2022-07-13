package library.library.domain;

import library.library.client.Book;
import library.library.client.BookCopies;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Customer {
    @Id
    private long customerNumber;
    private String name;
    private String email;
    private double outstandingFee;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Borrow borrow;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Payment payment;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Reservation reservation;

    public Customer(long customerNumber, String name, String email) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.email = email;
        this.outstandingFee = 0.0;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getOutstandingFee() {
        return outstandingFee;
    }

    public void setOutstandingFee(double outstandingFee) {
        this.outstandingFee = outstandingFee;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void checkout(List<Book> books){
        borrow.checkout(books);
    }
    public void returnBook(List<BookCopies> bookCopies, LocalDate returnDate){
        borrow.returnBook(bookCopies, returnDate);
    }

    public double payPenality(double amount){
        if(outstandingFee > 0){
            outstandingFee = outstandingFee - amount;
            payment=new Payment(amount);
        } else {
            System.out.println("You don't have any outstanding fee");
        }
        return outstandingFee;
    }
    public void reserveBook(List<Book> books){
        if(books.size()>0){
            reservation=new Reservation(LocalDate.now());
            for(Book book : books) reservation.setBooks(book);
        } else {
            System.out.println("Please check your input ..");
        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", outstandingFee=" + outstandingFee +
                ", borrow=" + borrow +
                ", payment=" + payment +
                ", reservation=" + reservation +
                '}';
    }
}
