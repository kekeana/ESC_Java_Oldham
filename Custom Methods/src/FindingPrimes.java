import java.util.Scanner;
	
public class FindingPrimes 
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		int low, high;
		
		System.out.println("We are going to find some Primes!");
		System.out.println("What range would you like them in?");
		System.out.println("(only positive integer 2 or greater)");
		
		System.out.println();
		
		System.out.print("Low end: ");
		low = keyboard.nextInt();
		System.out.print("High end: ");
		high = keyboard.nextInt();
		
		for (int n = low; n<= high; n = n+1)
		{

			System.out.println(n);
			int number= primes(n);
		}
		
		if (check)
		{
			System.out.print(n + "<");
		}
		else
		{
			System.out.println(n);
		}
		
	}
	
	public static boolean primes(int n)
	{
		boolean check = true;
		
		for (int p = 2; p<n; p++)
		{
			if (n%p ==0)
			{
				check = false;
				break;
			}
		}
		
		return check;
	}

}
