package library.library.service;

import library.library.DTO.CustomerAdapter;
import library.library.DTO.CustomerDTO;
import library.library.domain.Customer;
import library.library.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

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
}
