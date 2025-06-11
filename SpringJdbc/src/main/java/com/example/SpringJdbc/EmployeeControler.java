package com.example.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeControler {
	@Autowired
	private EmployeeRepository employeeeepository;
	@Autowired
	private ProjectRepository projectrepository;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeeepository.save(employee);
	}
	@GetMapping
	public List<Employee> getEmployee()
	{
		List<Employee> employee = employeeeepository.findAll();
		return employee;
	}
	@GetMapping("/{id}")
	public Employee getEmployeeWithId(@PathVariable int id)
	{
		Employee employee = employeeeepository.findById(id).get();
		return employee;
	}
	@DeleteMapping("/{id}")
	public String removeEmployee(@PathVariable int id)
	{
		employeeeepository.deleteById(id);
		
		return "Deleted";
	}
	@PutMapping("/{empid}/{projectid}")
	public Employee assiggnProject(@PathVariable int empid,@PathVariable int projectid)
	{
		List<Project> projects=null;
		Employee employee = employeeeepository.findById(empid).get();
		Project project=projectrepository.findById(projectid).get();
		projects=employee.getProject();
		projects.add(project);
		employee.setProject(projects);
		return employeeeepository.save(employee);
		
	}
	
	
	
	
	
	

}
