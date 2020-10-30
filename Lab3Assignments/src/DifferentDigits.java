/**
 Author : Jeya Prashanthini R
 Date :   26/10/2020
 Desc :   Finding difference in digits
 */
import java.util.*;
public class DifferentDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element");
		int num=sc.nextInt();
		String str=String.valueOf(num);                            //conversion of Integer to String
		int modifiednum= modifyNumber(str);
		System.out.println("The number formed by differenc in digits : "+modifiednum);
		}
 private static int modifyNumber(String str) 
 {
	 int num1=0,num2,difference,newdigit;
	 StringBuffer sb= new StringBuffer();                       
	 for(int i=0;i<str.length()-1;i++)
	 {
		 num1=Integer.parseInt((String.valueOf((str.charAt(i)))));
		 num2=Integer.parseInt((String.valueOf((str.charAt(i)))));
		 difference = Math.abs(num1-num2);                          //finding difference
		 sb.append(difference);
	 }
	 int len=str.length();
	 sb.append(str.charAt(len-1));
	 String str1=sb.toString();
	 newdigit=Integer.parseInt(str1);
	 return newdigit;
 }
}
