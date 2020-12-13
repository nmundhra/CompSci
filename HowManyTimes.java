/*
 * HowManyTimes.java
 * 
 * Create an array that can hold ten integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. 
 * Search through the array, and count the number of times the item is found.
 * 
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class HowManyTimes {
	
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
		int count = 0;
		for (int i=0;i<num.length;i++)
		{
			if (num[i] == value)
				count++;
		}
		System.out.format("%d was found %d times%n",value, count);
	}
}

