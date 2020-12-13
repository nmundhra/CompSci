/*
 * countingMachine.java
 * Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
 * 
 */
import java.util.Scanner;

public class countingMachine {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count to: ");
		int num = keyboard.nextInt();
		
		for (int n = 0; n <= num; n++)
		{
			System.out.print(n + " ");
		}
	}
}

