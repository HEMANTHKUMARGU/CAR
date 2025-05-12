package streams.com;

import java.security.Identity;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.yourname.eight.features.Peoples;

public class StreamSum {

	public static void main(String[] args) {
		
		
		List<Integer>nums1=Arrays.asList(1,2,3,4,5,6);
		int maxi=nums1.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxi);
		
		List<String>nums2=Arrays.asList("cherry","bannana","coconut","berry");
		long count=nums2.stream().filter(P->P.startsWith("c")).count();
		System.out.println(count);
		
		List<String>nums3=Arrays.asList("cherry","bannana","coconut","berry");
		nums3.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<Integer>nums4=Arrays.asList(1,2,3,4,5,6);
		long count1=nums4.stream().filter(P->P%2==0).count();
		System.out.println(count1);
		
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6);
		int sum=nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		List<Double>floatNums=Arrays.asList(1.1,1.2,1.3,1.4,1.5);
		Double avg=floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println(avg);
		
		List<String>nums5=Arrays.asList("cherry","bannan","coconut","berry");
		String concat=nums5.stream().collect(Collectors.joining(","));
		System.out.println(concat);
		
		List<Integer>nums6=Arrays.asList(1,2,3,4,5,6,1,2,3);
		nums6.stream().distinct().forEach(System.out::println);
		
		List<Peoples> people=Arrays.asList(
				new Peoples("Hemanth","GU", 23),
				new Peoples("Hemanth","GU", 23),
				new Peoples("Karthik","KR",22),
				new Peoples("Yadla","Kumar", 22),
				new Peoples("Chandan","lm", 23),
				new Peoples("Akash","lm", 21)
				);
		people.stream().sorted(Comparator.comparing(Peoples::getName)).forEach(System.out::println);
		
		List<Integer>nums7=Arrays.asList(2,4,6,8,10);
		boolean ans = nums.stream().allMatch(Match->Match%2==0);
		System.out.println(ans);
		
		List<Integer>nums8=Arrays.asList(1,2,3,4,5,6);
		Integer s = nums8.stream().reduce(0,(a, b)->a+b);
		System.out.println(s);
		
		Integer multi = nums8.stream().reduce(1,(a,b)->a*b);
		System.out.println(multi);
		
		Integer max = nums8.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(max);
		
		String length = nums5.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(length);
		
		long start=0;
		long end=0;
		start=System.currentTimeMillis();
		IntStream.range(1,100).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("time taken"+(end-start));
		
		start=System.currentTimeMillis();
		IntStream.range(1,100).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("time taken"+(end-start));
				

	}

}
