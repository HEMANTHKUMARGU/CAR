package com.example.NetiveQurry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class AddressController {
	@Autowired
	private AddressService addressservice;
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse>getAddressByEmployeeId(@PathVariable("employeeId") int employeeId)
	{
		AddressResponse addressResponse=addressservice.findAddressByEmployeeId(employeeId);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
	@GetMapping
	public ResponseEntity<List<EmployeeAddressResponse>>getAllEmployeesWithAddress()
	{
		List<EmployeeAddressResponse>response=addressservice.getAllEmployeesWithAddress();
		return ResponseEntity.ok(response);
	}
	@GetMapping("/address")
	public ResponseEntity<List<Address1>>getAllEmployeeAddress()
	{
		List<Address1>employeeAdress=addressservice.getAllEmployeeAddress();
		return ResponseEntity.status(HttpStatus.FOUND).body(employeeAdress);
	}
	@GetMapping("/employees")
	public ResponseEntity<List<Employees>>getAllEmplotees()
	{
		List<Employees> employees = addressservice.getAllEmployees();
		return ResponseEntity.status(HttpStatus.FOUND).body(employees);
	}

}
