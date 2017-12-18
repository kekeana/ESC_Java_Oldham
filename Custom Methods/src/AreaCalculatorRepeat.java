import java.util.Scanner;

public class AreaCalculatorRepeat
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		int shape;
		double area;
		
		System.out.println("Shape Area Calculator (c) 2018 Keana Oldam ECS");
		System.out.println();
		System.out.println(" 1) Triangle");
		System.out.println(" 2) Rectangle");
		System.out.println(" 3) Square");
		System.out.println(" 4) Circle");
		System.out.println(" 5) Quit");
	
		System.out.println("Which Shape: ");
		shape = keyboard.nextInt();
		
		do
		{
			
			if (shape ==1)
			{
				area = triangle(shape);
				System.out.println("The area is " + area);
			}
			
			if (shape ==2)
			{
				area = rectangle(shape);
				System.out.println("The area is " + area);
			}
			
			if (shape ==3)
			{
				area = square(shape);
				System.out.println("The area is " + area);
			} 
			
			if (shape ==4)
			{
				area = circle(shape);
				System.out.println("The area is " + area);
			} 
			
			System.out.println("Which Shape: ");
			shape = keyboard.nextInt();
			
		}while (shape != 5);
		
		if (shape ==5)
		{
			quit(shape);
		}
	}
	
	public static double triangle(int shape)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int base, height;
		double area;
		
		System.out.print("Base: ");
		base= keyboard.nextInt();
		System.out.print("Height: ");
		height= keyboard.nextInt();
		
		
		area=.5*base*height;
		
		return area;
		
	}
	
	public static double rectangle(int shape)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int length, width;
		double area;
		
		System.out.print("Length: ");
		length = keyboard.nextInt();
		System.out.print("Width: ");
		width = keyboard.nextInt();
		
		area = length * width;
		
		return area;
	}
	
	public static double square(int shape)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int side;
		double area;
		
		System.out.print("Side Length: ");
		side = keyboard.nextInt();
		
		area = side*side;
		
		return area;

	}
	
	public static double circle(int shape)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int radius;
		double area;
		
		System.out.print("Radius: ");
		radius = keyboard.nextInt();
		
		area = radius * radius * Math.PI;

		return area;
		
	}
	
	public static void quit(int choice)
	{
		
		System.out.print("Well what does that say abut you... Goodbye!!");
	}

}