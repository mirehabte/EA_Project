package libraryRestClient.library.domain;



import libraryRestClient.library.client.Book;
import libraryRestClient.library.client.BookCopies;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;


public class Customer {

    private long customerNumber;
    private String name;
    private String email;
    private double outstandingFee;

    private Borrow borrow;

    private Payment payment;

    private Reservation reservation;

    public Customer(){}

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
