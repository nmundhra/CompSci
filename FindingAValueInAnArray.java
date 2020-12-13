/*
 * FindingAValueInAnArray.java
 * 
 * Create an array that can hold ten integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. 
 * Search through the array, and if the item is present, say so. It is not necessary to display anything if the value was not found. 
 * If the item is in the array multiple times, it's okay if the program prints the message more than once.
 * 
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class FindingAValueInAnArray {
	
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
		for (int i=0;i<num.length;i++)
		{
			if (num[i] == value)
				System.out.format("%d is in the array%n",value);
		}
	}
}

