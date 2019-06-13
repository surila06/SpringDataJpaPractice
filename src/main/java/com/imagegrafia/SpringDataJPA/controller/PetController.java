/**
 * 
 */
package com.imagegrafia.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.SpringDataJPA.entity.Pet;
import com.imagegrafia.SpringDataJPA.service.PetService;

/**
 * @author surila.moharana
 *
 */

@RestController
@RequestMapping("/pets")
public class PetController {
	
	@Autowired
	public PetService petService;
	
	@GetMapping("/pet/{id}")
	public ResponseEntity<Pet> getPetById(@PathVariable Integer id){
		
		Pet getPet=petService.findById(id);
		
		ResponseEntity response=new ResponseEntity<>(getPet, HttpStatus.OK);
		return response;
	}
	
	
	@GetMapping("/getPet/{name}")
	public ResponseEntity<Pet> getPetByName(@PathVariable String name){
		
		Pet getPet=petService.findByName(name);
		
		ResponseEntity response=new ResponseEntity<>(getPet, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/petByOwner/{ownerid}")
	public ResponseEntity<Pet> getPetByOnerId(@PathVariable Integer ownerid){
		
		List<Pet> getPet=petService.findAllPetByOwnerId(ownerid);
		ResponseEntity response=new ResponseEntity<>(getPet, HttpStatus.OK);
		return response;
	}
	
	
	@PostMapping("/pet")
	public ResponseEntity<Pet> createPet(@RequestBody Pet pet){

	    String createmsg=petService.createPet(pet);
		ResponseEntity response=new ResponseEntity<>(createmsg,HttpStatus.CREATED);
		return response;
	}
	
	@DeleteMapping("/pet/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable Integer id){

	   String deletemsg=petService.deletePet(id);
		ResponseEntity response=new ResponseEntity<>(deletemsg,HttpStatus.CREATED);
		return response;
	}
	
	@PutMapping("/pet")
	public ResponseEntity<Pet> updatePet(@RequestBody Pet pet){

		 String updatemsg=petService.updatePet(pet);
		ResponseEntity response=new ResponseEntity<>(updatemsg,HttpStatus.CREATED);
		return response;
	}
	
	

}
