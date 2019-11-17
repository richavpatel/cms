package com.exampleModel.demoModel.service;

import com.exampleModel.demoModel.model.Customer;
import com.exampleModel.demoModel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;


@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

public Customer addCustomer(Customer customer){
    return customerRepository.save(customer);
}

public List<Customer> getCustomers(){
    return customerRepository.findAll();
}
public Customer getCustomer(int customerId){
    return customerRepository.findById(customerId).get();
}

public Customer updateCustomer(int customerId, Customer customer){
    customer.setCustomerId(customerId);
    return customerRepository.save(customer);
}
public void deleteCustomer(int customerId){
        customerRepository.deleteById(customerId);
    }

}
