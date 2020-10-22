import java.util.Scanner;

public class DivisibleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        int result=SumofDigits(number);
        System.out.println("The sum is "+result);
	}
	private static int SumofDigits(int number)
	{
		int index,sum=0;
		for(index=1; index<=number;index++)
		{
			if(index%3==0 || index%5==0)
			{
				sum=sum+index;
			}
		}
		return sum;
	}

}
