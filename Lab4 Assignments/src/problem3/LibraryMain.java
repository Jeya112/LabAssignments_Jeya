/*
 * name Jeya Prashanthini R
 * date 1/11/2020
 * desc Library Management System
 */
package problem3;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		                                                                                             //List of items in Library
		System.out.println("1.Book");
		System.out.println("2.Journal");
		System.out.println("3.Video");
		System.out.println("4.CD");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
	    switch (choice) {                                                                           //Invoking methods according to user's choice
		case 1:
			Book bk = new Book();
			bk.addDetails();
			bk.printDetails();
			break;
		case 2:
			JournalPaper jp = new JournalPaper();
			jp.addDetails();
			jp.printDetails();
			break;
		case 3:
			Video vd = new Video();
			vd.addDetails();
			vd.printDetails();
			break;
		case 4:
			CD cd = new CD();
			cd.addDetails();
			cd.printDetails();
			break;
		default:
			System.out.println("Choose from the Menu!");
		}
		sc.close();

	}

	}

}
