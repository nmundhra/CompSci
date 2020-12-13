/*
 * SortingAnArrayList.java
 * 
 * Write a program that creates an ArrayList of Integers. Fill the ArrayList with random numbers from 10 to 99. 
 * Display the values in the ArrayList on the screen. 
 * Then using the sort of your choice, arrange the values from largest to smallest and display them again.
 * You must put the sorting code in its own function.
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class SortingAnArrayList {
	
	public static void main (String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<20;i++)
			list.add(10 + r.nextInt(99));
			
		System.out.println("ArrayList before: " + list);
		sortArrayList(list);
		System.out.println("ArrayList after: " + list);
	}
	
	public static void sortArrayList(ArrayList<Integer> list) {
		
		for (int i=0;i<list.size();i++)
		{
			for (int j=i;j<list.size();j++)
			{
				if (list.get(i) < list.get(j))
				{
					int temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}
}

