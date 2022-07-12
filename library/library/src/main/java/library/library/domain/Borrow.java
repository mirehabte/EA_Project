package library.library.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Borrow {
    @Id
    private long borrowNumber;
    private LocalDate checkoutDate;
    private LocalDate returnDate;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer")
    private List<Customer> customers;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation")
    private List<Reservation> reservations;
    //private List<BookDTO> bookDTOList;
}
