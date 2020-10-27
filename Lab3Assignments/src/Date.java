/**
 Author : Jeya Prashanthini
 Date :   26/10/20
 Desc :   Finding duration between dates
*/
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class Date {

	public static void main(String[] args) {
		LocalDate userDate = LocalDate.of(2030, 12, 06);                                                   //given user date
		LocalDate currentDate = LocalDate.now();                                                          // Current system date
		Period duration =Period.between(currentDate, userDate);                                           //calculating the duration
		System.out.println("The duration is: "+duration.getYears()+" Years "
		+duration.getMonths()+" Months "+duration.getDays()+" Days");

	}

}

