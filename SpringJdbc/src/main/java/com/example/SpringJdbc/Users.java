package com.example.SpringJdbc;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Username")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = PhoneNumber.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "phone_id")
	private List<PhoneNumber> phonenum = new ArrayList<>();

	public Users() {

	}

	public Users(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PhoneNumber> getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(List<PhoneNumber> phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + "]";
	}

}
