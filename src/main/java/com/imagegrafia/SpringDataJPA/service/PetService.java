package com.imagegrafia.SpringDataJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagegrafia.SpringDataJPA.entity.Pet;
import com.imagegrafia.SpringDataJPA.repository.PetRepository;

@Service
public class PetService {
	
	
	@Autowired
	public PetRepository petRepo;
	
	
	public Pet findById(int id) {
		
		
		return petRepo.findById(id).get();
	}
	
     public Pet findByName(String name) {
		
		
		return petRepo.findByName(name);
	}
	
	public String createPet(Pet pet) {
		
		petRepo.save(pet);
		return "Pet record Created Successfully!!";
	}
	
	public String updatePet(Pet pet) {
		
		petRepo.save(pet);
		return "Pet record Updated Successfully!!";
	}
	
	public String deletePet(int id) {
		
		petRepo.deleteById(id);
		return "Pet record Deleted Successfully!!";
	}
	
	
	
	public List<Pet> findAllPetByOwnerId(int ownerId){
		List<Pet> petList = new ArrayList<>();
		
		Iterable<Pet> itr=petRepo.findByOwnerOwnerId(ownerId);
		for(Pet item:itr) {
			
			petList.add(item);
		}
		
		return petList;
		
	}

}
