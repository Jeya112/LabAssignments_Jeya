/**
 Author : Jeya Prashanthini R
 Date :   23/10/20
 Desc :   Finding Second Smallest Element
 */
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[5];                                         //Declaring and initializing array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=getSecondSmallest(arr);
		System.out.println("The second smallest element is "+result);   //printing the second smallest
		}
     public static int getSecondSmallest(int [] arr)
     {
    	 Arrays.sort(arr);                                              //Sorting array
    	 return arr[1];                                                 //Returning Second Smallest
     }
}
