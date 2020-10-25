/**
 Author : Jeya Prashanthini R
 Date : 23/10/20
 Desc : Reversing and sorting the element
*/
import java.util.Scanner;
import java.util.Arrays;

public class ReverseSort {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array");
	        int size=scan.nextInt();
	        int array[]=new int[size];                                            //Declaring and initializing the integer array
	        System.out.println("Enter the elements in the array");
	        for(int itr=0;itr<size;itr++) {
	       	 array[itr]=scan.nextInt();
	        }
	        int sortedArray[]= getSorted(array);
	        System.out.println("The sorted array is");
	        for(int itr=0;itr<size;itr++) {
	        	System.out.println(sortedArray[itr]);                              // Printing the sorted array
	        }
	        scan.close();
		
	}
	public static int[] getSorted(int[] arr) {                                    //After reversing the elements and sorting it, return. 
		for(int itr=0;itr<arr.length;itr++) {
			int reverse=0;
			while(arr[itr]>0) {                                                  // Reversing the elements in the array
				int temp=arr[itr]%10;
				reverse=reverse*10+temp;
				arr[itr]=arr[itr]/10;
			}
			arr[itr]=reverse;
		}
		Arrays.sort(arr);                                                        // Sorting the array 
		return arr;
	}
}
