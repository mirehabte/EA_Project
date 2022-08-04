package libraryRestClient.library;

import libraryRestClient.library.DTO.CustomerDTO;
import libraryRestClient.library.domain.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	private RestTemplate restTemplate = new RestTemplate();
	private String serverURL = "http://localhost:8081/customers";



	@Override
	public void run(String... args) throws Exception {
		Customer customer = restTemplate.getForObject(serverURL+"/12343211", Customer.class);
		System.out.println(customer);
		restTemplate.postForLocation(serverURL, new CustomerDTO(123456, "Frank", "frank@gmail.com"));
	}

}
