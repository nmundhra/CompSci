/*
 * SafeSquareRoot.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 * Write a program to take the square root of a number typed in by the user. 
 * Your program should use a loop to ensure that the number they typed in is positive. 
 * If the number is negative, you should print out some sort of warning and make them type it in again.
 * Note that it is possible to do this program with either a while loop or a do-while loop. 
 * (Though personally, I think this one is easier with a while loop.)
 * You can get the square root of a number n with Math.sqrt(n). 
 * Make sure you don't do this until the loop is done and you know for sure you've got a positive number.
 * 
 */
import java.util.Scanner;

public class SafeSquareRoot {
	
	public static void main (String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		double sRoot = 0.0;
		
		System.out.println("SQUARE ROOT!!!");
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();
		
		while (!(num > 0))
		{
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			num = keyboard.nextInt();
		}
		
		sRoot = Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + sRoot + ".");
	}
}

