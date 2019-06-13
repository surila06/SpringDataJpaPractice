/**
 * 
 */
package com.imagegrafia.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.imagegrafia.SpringDataJPA.entity.Pet;

/**
 * @author surila.moharana
 *
 */
public interface PetRepository extends CrudRepository<Pet, Integer> {
	
	public Pet findByName(String name);
	public List<Pet> findByOwnerOwnerId(int id);

}
