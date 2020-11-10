/*
 * name Jeya Prashanthini
 * date 10/11/2020
 * desc Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 40);
		map.put(3, 30);
		map.put(4, 70);
		map.put(8, 50);
		// Object creation for call the getValue method
		 
		SortedList sl = new SortedList();
		List<Integer> list = sl.getValue(map);
		// Printing the sorted list
		 for (Integer l : list)
		 {
			System.out.println(l);
		}

	}

	// Method to perform map to list conversion
	 
	private List<Integer> getValue(Map<Integer, Integer> map) {
		// getting value from the map, store it and assign the values in list
		
		Collection<Integer> value = map.values();
		List<Integer> arrList = new ArrayList<>(value);
		// Sorting the list and return it
		 
		Collections.sort(arrList);
		return arrList;
	}


	}


