/*
 * EvennessFunction.java
 * 
 * Write a function like so:
	public static boolean isEven( int n )
 * The function should return the value true if n is an even number (evenly divisible by 2) and false otherwise.
 * Also, write
 * public static boolean isDivisibleBy3( int n )
 * The function should return the value true if n is evenly divisible by 3 and false otherwise.
 * Write a main() that contains a for loop to generate all the numbers from 1 to 20. 
 * Use if statements inside the loop to mark the number with a "<" if it's even, with a "=" if it's evenly divisible by 3, 
 * and with both if it's divisible by both 2 and 3.
 * 
 */


public class EvennessFunction {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 20; i++ )
		{
			if (isEven(i) && isDivisibleBy3(i))
				System.out.println(i + " <=");
			else if (isEven(i))
				System.out.println(i + " <");
			else if (isDivisibleBy3(i))
				System.out.println(i + " =");
			else
				System.out.println(i);
		}
	}
	
	public static boolean isEven(int n) {
		
		if (n % 2 == 0 )
			return true;
		
		return false;
		
	}
	
	public static boolean isDivisibleBy3(int n ) {
		
		if ( n % 3 == 0 )
			return true;
			
		return false;
	}
	
}

