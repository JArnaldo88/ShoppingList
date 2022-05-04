package com.project.Shopping.List.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Market" )
public class Market {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "name", unique = false, nullable = false)
	private String address;
	
	@Column(name = "name", nullable = false)
	private String city;
	
	@Column(name = "name", nullable = false)
	private String area;
	
	@Column(name = "name", nullable = false, unique = false , length = 8)
	private String zipCode;
	
	@Column(name = "name", nullable = false, unique = false)
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getZipcode() {
		return zipCode;
	}

	public void setZipcode(String zipcode) {
		this.zipCode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "ShoppingList [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", area="
				+ area + ", zipcode=" + zipCode + ", country=" + country + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + ", getArea()=" + getArea()
				+ ", getZipcode()=" + getZipcode() + ", getCountry()=" + getCountry() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
