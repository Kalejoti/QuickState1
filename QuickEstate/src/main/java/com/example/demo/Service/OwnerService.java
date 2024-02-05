package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Owner;
import com.example.demo.Repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired
	OwnerRepository Ownerrepository;

	public Owner createaownerdetails(Owner owner) {

		return Ownerrepository.save(owner);
	}

	public List<Owner> findAllowner(Long id) {
		return Ownerrepository.findAll();
	}

	public Optional<Owner> findownerdetailsById(Long id) {
		return Ownerrepository.findById(id);
	}

	public String deleteownerById(Long id) {
		Ownerrepository.deleteById(id);
		return "owner deleted successfully!";
	}

//	public Owner Updateownerdetails(Owner owner, Long id) {
//		return Ownerrepository.save(owner);
//	}

}
