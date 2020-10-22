import java.util.Scanner;

public class Fibonacci {
         public static int nonrecursivefibonacci(int number)
         {
        	 int num1=1,num2=2;
        	 System.out.print(num1+" "+num2+" ");
        	 for(int i=2;i<number;i++)
        	 {
        		 int sum=num1+num2;
        		 System.out.print(sum+" ");
        		 num1=num2;
        		 num2=sum;
        		 }
        	 return 0;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entee the number");
		int number=sc.nextInt();
		nonrecursivefibonacci(number);

	}

}
