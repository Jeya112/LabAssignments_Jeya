import java.util.*;
public class Difference {


		// TODO Auto-generated method stub
		public static int calculateDifference(int num) 
		{
			int diff, sumOfSquares=0, squareOfSum=0, sum=0;
			for(int itr=1;itr<=num;itr++) {
				sumOfSquares=sumOfSquares+(itr*itr);
				sum=sum+itr;
			}
			squareOfSum+=sum*sum;
			diff=sumOfSquares-squareOfSum;
			return diff;
		}
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
			int difference=calculateDifference(number); 
			System.out.print("The difference is "+difference);
		}

	}


