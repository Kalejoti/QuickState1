package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.Customerservice;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	Customerservice customerService;

	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);

	}

	@GetMapping("/all")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable Long id) {
		return customerService.deleteCustomerById(id);
	}

//	@PutMapping("/update/{id}")
//	public Customer updateCustomerById(@RequestBody Customer customer, @PathVariable Long id) {
//		return customerService.updatecustomerById(customer, id);
//
//	}

}
