import java.util.Scanner;

public class UserInputOfData 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name1, name2, login; 
		int grade, ID;
		double GPA;
		
		System.out.println("Please enter the following information so I can help you sell it for profit!");
		
		System.out.println("");
		
		System.out.print("First name: "  );
		name1= keyboard.next();
		
		System.out.print("Last name: "  );
		name2 = keyboard.next();
		
		System.out.print("Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		ID = keyboard.nextInt();
		
		System.out.print("Login: ");
		login = keyboard.next();
		
		System.out.print("GPA (0.0-4.0): ");
		GPA = keyboard.nextDouble();
		
		System.out.println("");
		
		System.out.println("Your information: ");
		
		System.out.println("			Login: " + login);
		
		System.out.println("			ID: " + ID);
		
		System.out.println("			Name: " + name2 + ", " + name1);
		
		System.out.println("			GPA: " + GPA);
		
		System.out.println("			Grade: " + grade);
		

		
		
		

	}

}
