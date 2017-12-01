
public class MoreVariablesAndPrinting 
{
	public static void main(String[] args)
		{
			String myName, myEyes, myTeeth, myHair;
			int myAge, myHeight, myWeight;
			double myHeightCm,  myWeightKg;
			
			myName =" Keana R. Oldham";
			myAge = 17;    // not a lie
			myHeight = 67; // inches
			myHeightCm= myHeight * 2.54;  // centimeters
			myWeight =122; //lbs
			myWeightKg= myWeight * .454; //kilograms
			myEyes = "Blue hazel mix";
			myTeeth = "White";
			myHair= "Brown";
			
			System.out.println("Let's talk about " + myName + ".");
			System.out.println("She's " + myHeight + " inches (or " + myHeightCm +" cm) tall.");
			System.out.println("She's " + myWeight + " pounds (or " + myWeightKg +" kg) heavy.");
			System.out.println("Actually, that's not too heavy.");
			System.out.println("She's got a " + myEyes + " in her eyes and " + myHair + " hair.");
			System.out.println("Her teeth are usually " + myTeeth + ", depending on the coffee,");
			
			System.out.println("If I add " + myAge +", " + myHeight + ", and " + myWeight + ", I get " 
					+ (myAge + myHeight + myWeight) + ".");
			
			}
}
