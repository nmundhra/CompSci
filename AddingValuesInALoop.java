/*
 * AddingValuesInALoop.java
 * Write a program that gets several integers from the user. Sum up all the integers they give you. 
 * Stop looping when they enter a 0. Display the total at the end.
 */
import java.util.Scanner;

public class AddingValuesInALoop {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num, total = 0;
		
		System.out.println("I will add up the numbers you give me. Enter 0 to get sum");
		System.out.print("Number: ");
		num = keyboard.nextInt();
		
		while (num != 0)
		{
			total += num;
			System.out.println("The total so far is " + total );
			System.out.print("Number: ");
			num = keyboard.nextInt();
		}
		
		System.out.println("The total is " + total );	
	}
}

