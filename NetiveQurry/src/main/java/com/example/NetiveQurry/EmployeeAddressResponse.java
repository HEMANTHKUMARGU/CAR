package com.example.NetiveQurry;

public class EmployeeAddressResponse {
	private int id;
	private String name;
	private String email;
	private String age;
	private int aId;
	private String city;
	private String state;
	
	public EmployeeAddressResponse()
	{
		
	}
    

	public EmployeeAddressResponse(int id, String name, String email, String age, int aId, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.aId = aId;
		this.city = city;
		this.state = state;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	@Override
	public String toString() {
		return "EmployeeAddressResponse [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", city="
				+ city + ", state=" + state + "]";
	}
	

}
