import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int response;
		int x = 1 + r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print("> ");
		response = keyboard.nextInt();
		
		System.out.println();
		
		if ( response < x)
			System.out.println("Sorry you are too low. I was thinking of " + x);
		
		if (response > x)
			System.out.println("Sorry you are too high. I was thinking of " + x);
		
		if(response == x)
			System.out.println("You guessed it! What are the odds?!?");
		
		
	}

}
