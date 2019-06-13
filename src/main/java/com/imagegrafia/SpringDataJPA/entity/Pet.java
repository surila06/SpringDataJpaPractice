/**
 * 
 */
package com.imagegrafia.SpringDataJPA.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author surila.moharana
 *
 */
@Entity
@Table(name="PET_RECORDS")
public class Pet implements Serializable {
	
	
	@Override
	public String toString() {
		return "Pet [licenseNumber=" + licenseNumber + ", name=" + name + ", petType=" + petType + "]";
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Id
	@Column(name="PET_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int licenseNumber;
	
	private String name;
	
	private String petType;
	
	@ManyToOne
	@JoinColumn(name="OWNER_ID")
	private Owner owner;

}
