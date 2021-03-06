/*
 * name Jeya Prashanthini
 * date 3/11/2020
 * desc Validating Name
 */
package name;
import java.util.Scanner;

public class ValidateName {
	private static void checkFullname(String firstName, String lastName) {
		// check whether lastname and firstname are blank
		try {
			if (firstName == null && lastName == null) {
				throw new NameException("The name of the mployee is not valid");
			}
			else
			{
				System.out.println("The fullname of the person is "+firstName+lastName);
			}
		}
		// catch the exception thrown from try block
		catch (NameException ne) {
			System.out.println(ne.getMessage());
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Get the input
		System.out.println("Enter the firstname");
		String firstName = sc.next();
		System.out.println("Enter the lastname");
		String lastName = sc.next();
		checkFullname(firstName,lastName);
		sc.close();

	}

}
