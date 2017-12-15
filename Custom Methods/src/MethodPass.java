import java.util.Scanner;

public class MethodPass 
{
	public static void main(String[] args)
	{

		boolean response;
		
		response = check();

		if (response)
			System.out.print("I like that number!");
		else
			System.out.print("That number is gross...");
		
		
	}
	
	public static boolean check()
	{
		Scanner keyboard = new Scanner(System.in);
		
		int input;
		boolean response;
		
		System.out.print("Pick a number: " );
		input = keyboard.nextInt();
		
		if( input % 3 ==0)
			response = true;
		else 
			response = false;
			
		
		return response;
				
		
	}
}
