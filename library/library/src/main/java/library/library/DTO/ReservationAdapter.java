package library.library.DTO;

import library.library.client.Book;
import library.library.domain.Reservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReservationAdapter {
    public static Reservation getReservationFromReservationDTO(ReservationDTO reservationDTO){
        Reservation reservation = new Reservation(reservationDTO.getReservationDate());
        for(BookDTO bookDTO: reservationDTO.getBooksDTO()){
            reservation.setBooks(BookAdapter.getBookFromBookDTO(bookDTO));
        }
        return reservation;
    }
    public static ReservationDTO getReservationDTOFromReservation(Reservation reservation){
        ReservationDTO reservationDTO = new ReservationDTO(reservation.getReservationDate());
        for(Book book : reservation.getBooks()){
            reservationDTO.setBooksDTO(BookAdapter.getBookDTOFromBook(book));
        }
       return reservationDTO;
    }

    public static Collection<ReservationDTO> getReservationDTOListFromReservationList(List<Reservation> reservations){
        List<ReservationDTO> reservationDTOS = new ArrayList<>();
        for(Reservation reservation : reservations){
            reservationDTOS.add(getReservationDTOFromReservation(reservation));
        }
        return reservationDTOS;
    }
}
