import java.util.Scanner;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Shape Area Calculator (c) 2018 Keana Oldam ECS");
		System.out.println();
		System.out.println(" 1) Triangle");
		System.out.println(" 2) Rectangle");
		System.out.println(" 3) Square");
		System.out.println(" 4) Circle");
		System.out.println(" 5) Quit");
	}
	
	public static void triangle(int choice)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int base, height;
		double area;
		
		System.out.print("Base: ");
		base= keyboard.nextInt();
		System.out.print("Height: ");
		height= keyboard.nextInt();
		
		
		area=.5*base*height;
		System.out.print("The area is " + area);
		
		
		System.out.print("In the way Will Turner says, Goodbye!!");
		
	}
	
	public static void rectangle(int choice)
	{
		Scanner keyboard = new Scanner(System.in);
	}
	
	public static void square(int choice)
	{
		Scanner keyboard = new Scanner(System.in);
	}
	
	public static void cirlce(int choice)
	{
		Scanner keyboard = new Scanner(System.in);
	}
	
	public static void quit(int choice)
	{
		
	}

}
