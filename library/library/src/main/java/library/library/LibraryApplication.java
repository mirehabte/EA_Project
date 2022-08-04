package library.library;


import library.library.config.ApplicationProperties;
import library.library.integration.BookClient;
import library.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;
	@Autowired
	BookClient bookClient;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//        Book book = bookClient.getBook("ttt");
//		System.out.println(book);
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
