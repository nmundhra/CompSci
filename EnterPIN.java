/*
 * EnterPIN.java
 * 
 * Assignments turned in without these things will receive no credit.
 * 	How is a while loop similar to an if statement?
 *  How is a while loop different from an if statement?
 * Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
 * Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
 * (Put the entry = keyboard.nextInt(); back before you turn in the assignment.)

 * Answers:
 * While loop is similar to if that both executes the block if the condition is true. 
 * While loop is different from if that its an iterative loop i.e control goes back to while unitl condition becomes false.
 * becasue the entry is already defined outside the while.
 * if we remove the entry, the loop goes in infinite loop
 * 
 */

import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}
