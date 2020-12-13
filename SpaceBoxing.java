/*
 * SpaceBoxing.java
 * 
 */
import java.util.Scanner;

public class SpaceBoxing {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int weight;
		double gravity, req_weight;
		int option;
		
		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextInt();
		
		System.out.println();
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars    3. Jupiter   ");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune   ");
		System.out.println();
		System.out.print("Which planet are you visiting: ");
		option = keyboard.nextInt();
		
		if ( option == 1 )
		{
			gravity = 0.78;
		}
		else if ( option == 2 )
		{
			gravity = 0.39;
		}
		else if ( option == 3 )
		{
			gravity = 2.65;
		}
		else if ( option == 4 )
		{
			gravity = 1.17;
		}
		else if (option == 5 )
		{
			gravity = 1.05;
		}
		else if (option == 6 )
		{
			gravity = 1.23;
		}
		else 
		{
			gravity = 1.0;
		}
		
		req_weight = weight * gravity;
		System.out.println();
		System.out.println("Your weight would be " + req_weight + " pounds on that planet");
	}
}

