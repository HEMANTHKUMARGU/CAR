 package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CarMain {
//	public static List<CarModelClass> Method(List<CarModelClass> listcar, List<String> car) {
//		List<CarModelClass> list = listcar.stream()
//				.filter(c -> car.stream().anyMatch(name -> name.equalsIgnoreCase(c.getBrand())))
//				.collect(Collectors.toList());
//		return list;
//	}

	public static void main(String[] args) {
		List<CarModelClass> listcar = Arrays.asList(new CarModelClass("bmw1", "bmw", 100000),
				new CarModelClass("bmw2", "bmw", 100000), new CarModelClass("tata1", "tata", 400000),
				new CarModelClass("lam2", "lamborghini", 100000), new CarModelClass("lam1", "lamborghini", 200000),
				new CarModelClass("kia1", "kia", 200000), new CarModelClass("tata2", "tata", 400000));
		System.out.println(listcar);
		Set<String> mapList = listcar.stream().map(CarModelClass::getBrand).map(String::toUpperCase)
				.filter(P -> P.startsWith("B")).collect(Collectors.toSet());
		System.out.println(mapList);
		Map<String, CarModelClass> maplist = listcar.stream()
				.filter(c -> mapList.stream().anyMatch(name -> name.equalsIgnoreCase(c.getBrand())))
				.collect(Collectors.toMap(CarModelClass::getBrand,c->c,(existing,replacement)-> existing));
		System.out.println(maplist);
		Map<String, List<CarModelClass>> list = listcar.stream()
				.filter(c -> mapList.stream().anyMatch(name -> name.equalsIgnoreCase(c.getBrand())))
				.collect(Collectors.groupingBy(CarModelClass::getBrand));
		System.out.println(list);
//		list.stream().forEach(System.out::println);
//		List<String> car = mapList.stream().map(String::toUpperCase).filter(P -> P.startsWith("L"))
//				.collect(Collectors.toList());
//		System.out.println(car);
//		List<CarModelClass> returnM = Method(listcar, mapList);
//
//		returnM.stream().forEach(System.out::println);

//		long count = car.stream().count();
//		System.out.println(count);
//		String join = car.stream().collect(Collectors.joining(","));
//		System.out.println(join);
//
//		List<CarModelClass> sorted = listcar.stream().sorted(Comparator.comparing(CarModelClass::getName))
//				.collect(Collectors.toList());
//		System.out.println(sorted);
//		int price = listcar.stream().mapToInt(CarModelClass::getPrice).sum();
//		System.out.println("total car price is :" + price);

	}

}
