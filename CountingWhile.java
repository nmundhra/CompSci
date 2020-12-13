/*
 * What does n++ do? Remove it and see what happens. (Then put it back.) -- it increments the value of n by 1.
 * Change the code so that the loop repeats ten times instead of five.
 * See if you can change the code so that the message still prints ten times, but the numbers in front count by tens, like so:
 * Change the code so that it asks the person how many times to display the message. Then, print it that many times. 
 * Still count by tens.
* 
*/
import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print("How many times? ");
		int count = keyboard.nextInt();

		int n = 0;
		while ( n < count )
		{
			System.out.println( ((n+1)*10) + ". " + message );
			n++;
		}

	}
}
