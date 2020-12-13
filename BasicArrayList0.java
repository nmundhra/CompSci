/*
 * BasicArrayList0.java
 * 
 * Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList. 
 * Then display the contents of the ArrayList on the screen.
 * Do not use a loop. Also, do not use any variable for the index; you must use literal numbers to refer to each slot.
 */
import java.util.*;

public class BasicArrayList0 {
	
	public static void main (String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(-113);
		list.add(-113);
		list.add(-113);
		list.add(-113);
		list.add(-113);
		
		//int item = list.remove(0);
		System.out.println("Total items in the list are : " + list.size());
		System.out.println("Slot 0 contains " + list.get(0));
		System.out.println("Slot 1 contains " + list.get(1));
		System.out.println("Slot 2 contains " + list.get(2));
		System.out.println("Slot 3 contains " + list.get(3));
		System.out.println("Slot 4 contains " + list.get(4));
		
		System.out.println("Total items in the list are : " + list.size());
		
		Double d = new Double(6.02345);
		System.out.println("Value of Double is : " + d);
	}
}

