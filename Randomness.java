/*
 * Randomness.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 */
import java.util.Random;

public class Randomness {
	
	public static void main (String[] args) {
		
		//when giving seed number in Random function, the random numbers are all same. they are not changing.
		Random r = new Random();
		//if One (1) is not added to the r.nextInt(), the range of the numbers will start from zero (0).
		//the range is actuall from 0 to 9, but adding 1 to it change the range from 1 to 10
		//if I add 3 to the function, the range will change to 3 to 12.
		int x = 1 + r.nextInt(10);
		
		System.out.println("My random number is " + x);
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}

