import java.util.Scanner;

public class HowOldSpecifically 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print("Ok, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		if (age <16)
		{
			System.out.print("You cannot drive.");
		}
		
		if (age >= 16 && age <= 17 )
		{
			System.out.print("You can drive but not vote.");
		}
		
		if (age >= 18 && age <=24 )
		{
			System.out.print("You can vote but not rent a car.");
		}
		
		if (age >= 25)
		{
			System.out.print("You can pretty much do what you want.");
		}

	}

}
