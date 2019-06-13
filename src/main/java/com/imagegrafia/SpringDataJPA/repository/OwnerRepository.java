/**
 * 
 */
package com.imagegrafia.SpringDataJPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.imagegrafia.SpringDataJPA.entity.Owner;


/**
 * @author surila.moharana
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Integer> {
	
	
	public Owner findByName(String name);
}
