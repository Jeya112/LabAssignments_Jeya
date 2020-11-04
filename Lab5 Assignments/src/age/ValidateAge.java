/*
 * name Jeya Prashanthini
 * date 3/11/2020
 * desc validating age
 */
package age;
import java.util.Scanner;

public class ValidateAge {
	private static void checkAge(int age) {
	// Check the valid condition for age in the try block
		try {
			if (age > 100 || age < 15) {
				throw new AgeException("The age you have entered id not valid");
			}
			else
			{
				System.out.println("The age of the person is"+age);
			}
		}
		// caught the exception thrown from try block
		catch (AgeException ae) {
			System.out.println(ae.getMessage());
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		// get the age as the input
		int age = sc.nextInt();
		checkAge(age);
		sc.close();

	}


}
