/**
Author Jeya Prashanthini 
Date   26/10/2020
Desc   Finding duplicate employee
*/
	
import java.util.*;

public class DuplicateEmployee {

	public static void main(String[] args) {
        
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int num= scan.nextInt();
		String[] name = new String[num];
		String[] designation = new String[num];
		
		for(int i=0;i<num;i++) {                                                             //Getting Employee details
		System.out.println("Enter the Employee Name");
		name[i] = scan.next();
		System.out.println("Enter the Employee Designation");
		designation[i] = scan.next();
		}
		 int duplicateCount= noOfDuplicate(name,designation); 
		 System.out.println("The number of duplicate employee details "+duplicateCount);
		
	}

	private static int noOfDuplicate(String[] name, String[] designation) {
		int duplicate=0;
		
		                                                      //Compares the name and designation for duplicate, if present then duplicate get increasing		

		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equalsIgnoreCase(name[j]) && 
						designation[i].equalsIgnoreCase(designation[j])) {  
					duplicate++;
				}
			}

		}
		return duplicate;                                                              
	}

}
