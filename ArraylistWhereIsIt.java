/*
 * ArraylistWhereIsIt.java
 * 
 * Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50. 
 * Display those values on the screen, and then prompt the user for an integer. 
 * Search through the ArrayList, and if the item is present, give the slot number where it is located. 
 * If the value is not in the ArrayList, display a single message saying so. 
 * If the value is present more than once, you may either display the message as many times as necessary, or display a single message giving the last slot number in which it appeared.
 * 
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistWhereIsIt {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++)
			list.add(1 + r.nextInt(100));
			
		System.out.println("ArrayList: " + list);
		System.out.print("Value to find: ");
		int value = keyboard.nextInt();
		boolean found = false;
		for (int item=0;item<list.size();item++)
		{
			if (list.get(item) == value)
			{
				System.out.println(value + " is in slot " + item);
				found = true;
			}
		}
		if (!found)
			System.out.println(value + " is not in the ArrayList");
	}
}
