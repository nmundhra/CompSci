/*
 * DumbCalculator.java
 * 
 */
 import java.util.Scanner;

public class DumbCalculator {
	
	public static void main (String[] args) {
		double firstnum, secondnum, thirdnum;
		double result;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your first number? ");
		firstnum = keyboard.nextDouble();
		
		System.out.print("What is your second number? ");
		secondnum = keyboard.nextDouble();
		
		System.out.print("What is your third number? ");
		thirdnum = keyboard.nextDouble();
		System.out.println();
		
		result = (firstnum + secondnum + thirdnum) / 2;
		System.out.println("( " + firstnum + " + " + secondnum + " + " + thirdnum + " ) / 2 is... " + result);
	}
}

