/*
 * BabyCalculator.java
 * 
 * Write a calculator program that allows the user to add, subtract, multiply or divide two numbers. 
 * (This is sometimes called a "four-function" calculator.)
 * The program must loop until they enter a zero as the first number.
 * 
 */
import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c = 0;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
			else if (op.equals("-") )
				c = a - b;
			else if (op.equals("*") )
				c = a * b;
			else if (op.equals("/") )
				c = a / b;
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}
			if (a != 0)
				System.out.println(c);

		} while ( a != 0 );
		System.out.println("Goodbye, now");
	}
}
