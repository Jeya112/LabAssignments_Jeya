/*
 * name Jeya Prashanthini
 * date 3/11/2020
 * desc validating salary
 */
package employee;
import java.util.Scanner;

public class ValiadteSalary {
	private static void checkSalary(double salary) {
		try {
			if (salary < 3000) {
				throw new EmployeeException("The salary shoud be above 3000");
			}
			else
			{
				System.out.println("The salary of the mployee is "+salary);
			}
		}
		// catch the exception thrown from try block
		catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get the salary as input
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		// check the salary is valid or not in try block
		checkSalary(salary);
		sc.close();

	}

}
