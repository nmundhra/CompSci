/*
 * FindingAValueInAnArraylist.java
 * 
 * Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. 
 * Search through the ArrayList, and if the item is present, say so. 
 * It is not necessary to display anything if the value was not found. 
 * If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.
 * 
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArraylist {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
			list.add(1 + r.nextInt(100));
			
		System.out.println("ArrayList: " + list);
		System.out.print("Value to find: ");
		int value = keyboard.nextInt();
		
		for (int item : list)
		{
			if (item == value)
			{
				System.out.println(value + " is in the ArrayList");
			}
		}
	}
}

