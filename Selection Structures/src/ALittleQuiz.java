import java.util.Scanner;

public class ALittleQuiz 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int Q1, Q2, Q3, Score1, Score2, Score3;
		
		System.out.println(" Q1) What is the Capital of Alaska?");
		System.out.println("     1) Melbourne");
		System.out.println("     2) Anchorage");
		System.out.println("     3) Juneau");
		
		System.out.println("");
		System.out.print("> ");
		Q1 = keyboard.nextInt();
		
		if (Q1 == 3)
		{
			System.out.println("That's right!");
			System.out.println("");
			Score1 = 1;
		}
		else
		{
			System.out.println("Nope. You don't know much.");
			System.out.println("");
			Score1 = 0;
		}
		
		System.out.println(" Q2) Can you store the variable 'cat' in a variable of type int?");
		System.out.println("     1) Yes");
		System.out.println("     2) No");

		System.out.println("");
		System.out.print("> ");
		Q2 = keyboard.nextInt();
		
		if (Q2 == 2)
		{
			System.out.println("Correct! You understand basic Java programming!");
			System.out.println("");
			Score2 = 1;
		}
		else
		{
			System.out.println("Sorry not sorry, 'cat' is a string. ints can only store numbers.");
			System.out.println("");
			Score2 = 0;
		}
		
		System.out.println(" Q3) What is the result of 9+6/3?");
		System.out.println("     1) 5");
		System.out.println("     2) 11");
		System.out.println("     3) 15/3");

		System.out.println("");
		System.out.print("> ");
		Q3 = keyboard.nextInt();
		
		if (Q3 == 2)
		{
			System.out.println("That's correct!");
			Score3 = 1;
		}
		else
		{
			System.out.println("You failed. PEMDAS is the most basic math you can learn.");
			Score3 = 0;
		}
		
		System.out.println("Overall, you got " + ( Score1 + Score2 + Score3)  + " out of 3 correct.");
		System.out.println("Thanks for playing!");
	}

}
