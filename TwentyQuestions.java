/*
 * TwentyQuestions.java
 * 
 */
import java.util.Scanner;

public class TwentyQuestions {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String ans1, ans2;
		String object;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I will try to guess it.");
		System.out.println();
		
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print("> ");
		ans1 = keyboard.next();
		System.out.println();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		ans2 = keyboard.next();
		System.out.println();
		//The == operator checks to see if the two strings are exactly the same object. 
		//The .equals() method will check if the two strings have the same value.
		if (ans1.equals("animal") && ans2.equals("yes"))
			object = "dog";
		else if (ans1.equals("animal") && ans2.equals("no") )
			object = "mouse";
		else if (ans1.equals("vegetable") && ans2.equals("yes") )
			object = "drumstick";
		else if (ans1.equals("vegetable") && ans2.equals("no") )
			object = "potato";
		else if (ans1.equals("mineral") && ans2.equals("yes") )
			object = "wood";
		else if (ans1.equals("mineral") && ans2.equals("no") )
			object = "stone";
		else
			object = "idiot";
			
		System.out.println();
		System.out.println("My guess is that you are thinking of a " + object );
		System.out.println("I would ask you if I'm right, but i dont actually care");
				
	}
}

