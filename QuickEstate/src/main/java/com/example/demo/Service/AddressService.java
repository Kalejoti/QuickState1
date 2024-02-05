package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Address;
import com.example.demo.Repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository adressRepository;

	public Address createDetils(Address address) {
		return adressRepository.save(address);
	}

	public List<Address> getAddress() {
		return adressRepository.findAll();
	}

	public Optional<Address> getAddressById(Long id) {
		return adressRepository.findById(id);
	}

	public String DeleteAddress(Long id) {
		adressRepository.findById(id);
		return "Deletion Successfully";
	}

//	public Address updateAddress(Address address, Long id) {
//		return adressRepository.save(address);
//	}
}
