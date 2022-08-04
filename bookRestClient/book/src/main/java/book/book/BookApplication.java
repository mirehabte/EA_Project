package book.book;

import book.book.DTO.BookDTO;
import book.book.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BookApplication implements CommandLineRunner {

	private RestTemplate restTemplate = new RestTemplate();
	private String serverURL = "http://localhost:8080/books";

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = restTemplate.getForObject(serverURL+"/{isbn}", Book.class, "1asd");
		System.out.println(book);
		restTemplate.postForLocation(serverURL, new BookDTO("123456", "Rich Dad poor Dad"));
	}
}
