package library.library;

import library.library.DTO.BorrowDTO;
import library.library.DTO.CustomerDTO;
import library.library.DTO.PaymentDTO;
import library.library.DTO.ReservationDTO;
import library.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		CustomerDTO customerDTO = new CustomerDTO(12L, "c1", "frank@gmail.com");
//		ReservationDTO reservationDTO = new ReservationDTO(LocalDate.now());
//		BorrowDTO borrowDTO = new BorrowDTO(12L);
//		PaymentDTO paymentDTO = new PaymentDTO(12.34);
//		customerDTO.setReservation(reservationDTO);
//		customerDTO.setBorrow(borrowDTO);
//		customerDTO.setPayment(paymentDTO);
//		customerService.addCustomer(customerDTO);
	}
}
