package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"rahul","sharath","shetty"};
		
		// ArrayList
		//Adding items into ArrayList one by one.
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("sharath");
		a.add("shetty");
		
		//Convert array into arraylist and all items at once
		List<String> anotherList = Arrays.asList(arr);
			
        //Enhanced For Loop
		for (String s : a) {
			System.out.println(s);
		}
		
		//Iterating and printing all elements in ArrayList
		for(int i=0;i<a.size();i++) { //Arrays-Length , ArrayList-size
			System.out.println(a.get(i)); // Arrays-a[i],ArrayList -a.get(i)
		}
		
		//Convert Array into ArrayList
		List<String> b = Arrays.asList(arr); //Arrays.asList("rahul","sharath","shetty");
		//convert to arraylist as it has many inbuilt methods, such as "contains"
		System.out.println(anotherList.contains("sharath"));		
/*Benifits of converting array into arraylist
 1.Arraylist has a lot of inbuilt methods 
 2.Arraylist size increases dynamically as we add elements,but array size is static after  we initialize it. 
 */
	}
}

