package library.library.DTO;

import library.library.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerAdapter {

    public static Customer getCustomerFromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer(customerDTO.getCustomerNumber(),customerDTO.getName(), customerDTO.getEmail());
//        customer.setBorrow(BorrowAdapter.getBorrowFromBorrowDTO(customerDTO.getBorrow()));
//        customer.setPayment(PaymentAdapter.getPaymentFromPaymentDTO(customerDTO.getPayment()));
//        customer.setReservation(ReservationAdapter.getReservationFromReservationDTO(customerDTO.getReservation()));
        return customer;
    }

    public static CustomerDTO getCustomerDTOFromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO(customer.getCustomerNumber(), customer.getName(), customer.getEmail());
//        customerDTO.setBorrow(BorrowAdapter.getBorrowDTOFromBorrow(customer.getBorrow()));
//        customerDTO.setPayment(PaymentAdapter.getPaymentDTOFromPayment(customer.getPayment()));
//        customerDTO.setReservation(ReservationAdapter.getReservationDTOFromReservation(customer.getReservation()));
        return customerDTO;
    }

    public static Collection<CustomerDTO> getCustomerDTOListFromCustomerList(List<Customer> customers){
        List<CustomerDTO> customerDTOs = new ArrayList<>();
        for(Customer customer : customers){
            customerDTOs.add(getCustomerDTOFromCustomer(customer));
        }
        return customerDTOs;
    }
}
