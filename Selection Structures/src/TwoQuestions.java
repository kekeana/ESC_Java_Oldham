import java.util.Scanner;

public class TwoQuestions 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String Q1, Q2;
		
		System.out.println("Think of an object, and I'll try and guess what it is!");
		System.out.println("");
		
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		Q1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		Q2 = keyboard.next();
	
		if (Q1.equals("animal"))
		{
			if (Q2.equals("yes"))
			{
				System.out.println("Is it a MOOSE?");
			}
			if (Q2.equals("no"))
			{
				System.out.println("Is it a SQUIRREL?");	
			}
		}

		if (Q1.equals("vegetable"))
		{
			if (Q2.equals("yes"))
			{
				System.out.println("Is it a WATERMELON?");
			}
			if (Q2.equals("no"))
			{
				System.out.println("Is it a CARROT?");	
			}
		}
		
		if (Q1.equals("mineral"))
		{
			if (Q2.equals("yes"))
			{
				System.out.println("Is it a CAMARO?");
			}
			if (Q2.equals("no"))
			{
				System.out.println("Is it a PAPER CLIP?");	
			}
		}
	}

}
