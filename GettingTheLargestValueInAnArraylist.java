/*
 * GettingTheLargestValueInAnArraylist.java
 * 
 * Write a program that creates an ArrayList which can hold Integers. Fill the ArrayList with random numbers from 1 to 100. 
 * Display the values in the ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, 
 * and display that value.
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValueInAnArraylist {
	
	public static void main (String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++)
			list.add(1 + r.nextInt(100));
			
		System.out.println("ArrayList: " + list);
		
		int largest = searchLargest(list);
		
		System.out.println("Largest value is : " + largest);
	}
	
	public static int searchLargest(ArrayList<Integer> list) {
		
		int num = 0;
		if (list != null)
		{
			num = list.get(0);
		}
		for (int i=0;i<list.size();i++)
		{
			if (num < list.get(i))
				num = list.get(i);
		}
		return num;
	}
}

