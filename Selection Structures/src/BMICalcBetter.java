import java.util.Scanner;

public class BMICalcBetter 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		int feet, inches;
		double weight, height, heightM, weightKG, BMI;
		
		System.out.println("BMI (Body Mass Index) is a way of representing your size.");
		System.out.println("");
		
		System.out.print("How many feet tall are you ?");
		feet = keyboard.nextInt();
		
		System.out.print("How many inches? ");
		inches = keyboard.nextInt();
		
		System.out.print("How many pounds do you weigh? ");
		weight = keyboard.nextDouble();
		
		System.out.println("");
		
		height = feet + (inches/12);
		weightKG = weight * .4536;
		heightM = height * .3048;
		BMI = ( weightKG ) / ( heightM* heightM);
		System.out.println("Your BMI is: " + BMI );
		
		if ( BMI < 18.5 )
		{
			System.out.println("You are underweight.");	
		}
		if ( BMI >= 18.5 && BMI <= 24.9 )
		{
			System.out.println("You are normal.");	
		}
		if ( BMI >= 24.9 && BMI <= 29.9 )
		{
			System.out.println("You are overweight.");	
		}
		if ( BMI > 30.0 )
		{
			System.out.println("You are obese.");	
		}
		
	}

}
