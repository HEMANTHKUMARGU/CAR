package com.example.SpringJdbc;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cars")
public class CarClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "CarName")
	private String carname;

	@OneToOne(orphanRemoval = true,targetEntity = CarKeyClass.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "key_id")
	@JsonManagedReference
	private CarKeyClass carKey;

	public CarClass() {

	}

	public CarClass(int id, String carname) {
		super();
		this.id = id;
		this.carname = carname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public CarKeyClass getCarKey() {
		return carKey;
	}

	public void setCarKey(CarKeyClass carKey) {
		this.carKey = carKey;
	}

	@Override
	public String toString() {
		return "CarClass [id=" + id + ", carname=" + carname + "]";
	}

}
