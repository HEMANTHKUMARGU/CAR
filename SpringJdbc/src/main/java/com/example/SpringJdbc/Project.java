package com.example.SpringJdbc;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ProjectId")
	private int projectid;
	@Column(name="ProjectName")
	private String projectName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee=new ArrayList<>();
	
	public Project()
	{
		
	}

	public Project(int projectid, String projectName) {
		super();
		this.projectid = projectid;
		this.projectName = projectName;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectName=" + projectName + "]";
	}
	
	

}
