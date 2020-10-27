/**
 Author : Jeya Prashanthini 
 Date :   26/10/20
 Desc :   Printing the Statement in url.
*/

import java.util.*;

public class Url{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Url");
		String url = sc.nextLine();
		System.out.println("The Command in the Url is "+getCommand(url));
	}


	private static String getCommand(String url) {
		
		
		String[] str1 = url.split("[/]");     
		int length=str1.length;
		String temp= str1[length-1];     
		String str2[]=temp.split("[.]");
		String command =(str2[0]);;
	    return command;    
	}

}
