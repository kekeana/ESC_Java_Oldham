import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int guess;
		int x = 1 + r.nextInt(10);
		int tries = 1;
		
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		
		do 
		{
			System.out.println("That is incorrect. Guess again. ");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
		} while (guess !=x);
			
		if (guess ==x)
		{
			System.out.println("That's right! You're a good guesser.");
			System.out.println("It only took you " + tries + " tries.");
			
		}

		keyboard.close();
	}

}