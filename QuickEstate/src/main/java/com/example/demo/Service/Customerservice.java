package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class Customerservice {
	@Autowired
	CustomerRepository customerrepository;

	public Customer createCustomer(Customer customer) {

		return customerrepository.save(customer);
	}

	public String deleteCustomerById(Long id) {
		customerrepository.deleteById(id);
		return "Customer deleted successfully!";
	}

	public Optional<Customer> getCustomerById(Long id) {
		return customerrepository.findById(id);
	}

	public List<Customer> getAllCustomer() {
		return customerrepository.findAll();
	}

//	 public Customer updatecustomerById(Customer customer, Long id) {
//			return customerrepository.save(customer);
//		}
}
