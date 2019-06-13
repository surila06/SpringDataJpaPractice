/**
 * 
 */
package com.imagegrafia.SpringDataJPA.controller;

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

import com.imagegrafia.SpringDataJPA.entity.Owner;
import com.imagegrafia.SpringDataJPA.entity.Pet;
import com.imagegrafia.SpringDataJPA.service.OwnerService;


/**
 * @author surila.moharana
 *
 */

@RestController
@RequestMapping("/owners")
public class OwnerController {
	
	@Autowired
	public OwnerService ownerService;
	
	@GetMapping("/owner/{id}")
	public ResponseEntity<Pet> getOwnerById(@PathVariable Integer id){
		
		Owner getOwner=ownerService.findById(id);
		
		ResponseEntity response=new ResponseEntity<>(getOwner, HttpStatus.OK);
		return response;
	}
	
	
	@GetMapping("/getOwner/{name}")
	public ResponseEntity<Pet> getPetByName(@PathVariable String name){
		
		Owner getOwner=ownerService.findByName(name);
		
		ResponseEntity response=new ResponseEntity<>(getOwner, HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/owner")
	public ResponseEntity<Pet> createPet(@RequestBody Owner owner){

	    String createmsg=ownerService.createOwner(owner);
		ResponseEntity response=new ResponseEntity<>(createmsg,HttpStatus.CREATED);
		return response;
	}
	
	@DeleteMapping("/owner/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable Integer id){

	   String deletemsg=ownerService.deleteOwner(id);
		ResponseEntity response=new ResponseEntity<>(deletemsg,HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/owner")
	public ResponseEntity<Pet> updatePet(@RequestBody Owner owner){

		 String updatemsg=ownerService.updateOwner(owner);
		ResponseEntity response=new ResponseEntity<>(updatemsg,HttpStatus.CREATED);
		return response;
	}
	
	


}
