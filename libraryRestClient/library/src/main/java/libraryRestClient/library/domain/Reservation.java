package libraryRestClient.library.domain;




import java.time.LocalDate;


public class Reservation {

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
