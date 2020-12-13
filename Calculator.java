/*
 * Calculator.java
 * 
 * Write a calculator program. A minimal calculator will support the following functions:
numbers with decimals (not just integers)
addition (1 + 2 is 3)
subtraction (12 - 4 is 8)
multiplication (33 * 2 is 66)
division (3 / 8 is 0.375)
exponents (2 ^ 3 is 8)
error messages when you do something wrong
Your calculator should keep on running until explicitly told to quit. I suggest typing a zero as the first operand to cause it to quit
 */
import java.util.Scanner;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int a = 0, b = 0, c = 0;
		double d = 0.0;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextInt();
			op = keyboard.next();
			if (!(op.equals("!")))
				b  = keyboard.nextInt();

			if ( op.equals("+") )
			{
				c = addition(a,b);
				System.out.println(c);
			}
			else if (op.equals("-") )
			{
				c = subtraction(a,b);
				System.out.println(c);
			}
			else if (op.equals("*") )
			{
				c = multiplication(a,b);
				System.out.println(c);
			}
			else if (op.equals("/") )
			{
				d = division(a,b);
				System.out.println(d);
			}
			else if (op.equals("^") )
			{
				c = exponent(a,b);
				System.out.println(c);
			}
			else if (op.equals("%") )
			{
				c = modulus(a,b);
				System.out.println(c);
			}
			else if (op.equals("!") )
			{
				c = factorial(a);
				System.out.println(c);
			}
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
				d = 0.0;
			}
		} while ( a != 0 );
		System.out.println("Goodbye, now");
	}
	
	public static int addition(int a, int b) {
		return (a + b );
	}
	
	public static int subtraction (int a, int b) {
		return ( a - b );
	}
	
	public static int multiplication ( int a, int b ) {	
		return (a * b);
	}
	
	public static double division(int a, int b ) {
		return (a * 1.0) / b;
	}
	
	public static int exponent (int a, int b ) {
		return (int)(Math.pow(a,b));
	}
	
	public static int modulus(int a, int b) {
		
		return ( a % b );
	}
	
	public static int factorial(int a ) {
		int result = 1;
		for (int i = a; i >= 1; i-- )
		{
			result = result * i;
		}
		return result;
	}
	
	public static double square_roots(int a) {
		return (Math.sqrt(a));
	}
	
	public static int negation(int a ) {
		
		return (-1 * a);
	}
}
