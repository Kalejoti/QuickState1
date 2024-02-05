package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Property;
import com.example.demo.Repository.PropertyRepository;

@Service
public class PropertyService {
	@Autowired
	PropertyRepository propertyrepository;

	public Property createapropertydetails(Property property) {
		return propertyrepository.save(property);
	}

	public List<Property> findAllProperty() {
		return propertyrepository.findAll();
	}

	public Optional<Property> findpropertydetailsById(Long id) {
		return propertyrepository.findById(id);
	}

	public String deletepropertyById(Long id) {
		propertyrepository.findById(id);
		return "Property deleted Successfully!";
	}

//	public Property Updatepropertydetails(Property property) {
//		return propertyrepository.save(property);
//	}

}
