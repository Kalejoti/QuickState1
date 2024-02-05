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

import com.example.demo.Entity.Property;
import com.example.demo.Service.PropertyService;

@RestController

public class PropertyController {
	@Autowired
	PropertyService Propertyservice;

	@PostMapping("/Property")
	public Property CreatePropertyDetails(@RequestBody Property Property) {
		return Propertyservice.createapropertydetails(Property);

	}

	@GetMapping("/all")
	public List<Property> findAllProperty(@PathVariable Long id) {
		return Propertyservice.findAllProperty();
	}

	@GetMapping("/{id}")
	public Optional<Property> findProperty(@PathVariable Long id) {
		return Propertyservice.findpropertydetailsById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletepropertyDetailsById(@RequestParam Long id) {
		return Propertyservice.deletepropertyById(id);
	}
//
//	@PutMapping("/update/{id}")
//	public Property UpdatePropertydetails(@RequestBody Property property, @PathVariable Long id) {
//		return Propertyservice.Updatepropertydetails(property);
//	}

}
