package com.example.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cars")
public class CarControler {
	@Autowired
	private CarRepository carRepository;

	@PostMapping
	public CarClass createCar(@RequestBody CarClass car) {
		return carRepository.save(car);
	}

	@GetMapping
	public List<CarClass> getAllCars() {
		return carRepository.findAll();
	}

	@GetMapping("/{id}")
	public CarClass getCarById(@PathVariable int id) {
		return carRepository.findById(id).orElse(null);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCar(@PathVariable int id) {
		carRepository.deleteById(id);
		return "deleted";
	}
	
}
