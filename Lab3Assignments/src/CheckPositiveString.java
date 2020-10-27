
/**
 Author : Jeya Prashanthini
 Date :   26/10/20
 Desc :   Check whether a string is Positive
*/

import java.util.*;
public class CheckPositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		if(isPositive(str)) {  
			System.out.println(str+" is a Positive string");
		}
		else{
			System.out.println(str+" is not a Positive string");
		}

	}

	private static boolean isPositive(String str) {
		int count=0;
		char[] charArr = str.toCharArray();                             //string to character array
		for(int i=0;i<charArr.length;i++) {
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]<charArr[j])                                //Comparing the characters
					count++;
				else
					return false;                                        //return false for non alphabets
			}
		}
		if(count>0)
		return true;                                                     //return true for alphabets
		else
			return false;
		
	}

}
