/*
 * FizzBuzz.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and five print "FizzBuzz".
 * 
 */


public class FizzBuzz {
	
	public static void main (String[] args) {
		
		for (int n = 1; n <= 100; n++ )
		{
			if (n % 3 == 0 && n % 5 == 0 )
				System.out.println("FizzBuzz");
			else if (n % 3 == 0 ) 
				System.out.println("Fizz");
			else if (n % 5 == 0 )
				System.out.println("Buzz");
			else
				System.out.println(n);
		}
			
	}
}

