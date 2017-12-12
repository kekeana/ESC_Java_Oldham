import java.util.Scanner;

public class CountingMachine 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int input;
		
		System.out.print("Count to: ");
		input = keyboard.nextInt();
		
		for (int n = 0; n <= input; n = n +1)
		{
			System.out.print(n + " " );
		}

	}

}
