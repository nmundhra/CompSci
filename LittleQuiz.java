/*
 * LittleQuiz.java
 * 
 */
import java.util.Scanner;

public class LittleQuiz {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String ready;
		int sel, score = 0;
		
		System.out.print("Are you ready for quiz? " );
		ready = keyboard.next();
		
		System.out.println("Okay, here it comes!");
		System.out.println();
		System.out.println("What is the capital of Alaska?");
		System.out.println("     1) Melbourn     ");
		System.out.println("     2) Anchorage     ");
		System.out.println("     3) Juneau     ");
		System.out.println();
		System.out.print("> ");
		sel = keyboard.nextInt();
		System.out.println();
		if (sel == 3)
		{
			score += 1;
			System.out.println("That's right");
		}
		else 
		{
			System.out.println("Sorry, the capital of Alaska is Juneau");
		}
		System.out.println();
		System.out.println("Can you store a value of \"cat\" in a variable of type int?");
		System.out.println("     1) yes     ");
		System.out.println("     2) no     ");
		System.out.println();
		System.out.print("> ");
		sel = keyboard.nextInt();
		System.out.println();
		if (sel == 2)
		{
			score += 1;
			System.out.println("That's right");
		}
		else 
		{
			System.out.println("Sorry, \"cats\" is a String. ints can only store numbers.");
		}
		System.out.println();
		System.out.println("What is the result of 9+6/3?");
		System.out.println("     1) 5     ");
		System.out.println("     2) 11     ");
		System.out.println("     2) 15/3     ");
		System.out.println();
		System.out.print("> ");
		sel = keyboard.nextInt();
		System.out.println();
		if (sel == 2)
		{
			score += 1;
			System.out.println("That's correct");
		}
		else 
		{
			System.out.println("Sorry, its 11");
		}
		System.out.println();
		System.out.println();
		System.out.println("Overall, you got " + score + " out of 3 correct");
		System.out.println("Thanks for playing!");
	}
}

