package streams.com;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hemanth", "Yedla", "Keshav", "Charlie");
		list.parallelStream().map(String::toUpperCase)
				.forEach(name -> System.out.println(Thread.currentThread().getName() + "-" + name));

	}

}
