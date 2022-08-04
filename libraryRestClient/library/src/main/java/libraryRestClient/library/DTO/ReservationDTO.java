package libraryRestClient.library.DTO;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationDTO {
    private long id;
    private LocalDate reservationDate;

    private List<BookDTO> books = new ArrayList<>();

    public ReservationDTO(){
        reservationDate=LocalDate.now();
    }
    public ReservationDTO(LocalDate reservationDate) {
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

    public List<BookDTO> getBooksDTO() {
        return books;
    }

    public void setBooksDTO(BookDTO book) {
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
