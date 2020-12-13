/*
 * RightTriangleChecker.java
 * 
 * Write a program to allow the user to enter three integers. 
 * You must use do-while or while loops to enforce that these integers are in ascending order, though duplicate numbers are allowed.
 * Tell the user whether or not these integers would represent the sides of a right triangle.
 * 
 */
import java.util.Scanner;

public class RightTriangleChecker {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int side1 = 0, side2 = 0, side3 = 0, num, prevNum = 0;
		int n = 1;
		System.out.println("Enter three integers:");

		do
		{
			System.out.print("Side " + n + ": ");
			num = keyboard.nextInt();
			if (n == 1)
			{
				side1 = num;
				prevNum = num;
				n++;
			} 
			else if (n == 2 && num >= side1) 
			{
				side2 = num;
				prevNum = num;
				n++;
			}
			else if (n == 3 && num >= side2 )
			{
				side3 = num;
				n++;
			}
			else
			{
				System.out.println(num + " is smaller than " + prevNum + ". Try again");
			}
		} while (n <= 3);
		
		System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
		//use Math.pow(d1,d2) to take the square
		if ( ((side1 * side1) + (side2 * side2)) == (side3 * side3) )
			System.out.println("These sides *do* make a right triangle. Yippy-Skippy!");
		else
			System.out.println("NO! These sides do not make a right triangle.");
			
	}
}

