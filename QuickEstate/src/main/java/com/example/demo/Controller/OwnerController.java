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
import com.example.demo.Entity.Owner;

import com.example.demo.Service.OwnerService;

@RestController

public class OwnerController {
	@Autowired
	OwnerService ownerservice;

	@PostMapping("/Owner")
	public Owner CreateOwnerDetails(@RequestBody Owner Owner) {
		return ownerservice.createaownerdetails(Owner);

	}

	@GetMapping("/all")
	public List<Owner> findAllowner(@PathVariable Long id) {
		return ownerservice.findAllowner(id);
	}

	@GetMapping("/owner/{id}")
	public Optional<Owner> findOwner(@PathVariable Long id) {
		return ownerservice.findownerdetailsById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteownerDetailsById(@RequestParam Long id) {
		return ownerservice.deleteownerById(id);
	}

//	@PutMapping("/update/{id}")
//	public Owner UpdateOwnerdetails(@RequestBody Owner owner, @PathVariable Long id) {
//		return ownerservice.Updateownerdetails(owner, id);
//	}

}
