import java.util.Scanner;

public class AddingValuesForLoop 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		System.out.print("Number: ");
		input = keyboard.nextInt();
		
		for (int n = 1; n <= input; n = n +1)
		{
			System.out.print(n + " " );
			sum ++;
		}
		
		System.out.print("The sum is " + sum );
		
		keyboard.close();
	}
}
