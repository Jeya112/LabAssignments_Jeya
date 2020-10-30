/**
 Author : Jeya Prashanthini R
 Date :   23/10/20
 Desc :   car parking system
*/

import java.util.*;

class CarDetails {
	public String ownerName;
	public String registerNo;

	CarDetails(String ownerName, String registerNo) {                            // Constructor
		this.ownerName = ownerName;
		this.registerNo = registerNo;
	}
}

public class CarParking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarDetails story[][] = new CarDetails[5][];                               //declaring and initializing jagged array
		story[0] = new CarDetails[100];
		story[1] = new CarDetails[70];
		story[2] = new CarDetails[50];
		story[3] = new CarDetails[20];
		story[4] = new CarDetails[10];
        System.out.println("1) Park Car");
		System.out.println("2) Get Car");
		System.out.println("3) Get Available Space");
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:                                                                    // Logic for Parking
			System.out.println("Enter the Owner Name");
			String name = sc.next();
			System.out.println("Enter the Register Number");
			String regNo = sc.next();
			CarDetails cd = new CarDetails(name, regNo);                     //constructor parameterizeed
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] == null) {                                     // checks for empty spaces
						story[i][j] = cd;
						System.out.println("Your car is parked in number " + j + " in " + i + " story");
						break loop;
					} else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
			}
			break;
		case 2:                                                                    // check for getting the parked car.
			System.out.println("Enter your car's Register Number");
			String carRegNo = sc.next();
			int floor = 0, placeNo = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] != null) {
						CarDetails cdObj = story[i][j];
						String temp = cdObj.registerNo;
						if (carRegNo.equalsIgnoreCase(temp)) { // checking with the register number
							floor = i + 1;
							placeNo = j + 1;
							story[i][j] = null;
						}
					}
				}
			}
			if (floor == 0 && placeNo == 0) {
				System.out.println("The car was not found");
			} else {
				System.out.println("Your car is parked in number " + placeNo + " in " + floor + " story");
			}
			break;
		case 3:                                                                              // check for empty place
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] == null) {                                             
						System.out.println("There is an empty place in  " + j + " in " + i + " story");
						break loop;
					} else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
			}
			break;
		default:
			System.out.println("Choose from the given options!");
		}
	}
}
