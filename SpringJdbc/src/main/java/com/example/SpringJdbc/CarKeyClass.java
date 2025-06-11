package com.example.SpringJdbc;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CarKeys")
public class CarKeyClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Carkey")
	private String carKey;
	@OneToOne(mappedBy = "carKey")
	@JsonBackReference
	private CarClass car;

	public CarKeyClass() {

	}

	public CarKeyClass(int id, String carKey) {
		super();
		this.id = id;
		this.carKey = carKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarKey() {
		return carKey;
	}

	public void setCarKey(String carKey) {
		this.carKey = carKey;
	}

	public CarClass getCar() {
		return car;
	}

	public void setCar(CarClass car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarKeyClass [id=" + id + ", carKey=" + carKey + "]";
	}

}
