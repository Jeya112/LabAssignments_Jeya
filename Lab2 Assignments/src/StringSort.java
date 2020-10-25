/**
 Author : Jeya Prashanthini R
 Date :   23/10/20
 Desc :   Sorting and changing the elements into upper and lower case
 */
import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the number of strings");
	        int size =scan.nextInt();                                      //declaring and initializing the integer array
	        String stringArr[]=new String[size];
	        System.out.println("Enter the string");
	        for(int itr=0;itr<size;itr++) {
	        	stringArr[itr]=scan.next().toLowerCase();
	        }
	        String[] sortedArray=sortStrings(stringArr);
	        System.out.println("The sorted string array is");
	        for(int itr=0;itr<size;itr++) {
	        	System.out.println(sortedArray[itr]);                      //Printing the sorted Array
	        }
	        scan.close();
		}
	public static String[] sortStrings(String[] str) {
		int len=str.length;
	    Arrays.sort(str);                                                 //Sorting the Array
	    if(len%2==0) {
	        for(int i=0,j=len/2;i<len/2;i++,j++) {
	    	    str[i]=str[i].toUpperCase();
	    	    str[j]=str[j].toLowerCase();
	        }
	    }
	    else {
	    	for(int i=0;i<len/2+1;i++) {
	    		str[i]=str[i].toUpperCase();
	    	}
	    	for(int j=len/2+1;j<len;j++) {
	    		str[j]=str[j].toLowerCase();
	    	}
	    }
	    return str;                                                   //returning string
	}

	}


