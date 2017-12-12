import java.util.Scanner;

public class CollatzSequence 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int response;
		
		System.out.println("Let's create a COLLAT SEQUENCE!");
		System.out.println();
		
		System.out.println("Rules: ");
		System.out.println("If the number is even, divide it by two. ");
		System.out.println("If the number is odd, Multiply by 3 and add 1.");
		System.out.println("Repeat this decision until you reach 1. ");
		System.out.println();
		
		System.out.print("Starting number: ");
		response = keyboard.nextInt();
		
		System.out.print("[ " + response + " - ");
		do 
		{
			if (response % 2 == 0)
			{
				response =response/2;
				System.out.print(response + " - ");
			}
			else
			{
				response = (response*3) + 1;
				System.out.print(response + " - ");
			}
		} while (response != 1);

		System.out.print("]");
	}

}
