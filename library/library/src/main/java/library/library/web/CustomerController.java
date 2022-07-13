package library.library.web;

import library.library.DTO.CustomerDTO;
import library.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<?> addCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.addCustomer(customerDTO);
        return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);
    }

    @GetMapping("/customers/{customerNumber}")
    public ResponseEntity<?> getCustomer(@PathVariable long customerNumber){
        CustomerDTO customerDTO = customerService.getCustomer(customerNumber);
        if(customerDTO == null){
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("Customer with : "+customerNumber+" not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<?> getAllCustomers(){
        Collection<CustomerDTO> customerDTOS = customerService.getAllCustomers();
        return new ResponseEntity<Collection<CustomerDTO>>(customerDTOS, HttpStatus.OK);
    }

    @PutMapping("/customers/{customerNumber}")
    public ResponseEntity<?> updateCustomer(@PathVariable long customerNumber,
                                            @RequestBody CustomerDTO customerDTO){
        CustomerDTO customerUpdate = customerService.getCustomer(customerNumber);
        if(customerUpdate == null){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Customer not found : "+customerNumber),
                    HttpStatus.NOT_FOUND);
        }
        customerService.updateCustomer(customerDTO);
        return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);
    }
}
