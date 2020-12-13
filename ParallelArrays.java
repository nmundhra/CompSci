/*
 * ParallelArrays.java
 * 
 * Create three arrays to store data about five people. The first array should be Strings and should hold their last names. 
 * The next array should be doubles and should hold a grade average (on a 100-point scale).
 *  The last array should be ints, should hold their student id numbers.
 * Give each of the arrays values (using array initializers). Then print the values of all three arrays on the screen.
 * Finally, ask the user for an ID number to lookup. Search through the ID array until you find that ID, 
 * and then print out the values from the same slot number of the other two arrays.
 *  
 */
import java.util.Scanner;

public class ParallelArrays {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String[] lname = {"Mitchelle","Oritz","Luu","Zimmerman","Brooks"};
		double[] grades = {99.0,98.1,95.76,99.2,97.1};
		int[] id = {123456,123457,123458,123459,123450};
		
		System.out.println("Values: ");
		for (int i=0;i<5;i++)
		{
			System.out.format("	%s %.1f %d%n", lname[i], grades[i], id[i]);
		}
		
		System.out.println();
		System.out.print("ID number to find: ");
		int value = keyboard.nextInt();
		int slot = 0;
		
		for (int i=0;i<id.length;i++)
		{
			if (id[i] == value)
			{
				slot = i;
			    break;
			}
		}
		
		System.out.format("%nFound in slot %d",slot);
		System.out.format("%n	Name: %s", lname[slot]);
		System.out.format("%n	Average: %s", grades[slot]);
		System.out.format("%n	ID: %s", id[slot]);
	}
}

