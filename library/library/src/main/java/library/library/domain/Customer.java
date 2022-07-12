package library.library.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
    @Id
    private long customerNumber;
    private String name;
    private String email;
    private double balance;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Borrow borrow;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Payment payment;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Reservation reservation;

}
