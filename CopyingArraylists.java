/*
 * CopyingArraylists.java
 * 
 * Write a program that creates an ArrayList of Integers. It should put ten random numbers from 1 to 100 in the ArrayList. It should copy all the elements of that ArrayList into another ArrayList of the same size. Then display the contents of both ArrayLists in any way you like.

Create an ArrayList of Integers
Fill the ArrayList with ten random numbers (1-100)
Copy each value from the ArrayList into another ArrayList of the same capacity
Change the last value in the first ArrayList to a -7
Display the contents of both ArrayLists
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class CopyingArraylists {
	
	public static void main (String[] args) {
		Random r = new Random();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		int i=0;
		while (i<10)
		{
			list1.add(1 + r.nextInt(100));
			i++;
		}
		
		int j=0;
		while (j<list1.size())
		{
			list2.add(list1.get(j));
			j++;
		}
		list1.set(j-1,-7);
		
		System.out.println("ArrayList1 : " + list1);
		System.out.println("ArrayList2 : " + list2);
	}
}

