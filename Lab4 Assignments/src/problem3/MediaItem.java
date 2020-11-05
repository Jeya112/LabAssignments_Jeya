/*
 * name Jeya Prashanthini R
 * date 1/11/2020
 * desc Library Management System
 */
package problem3;
import java.util.Scanner;

public class MediaItem extends Item{
	private int runTime;
    public int getRunTime() {                                                                   //Getter and setter for runTime
		return runTime;
	}
    public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	@Override                                                                                  //Overriding the abstract method to get details from the user
	public void addDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		setId(sc.nextLong());
		System.out.println("Enter the Title");
		setTitle(sc.next());
		System.out.println("Enter the number of copies");
		setNoOfCopies(sc.nextInt());
		System.out.println("Enter Runtime");
		setRunTime(sc.nextInt());
		//sc.close();

	}
                                                                                               // Overriding the abstract method to display user given inputs
	@Override
	public void printDetails() {
		System.out.println("Id: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Number of Copies: " + getNoOfCopies());
		System.out.println("Runtime: " + getRunTime());

	}

}
