import java.util.Scanner;

public class DoWhileSwimming 
{

	public static void main(String[] args) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS";
		
		double minimumTemp = 79.0;  // degrees Fahrenheit
		double currentTemp;
		double savedTemp;
		int swimTime;
		
		System.out.print("What is the current water temperature? ");
		currentTemp = keyboard.nextDouble();
		savedTemp = currentTemp; 
		
		System.out.println("\nOkay, so the current water temperature is " 
		+ currentTemp + "F.");
		System.out.println( swimmer1 + " approaches the lake....");
		
		swimTime = 0;
		while (currentTemp >= minimumTemp)
		{
			System.out.print("\t" + swimmer1 + " swims for a bit.");
			swimTime++;
			System.out.println(" Swim time: " + swimTime + " min.");
			Thread.sleep(600);
			currentTemp -= 0.5;
			System.out.println("\tThe current water temperature is now " 
			+ currentTemp + "F.");
		}
		
		System.out.println(swimmer1 + " stops swimming. Total swim time: "
			+ swimTime + " min.");
		
		currentTemp = savedTemp;
		
		System.out.println("\nOkay, so the current water temperature is " 
				+ currentTemp + "F.");
		System.out.println(swimmer2 + " approaches the lake...");
		
		swimTime=0;
		do
		{
			System.out.print("\t" + swimmer2 + " swims for a bit.");
			swimTime++;
			System.out.println(" Swim time: " + swimTime + "min.");
			Thread.sleep(600);
			currentTemp -=0.5;
			System.out.println("\tThe current water temperature is now " + currentTemp + "F.");
		} while (currentTemp >= minimumTemp);
		
		System.out.println( swimmer2 + "stops swimming. Total swim time: " + 
		swimTime + " min.");

	}

}
