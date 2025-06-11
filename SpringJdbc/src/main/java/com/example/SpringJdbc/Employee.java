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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid")
	private int empid;
	@Column(name = "empName")
	private String empname;

	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, targetEntity = Project.class, fetch = FetchType.EAGER)
	@JoinTable(name = "empProject", joinColumns = @JoinColumn(name = "employee_id"),
	inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> project = new ArrayList<Project>();

	public Employee() {

	}

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

}
