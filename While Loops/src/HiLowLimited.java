import java.util.Random;
import java.util.Scanner;

public class HiLowLimited 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int response = 0;
		int x = 1 + r.nextInt(100);
		int tries = 1;
		
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		
		System.out.println();
		
		while (tries <= 7)
		{
			System.out.print("> ");
			response = keyboard.nextInt();
				if ( response < x)
					System.out.println("Sorry you are too low.");
				
				if (response > x)
					System.out.println("Sorry you are too high.");
				
				if(response == x)
					System.out.println("You guessed it! What are the odds?!?");
				tries++;
		}
		
		if (tries >7 && response != x)
			System.out.println("Sorry you didn't guess it in 7 tries. You fail");
		
		keyboard.close();
	}

}
