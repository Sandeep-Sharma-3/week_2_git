import java.util.Scanner;

public class InOut
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter integer : ");
		int a = in.nextInt();
		
		System.out.print("Enter a double datatype number : ");
		double b = in.nextDouble();
		
		System.out.print("Enter a string without spaces : ");
		String c = in.next();
		in.nextLine(); // to empty out enter pressed after entering char
		//we can also use different scanner objects
		
		System.out.print("Enter a string line : ");
		String d = in.nextLine();
		
		System.out.print("Enter a character : ");
		char e = in.next().charAt(0);
		
		System.out.print("Enter a boolean value : ");
		boolean f = in.nextBoolean();
		
		System.out.println("Your integer value is : " + a);
		System.out.println("Your double value is : " + b);
		System.out.println("Your String without spaces value is : " + c);
		System.out.println("Your String line value is : " + d);
		System.out.println("Your character value is : " + e);
		System.out.println("Your boolean value is : " + f);
	}
}