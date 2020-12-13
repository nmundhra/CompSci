/*
 * AreaCalculator.java
 * 
 * Write a program to calculate the area of four different geometric shapes: triangles, squares, rectangles, and circles. 
 * You must use functions. Here are the functions you should create:
 * 
 * public static double area_circle( int radius )              // returns the area of a circle
public static int area_rectangle( int length, int width )   // returns the area of a rectangle
public static int area_square( int side )                   // returns the area of a square
public static double area_triangle( int base, int height )  // returns the area of a triangle
 * 
 * Your program should present a menu for the human to choose which shape to calculate, 
 * then ask them for the appropriate values (length, width, radius, etc.). 
 * Then it should pass those values to the appropriate function and display the resulting area.
 * Notice that you must not input the values inside the functions, and you must not display the values inside the functions. 
 * All input and output must be in the  main(), and values must be passed to the functions and returned from them. 
 * 
 * You'll need the value of π for area_circle(); feel free to use the built-in double variable called Math.PI.
 * The menu should keep looping until the human chooses to quit.
 * 
 */
import java.util.Scanner;

public class AreaCalculator {
	
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		int radius;
		int length, width;
		int side;
		int base, height;
		
		System.out.println("Shape Area Calculator, copyright (c) 2018");
		
		do 
		{
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			System.out.println("1) Triangle ");
			System.out.println("2) Rectangle ");
			System.out.println("3) Square ");
			System.out.println("4) Circle ");
			System.out.println("5) Quit ");
			System.out.print("Which shape: ");
			choice = keyboard.nextInt();
			
			if (choice == 1 )
			{
				System.out.print("\nBase : ");
				base = keyboard.nextInt();
				System.out.print("\nHeight: ");
				height = keyboard.nextInt();
				System.out.println("\nThe area is " + area_triangle(base,height) + ".\n");
			}
			else if (choice == 2 )
			{
				System.out.print("\nLength: ");
				length = keyboard.nextInt();
				System.out.print("\nWidth: ");
				width = keyboard.nextInt();
				System.out.println("\nThe area is " + area_rectangle(length,width) + ".\n");
			}
			else if (choice == 3 )
			{
				System.out.print("\nSide: ");
				side = keyboard.nextInt();
				System.out.println("\nThe area is " + area_square(side) + ".\n");
			}
			else if (choice == 4 )
			{
				System.out.print("\nRadius: ");
				radius = keyboard.nextInt();
				System.out.println("\nThe area is " + area_circle(radius) + ".\n");
			}
			else if (choice == 5 )
			{
				System.out.println("\nGoodbye");
			}
			else 
			{
				System.out.println("\nWrong choice, try again!\n");
			}
		} while (choice != 5 );
				
	}
	
	public static double area_circle(int radius) {
		
		return (Math.PI * radius * radius);
		
	}
	
	public static int area_rectangle(int length, int width) {
		
		return (length * width);
	}
	
	public static int area_square(int side) {
	
		return (side * side );
	}
	
	public static double area_triangle(int base, int height) {
		
		return (0.5 * base * height );
	}
	
}

