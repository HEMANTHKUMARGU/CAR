package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Hemanth", 450000), new Employee("Keshava", 500000),
				new Employee("Balraj", 420000), new Employee("Karthik", 600000), new Employee("Adarsh", 600000),
				new Employee("yadla", 400000), new Employee("Chandan", 510000), new Employee("Chandan G", 520000));

		List<String> ANS = list.parallelStream().filter(emp -> emp.getSalary() >= 500000)
				.map(emp -> emp.increaseSalary(10))
				.peek(emp -> System.out.println(Thread.currentThread().getName() + "-" + emp)).map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(ANS);
		System.out.println("======================================================================================");

		double Sum = list.parallelStream().filter(P -> P.getSalary() >= 50000).map(emp -> emp.increaseSalary(10))
				.mapToDouble(Employee::getSalary).sum();
		System.out.println(Sum);
		System.out.println("=======================================================================================");
		list.parallelStream().filter(Emp -> Emp.getSalary() <= 500000)
				.peek(emp -> System.out.println(Thread.currentThread().getName() + "-" + emp)).map(Employee::getName)
				.forEach(System.out::println);

	}

}
