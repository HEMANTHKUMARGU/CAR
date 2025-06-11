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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "students")
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Address")
	private String address;

	@ManyToOne(cascade = { CascadeType.PERSIST,
			CascadeType.MERGE }, targetEntity = Email.class, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "email_id")
	private Email email;

//@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "email_id") 
//	private Email email;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "student_id")
//	private List<Email> emails = new ArrayList<>();

	public StudentClass() {

	}

	public StudentClass(int id, String name, String lastName, String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public List<Email> getEmails() {
//		return emails;
//	}
//
//	public void setEmails(List<Email> emails) {
//		this.emails = emails;
//	}
//
//	public Email getEmail() {
//		return email;
//	}
//
//	public void setEmail(Email email) {
//		this.email = email;
//	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + lastName + " " + address;
	}
}
