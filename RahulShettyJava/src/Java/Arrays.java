package Java;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {

		int myNum = 5;

		String website = "Rahul Shetty Academy";

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;

		System.out.println(myNum + "is the value stored in the myNum variable");

		System.out.println(website);

		// Arrays Initialization in two ways-
		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;

		int[] arr2 = { 1, 2, 4, 5, 6 };

		System.out.println(arr2[0]);

		// for loop arr.length - 5

		for (int i = 0; i < arr.length; i++) // 4
		{
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "rahul", "shetty", "selenium" };
		
 //Iterating through all elements and printing all elements in array
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//Enhanced For Loop
		for (String s : name) {
			System.out.println(s);
		}
		//MultiDimensional Array
		int [][] array = new int [2][2];
		array[0][0] = 0;
		array[0][1] = 1;
		array[1][0] = 2;
		array[1][1] = 3;
		
		int b[][] = {{0,1},{2,3}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(array[i][j]);
			}
		}
		
		
	}
}
