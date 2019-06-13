/**
 * 
 */
package com.imagegrafia.SpringDataJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagegrafia.SpringDataJPA.entity.Owner;
import com.imagegrafia.SpringDataJPA.repository.OwnerRepository;


/**
 * @author surila.moharana
 *
 */
@Service
public class OwnerService {
	
	
	@Autowired
	public OwnerRepository ownerRepo;
	
	
	public Owner findById(int id) {
			
		return ownerRepo.findById(id).get();
	}
	
     public Owner findByName(String name) {
		
		
		return ownerRepo.findByName(name);
	}
	
	public String createOwner(Owner owner) {
		
		ownerRepo.save(owner);
		return "Owner record Created Successfully!!";
	}
	
	public String updateOwner(Owner owner) {
		
		ownerRepo.save(owner);
		return "Owner record Updated Successfully!!";
	}
	
	public String deleteOwner(int id) {
		
		ownerRepo.deleteById(id);
		return "Pet record Deleted Successfully!!";
	}

}
