package com.example.NetiveQurry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressrepository;

	@Autowired
	private ModelMapper mapper;

	public AddressResponse findAddressByEmployeeId(int employeeId) {
		Optional<Address1> addressByEmployeeId = addressrepository.findAddressByEmployeeId(employeeId);
		AddressResponse addressresponse = mapper.map(addressByEmployeeId, AddressResponse.class);
		return addressresponse;
	}

	public List<EmployeeAddressResponse> getAllEmployeesWithAddress() {
		List<Object[]> results = addressrepository.findAllEmployeeWithAddress();
		List<EmployeeAddressResponse> response = new ArrayList<>();

		for (Object[] row : results) {
			Integer id = (Integer) row[0];
			String name = (String) row[1];
			String email = (String) row[2];
			String age = (String) row[3];
			Integer aId = (Integer) row[4];
			String city = (String) row[5];
			String state = (String) row[6];

			response.add(new EmployeeAddressResponse(id, name, email, age, aId, city, state));
		}

		return response;
	}
	public List<Address1>getAllEmployeeAddress()
	{
		List<Address1>employeeAddress=addressrepository.findAllEmployeAddress();
		return employeeAddress;
	}
	public List<Employees>getAllEmployees()
	{
		List<Employees>employee=addressrepository.findAllEmployees();
		return employee;
	}

}
