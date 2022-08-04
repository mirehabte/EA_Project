package libraryRestClient.library.DTO;



import libraryRestClient.library.domain.Borrow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BorrowAdapter {
    public static Borrow getBorrowFromBorrowDTO(BorrowDTO borrowDTO){
        Borrow borrow = new Borrow(borrowDTO.getBorrowNumber());
        //borrow.setCustomer(CustomerAdapter.getCustomerFromCustomerDTO(borrowDTO.getCustomer()));
        //customer.setPayment(PaymentAdapter.getPaymentFromPaymentDTO(customerDTO.getPayment()));
        //customer.setReservation(ReservationAdapter.getReservationFromReservationDTO(customerDTO.getReservation()));
        return borrow;
    }

    public static BorrowDTO getBorrowDTOFromBorrow(Borrow borrow){
        BorrowDTO borrowDTO = new BorrowDTO(borrow.getBorrowNumber());
        //borrowDTO.setCustomer(CustomerAdapter.getCustomerDTOFromCustomer(borrow.getCustomer()));
        //customerDTO.setPayment(PaymentAdapter.getPaymentDTOFromPayment(customer.getPayment()));
        //customerDTO.setReservation(ReservationAdapter.getReservationDTOFromReservation(customer.getReservation()));
        return borrowDTO;
    }

    public static Collection<BorrowDTO> getBorrowDTOListFromBorrowList(List<Borrow> borrows){
        List<BorrowDTO> borrowDTOs = new ArrayList<>();
        for(Borrow borrow : borrows){
            borrowDTOs.add(getBorrowDTOFromBorrow(borrow));
        }
        return borrowDTOs;
    }
}
