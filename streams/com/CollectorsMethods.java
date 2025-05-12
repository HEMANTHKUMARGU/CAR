package streams.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.yourname.eight.features.Stream;

public class CollectorsMethods {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hemanth", "Hemanth", "gu", "Hello");
		Long counting = list.stream().collect(Collectors.counting());
		System.out.println(counting);
		List<Integer> Numbers = Arrays.asList(24, 22, 55, 10, 5, 100);
		IntSummaryStatistics sum = Numbers.stream().collect(Collectors.summarizingInt(i -> i));
		System.out.println(sum);
		Map<Integer, List<String>> group = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(group);
		Map<Boolean, List<String>> partitioning = list.stream().collect(Collectors.partitioningBy(P -> P.length() > 3));
		System.out.println(partitioning);
		List<Integer> l = list.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
		System.out.println(l);

		List<Integer> L = Arrays.asList(1, 2, 3, 4);
		int s = L.stream().collect(Collectors.reducing(0, (a, b) -> a + b));
		System.out.println(s);
		System.out.println("============================");

		List<Integer> takeWhile = L.stream().takeWhile(P -> P < 4).collect(Collectors.toList());
		System.out.println(takeWhile);

		List<Integer> dropWhile = L.stream().dropWhile(P -> P < 4).collect(Collectors.toList());
		System.out.println(dropWhile);
		List<String> list1 = Arrays.asList("Hemanth", "gu", "Hello");
		boolean em = list1.isEmpty();
		System.out.println(em);
		boolean pa = list.parallelStream().isParallel();
		System.out.println(pa);
		List<String> name = list.stream().distinct().collect(Collectors.toList());
		System.out.println(name);

		HashMap<String,String> m = new HashMap();
		m.put("name", "HEMANTH");
		m.put("lastname", "Gu");
		m.put("phone", "9071966467");
		m.put("place", "Gowdagere");
		m.put("name1", "Yadla");
//		Object nam = m.get("name");
			
		String nam =m.get("name");
		System.out.println(nam);
		int count = 0;
		int count1=0;
		for (int i = 0; i < nam.length(); i++) {

			char h = nam.charAt(i);
			if (nam.charAt(i) == 'H') {
				count++;
			}
			else if(nam.charAt(i)=='A')
			{
				count1++;
			}
			
			

		}
//		System.out.println("THE NUMBER OF H"+" "+count);
//		System.out.println("THE NUMBER OF E"+" "+count1);
		

//		Iterator<String> mm = list.stream().iterator();
//		System.out.println(mm);
		
	}

}
