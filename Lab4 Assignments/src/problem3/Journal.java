/*
 * name Jeya Prashanthini R
 * date 1/11/2020
 * desc Library Management System
 */
package problem3;
import java.util.Scanner;

public class Journal extends WrittenItem{

	private int publishedYear;
    public int getPublishedYear() {                                                        // Getter and setter for publishedYear
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	                                                                                        //Overriding addDetails method and setting the value for publishedYear
	
    @Override
	public void addDetails() {
		super.addDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year of Publication");
		setPublishedYear(sc.nextInt());
		//sc.close();
	}

	@Override                                                                                // Overriding printDetails method and display the value for publishedYear
	public void printDetails() {
		super.printDetails();
		System.out.println("Year of Publication " + getPublishedYear());
	}

}
