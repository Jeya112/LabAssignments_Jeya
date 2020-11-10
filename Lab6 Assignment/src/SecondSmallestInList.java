/*
 * name Jeya Prashanthini
 * date 10/11/2020
 * desc Create a method which accepts an array of integer elements and return the second smallest element in the array
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Integer array and passing it through getSecondSmallest method to get value.
	    Integer[] arr = { 5, 10, 4, 9, 7, 6 };
		int secondSmallest = getSecondSmallest(arr);
		System.out.println(secondSmallest);

	}
	// Integer array is passed and converted as a list then by sorting the list using collection sort method.After that value is returned.
	 
   private static int getSecondSmallest(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int secSmallest = list.get(1);
		return secSmallest;
	}

	}


