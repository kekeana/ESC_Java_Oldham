import java.util.Scanner;

public class Ageln5 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.println("");
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("");
		
		System.out.print("Wow you'll be " + (age +5) + " in five years! And five years ago you were " 
		+ (age-5) + "! Imagine that!"  );

	}

}
