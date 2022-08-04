package library.library.service;

import library.library.DTO.BookAdapter;
import library.library.DTO.BookDTO;
import library.library.DTO.CustomerAdapter;
import library.library.DTO.CustomerDTO;
import library.library.client.Book;
import library.library.domain.Customer;
import library.library.integration.BookClient;
import library.library.integration.JmsUpdateBook;
import library.library.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

//    @Autowired
//    private BookClient bookClient;
//
//    @Autowired
//    private JmsUpdateBook updateBook;

//    private List<BookDTO> bookList = new ArrayList<>();
//
//    public List<BookDTO> getBooks(String isbn){
//        bookList.add(bookClient.getBook(isbn));
//        return bookList;
//    }

    //Add Customer
    public void addCustomer(CustomerDTO customerDTO){
        Customer customer = CustomerAdapter.getCustomerFromCustomerDTO(customerDTO);
        customerRepository.save(customer);
    }

    //Get a customer
    public CustomerDTO getCustomer(long customerNumber){
        Customer customer = customerRepository.findById(customerNumber).get();
        if(customer == null){
            System.out.println("No customer found with the : "+customerNumber);
        }
        return CustomerAdapter.getCustomerDTOFromCustomer(customer);
    }

    //Get all customers
    public Collection<CustomerDTO> getAllCustomers(){
        List<Customer> customerList = customerRepository.findAll();
        return CustomerAdapter.getCustomerDTOListFromCustomerList(customerList);
    }

    //Update a customer
    public void updateCustomer(CustomerDTO customerDTO){
        Customer customer = CustomerAdapter.getCustomerFromCustomerDTO(customerDTO);
        customerRepository.save(customer);
    }

    //Check out
//    public void checkout(List<BookDTO> bookDTOS, CustomerDTO customerDTO){
//       List<Book> books = new ArrayList<>();
//       for (BookDTO bookDTO : bookDTOS){
//           books.add()
//       }
//       List<Book> bookList = BookAdapter.getBookListFromBookDTOList(bookDTOS);
//       Customer customer = CustomerAdapter.getCustomerFromCustomerDTO(customerDTO);
//       customer.checkout(bookList);
//    }
}
