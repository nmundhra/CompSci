/*
 * CollatzSequence.java
 * 
 * Take any natural number n.
 * If n is even, divide it by 2 to get n / 2.
 * If n is odd, multiply it by 3 and add 1 to get 3n + 1.
 * Repeat the process indefinitely.
 * In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1. 
 * This is widely believed to be true, but has never been formally proved.
 * Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number. 
 * Stop when you reach 1.
 */
import java.util.Scanner;

public class CollatzSequence {
	
	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// l is used to track the number of elements in the line. we want 9 elements per line. so after every 9 elements are 
		//discovered, program will print the line.

		int l = 0, num = 0;
		int largest = 0;
		
		System.out.print("Starting number: ");
		num = keyboard.nextInt();

		while ( num != 1 )
		{
			System.out.print(num + "	");
			l++;
			if ( num % 2 == 0 )
				num = num / 2;
			else
				num = (3 * num ) + 1;
			
			if ( num > largest )
				largest = num;
				
			if ( l % 10 == 0 )
				System.out.println();
		}
		System.out.print(num);
		
		if (l == 0)
			largest = num;
				
		System.out.println("\n\nTerminated after " + l + " steps.");
		System.out.println("Largest value is " + largest );
	}
}

