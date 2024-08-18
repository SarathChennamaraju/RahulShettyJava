package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("sharath");
		
		List<String> d = Arrays.asList("man","woman");
		 
		//Filter method
		long b = a.stream().filter(s->s.startsWith("s")).count();
		System.out.println(b);
		
		//use stream.of method to add values
		Long c = Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).count();
		System.out.println(c);
		
		//print the result using forEach method (used with filter method as terminal operation)
		Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).forEach(k->System.out.println(k));
	
		//using limit
		Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).limit(1).forEach(k->System.out.println(k));
	
	   // using map and filter
	Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).map(l->l.toUpperCase()).forEach(k->System.out.println(k));
	
	//sort the results
	Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).map(l->l.toUpperCase()).sorted().forEach(k->System.out.println(k));
	
	//Merge two lists
	Stream<String> anotherStream = Stream.concat(a.stream(),d.stream());
	anotherStream.map(l->l.toUpperCase()).sorted().forEach(k->System.out.println(k));
	
	//print boolean value
	Boolean flag = a.stream().anyMatch(s->s.equalsIgnoreCase("rahul"));
	System.out.println(flag);
	//Assert.assertTrue(flag);
	
	//collect method to collect and convert output to list
	List<String> ls = Stream.of("rahul","shetty","sharath").filter(s->s.startsWith("s")).map(l->l.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls);
	
	//print unique numbers in sorted order using distinct
	List<Integer> numbers = Arrays.asList(1,2,3,2,5,7,4);
	numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
}
