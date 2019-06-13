/**
 * 
 */
package com.imagegrafia.SpringDataJPA.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 * @author surila.moharana
 *
 */
@Entity
public class Owner implements Serializable{
	
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", name=" + name + ", phoneNo=" + phoneNo +" ]";
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OWNER_ID")
	private int ownerId;
	
	public int getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


//	public List<Pet> getPets() {
//		return pets;
//	}
//
//
//	public void setPets(List<Pet> pets) {
//		this.pets = pets;
//	}


	private String name;
	
	private int phoneNo;
	
	
//	@OneToMany(mappedBy="owner")
//	private List<Pet> pets;

}
