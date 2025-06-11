package com.example.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectRepository projectrepository;
	
	@PostMapping
	public Project createProject(@RequestBody Project project)
	{
		return projectrepository.save(project);
	}
	@GetMapping
	public List<Project> getProjects()
	{
		List<Project> projects = projectrepository.findAll();
		return projects;
	}
	@GetMapping("/{id}")
	public Project getProject(@PathVariable int id)
	{
		Project project= projectrepository.findById(id).get();
		 
		 return project;
	}
	

}
