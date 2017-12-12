import java.util.Scanner;

public class CountingMachineRevisited 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int from, to, by;
		
		System.out.print("Count from: ");
		from = keyboard.nextInt();
		System.out.print("Count to: ");
		to = keyboard.nextInt();
		System.out.print("Count by: ");
		by = keyboard.nextInt();
		
		for (int n = from; n <= to; n = n +by)
		{
			System.out.print(n + " " );
		}
	}
}
