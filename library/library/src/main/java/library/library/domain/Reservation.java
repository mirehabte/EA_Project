package library.library.domain;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private long id;
    private LocalDate reservationDate;

   // private List<Book> books = new ArrayList<>();

    public Reservation(){
        reservationDate = LocalDate.now();
    }

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



    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + id +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
