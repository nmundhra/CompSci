/*
 * BasicArrayList1.java
 * 
 * Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList. 
 * Then display the contents of the ArrayList on the screen.
 * This time, you must use a loop, both to fill up the ArrayList and to display it.
 * Also, in the condition of your loop, you should not count up to a literal number. 
 * Instead you should use the size() of your ArrayList.
 */
import java.util.ArrayList;

public class BasicArrayList1 {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++)
		{
			list.add(-113);
		}
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println("Slot " + i + " contains a " + list.get(i));
		}
		
	}
}

