/*
 * name Jeya Prashanthini
 * date 10/11/2020
 * desc Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Integer array and passing it through getSorted method for perform the reversing and sorting using list
		 
		Integer[] arr = { 5, 10, 86, 92, 17, 60 };
		List<Integer> list = getSorted(arr);
		// Printing the Sorted array elements as list
		 
		System.out.println("\nSorted Array using list");
		for (Integer l : list) {
			System.out.print(l + " ");
		}

	}

	private static List<Integer> getSorted(Integer[] arr) {
		// Array to list conversion
		 
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		// Printing the Reversed array elements as list
		 
		System.out.println("Reversed Array using list");
		for (Integer l : list) {
			System.out.print(l + " ");
		}
		// Sorting the list using collection sort method
		 
		Collections.sort(list);
		return list;
	}

	}


