package jbnzdev.java_new_features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("monday","tuesday","wednesday","thursday","friday");
		
		//printing the variables
		names.stream().filter(x -> x.startsWith("t")).map(x -> x+"__").forEach(x -> System.out.println(x));
		
		
		//Collecting the data
		List<String> collectedList = names.stream().filter(x -> x.length()>6).map(x -> x+" is graeter than 6").collect(Collectors.toList());
		System.out.println(collectedList);
		
		
		//sorting the data
		System.out.println(names);
		names.sort(Comparator.comparing(x -> x.toString().charAt(1)));
		System.out.println(names);
		
		Map<String,String> lang = new HashMap<String, String>();
		lang.put("Java", "Backend");
		lang.put("Python","AI");
		lang.put("Javascript", "Web");
		
		lang.entrySet().stream().filter(x -> x.getValue().equals("AI")).forEach(x-> System.out.println(x.getKey()+x.getValue()));
		Map<String,String> newMap = lang.entrySet().stream().filter(x -> x.getValue().equals("AI")).collect(Collectors.toMap(x->x.getValue(), y->y.getKey()));
		System.out.println(newMap);
	}

}
