package library.library.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    private long reservationNumber;
    private LocalDate reservationDate;
    //private List<BookDTO> bookDTOList;
}
