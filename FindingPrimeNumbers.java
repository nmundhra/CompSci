/*
 * FindingPrimeNumbers.java
 * 
 * Write a function like so:
 * public static boolean isPrime( int n )
 * The function should return the value true if n is a prime and false otherwise.
 * Remember that a number is prime if is isn't evenly divisible by anything except for 1 and itself. 
 * You can figure this out by using a for loop inside the function.
 * Make the for loop run through all the numbers from 2 up to n. 
 * Inside the loop, use an if statement that determines if n is evenly divisible by your loop control variable.
 * If you find any number which divides it evenly, you can go ahead and return false from the function without finishing the loop.
 * If the loop finishes and doesn't find any numbers which divide it, then return true from the function.
 * After you finish writing the function write a main() that contains another for loop. 
 * Have it print out all the numbers from 2 to 20, and mark each prime number with a "<".
 * 
 */


public class FindingPrimeNumbers {
	
	public static void main (String[] args) {
		
		for (int i = 2; i <= 100; i++ )
		{
			if (isPrime(i))
				//System.out.println(i + " <");
			//else 
				System.out.println(i);
		}
	}
	
	public static boolean isPrime( int n ) {
		
		if (n == 0 || n == 1)
			return false;
			
		for (int i = 2; i < n; i++ )
		{
			if (n % i == 0)
				return false;
		}
		
		return true;
			
	}
	
}

