package com.example.SpringJdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PhoneNumbers")
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private int id;
	@Column(name="PhoneNumber")
	private String phonenumber;
	public PhoneNumber()
	{
		
	}
	public PhoneNumber(int id, String phonenumber) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phonenumber=" + phonenumber + "]";
	}
	
	
	
	

}
