package com.example.NetiveQurry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address1, Integer> {

	@Query(nativeQuery = true, value = "SELECT ea.id,ea.city,ea.state FROM Address1 ea JOIN employe1 e on e.id=ea.employee_id where ea.employee_id=:employeeId")
	Optional<Address1> findAddressByEmployeeId(@Param("employeeId") int employeeId);

	@Query(value = "SELECT e.id, e.name, e.email, e.age, a.id, a.city, a.state " + "FROM Employe1 e "
			+ "JOIN Address1 a ON a.employee_id = e.id", nativeQuery = true)
	List<Object[]> findAllEmployeeWithAddress();
	
	@Query(value = "SELECT * from Address1",nativeQuery = true)
	List<Address1>findAllEmployeAddress();
	
	@Query(nativeQuery = true,value="SELECT * from employe1")
	List<Employees>findAllEmployees();
	

}
