package com.choco.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="demo")



public class ChocoDemo {
	@Id
	@Column (unique=true)
	private int sno;
private String chocolateName;
	
	private String brand;
	
	private String flavour;

	private int quantity;
	
	private String expiredate;
	
	private int price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	private Customer customer;
	
	
	    public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getChocolateName() {
		return chocolateName;
	}

	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	

}
