package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Address;
import com.example.demo.Service.AddressService;

@RestController

public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddressDetales(@RequestBody Address address) {
		return addressService.createDetils(address);
	}
	
	@GetMapping("/all")
	public List<Address> getAddressDetails() {
		return addressService.getAddress();
	}
	
	@GetMapping("/{id}")
	public Optional<Address> getAddressByDetails(@PathVariable Long id) {
		return addressService.getAddressById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteAddressDetails(@RequestParam Long id) {
		return addressService.DeleteAddress(id);
	}
	
//	@PutMapping("/update/{id}")
//	public Address updateAddreDetails(@RequestBody Address address, @PathVariable Long id) {
//		return addressService.updateAddress(address,id);
//	}
}
