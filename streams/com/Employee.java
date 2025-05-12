package streams.com;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee increaseSalary(double percent)
	{
		return new Employee(this.name,this.salary*(1+percent/100));
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"="+salary;
	}
	

}
