/*
 * WhereIsIt.java
 * 
 * Create an array that can hold ten integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. Search through the array, and if the item is present, 
 * give the slot number where it is located. If the value is not in the array, display a single message saying so. 
 * If the value is present more than once, you may either display the message as many times as necessary, 
 * or display a single message giving the last slot number in which it appeared.
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class WhereIsIt {
	
	public static void main (String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int[] num = new int[10];
		
		System.out.print("Array: ");
		for (int i=0;i<num.length;i++)
		{
			num[i] = 1 + r.nextInt(50);
			System.out.print(num[i] + " ");
		}
		
		System.out.print("\nValue to find: ");
		int value = keyboard.nextInt();
		System.out.println();
		boolean found = false;
		for (int i=0;i<num.length;i++)
		{
			if (num[i] == value)
			{
				System.out.format("%d is in slot %d%n",value, i);
				found = true;
			}
		}
		if (!found)
		{
			System.out.format("%d is not in the array",value);
		}
		
	}
}

