/*
 * BasicArrayList2.java
 * 
 * Create an ArrayList of Integers. Fill up the list with ten random numbers, each from 1 to 100. 
 * Then display the contents of the ArrayList on the screen.
 * You must use a loop to fill up the list. However, you may display it the easy way (no loop needed) like so:
 * System.out.println( "ArrayList: " + whateverYourArrayListVariableIsCalled );
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList2 {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i=0; i<10; i++)
		{
			list.add(1 + r.nextInt(100));
		}
		
		System.out.println("ArrayList : " + list);
		
	}
}

