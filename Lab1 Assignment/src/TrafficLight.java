import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Select the traffic light");
        System.out.println("1.Red");
        System.out.println("2.Green");
        System.out.println("3.Yellow");
        String message=scan.next();
        if(message.equalsIgnoreCase("Red"))
        {
        	System.out.print("Stop");
        }
        else if(message.equalsIgnoreCase("Green"))
        {
        	System.out.print("Go");
        }
        else if(message.equalsIgnoreCase("Yellow"))
        {
        	System.out.print("Ready");
        }
	}

}
