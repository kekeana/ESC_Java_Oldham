import java.util.Scanner;

public class DumbCalculator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double num1, num2, num3, answer;
		
		System.out.println("Let's find the average of a few numbers... ");
		
		System.out.println();
		
		System.out.println("What is the first number?");
		num1 = keyboard.nextDouble();
		
		System.out.println("What is the second number?");
		num2 = keyboard.nextDouble();
		
		System.out.println("What is the third number?");
		num3 = keyboard.nextDouble();
		
		System.out.println("The average of the three numbers is " + (num1 + num2 + num3)/3 );
	

	}

}
