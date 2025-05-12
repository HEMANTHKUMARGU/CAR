package streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap();
		map1.put("name", "hemanth");
		map1.put("age", "21");
		map1.put("salary", "20000");
		HashMap<String, String> map2 = new HashMap();
		map2.put("name", "karthik");
		map2.put("age", "22");
		map2.put("salary", "2000");

//		System.out.println(map1);
//		System.out.println(map2);

		List<HashMap<String, String>> Array = Arrays.asList(map1, map2);

		for (int i = 0; i < Array.size(); i++) {
			HashMap<String, String> map3= Array.get(i);
			String name = map3.get("name");
//			if (name == "hemanth") {
//				System.out.println(Array.get(i));
//			}
//			else
//			{
//				System.out.println(Array.get(i));
//			}
			for(Entry<String, String> k:map3.entrySet())
			{
				String key = k.getKey();
				String valve=k.getValue();
				System.out.println(key+" "+valve);
			}

		}
		Iterator<HashMap<String, String>> it=Array.iterator();
		while(it.hasNext())
		{
			HashMap<String, String> ma = it.next();
			for(Entry<String, String> l:ma.entrySet())
			{
				String key = l.getKey();
				String m = l.getValue();
				System.out.println(key+"="+m);
			}
		}
		ListIterator<HashMap<String, String>>listi=Array.listIterator(Array.size());
		while(listi.hasPrevious())
		{
			HashMap<String, String> lm = listi.previous();
			for(Entry<String,String> M:lm.entrySet())
			{
				String key1 = M.getKey();
				String valve = M.getValue();
				System.out.println(key1+"="+valve);
			}
		
		}
		

	}

}
