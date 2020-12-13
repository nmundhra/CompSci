/*
 * BasicArrays2.java
 * 
 * Create an array that can hold ten integers. Fill up each slot of the array with a random number from 1 to 100. 
 * Then display the contents of the array on the screen. You must use a loop.
 * And, like last time, you must use the length field of your array and not a literal number (like 10) in the condition of the loop.
 * 
 */
import java.util.Random;

public class BasicArrays2 {
	
	public static void main (String[] args) {
		
		Random r = new Random();
		int[] num = new int[10];
		
		for (int i=0; i<num.length;i++)
		{
			num[i] = 1 + r.nextInt(100);
			System.out.format("Slot %d contains a %d%n", i , num[i]);
		}
	}
}

