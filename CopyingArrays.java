/*
 * CopyingArrays.java
 * 
 * Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array. It should copy all the elements of that array into another array of the same size. Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.

Create an array of ten integers
Fill the array with ten random numbers (1-100)
Copy the array into another array of the same capacity
Change the last value in the first array to a -7
Display the contents of both arrays
 * 
 */
import java.util.Random;

public class CopyingArrays {
	
	public static void main (String[] args) {
		Random r = new Random();
		
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		
		//creating first array
		for (int i=0;i<num1.length;i++)
			num1[i] = 1 + r.nextInt(100);
		
		//copying	
		for (int i=0;i<num1.length;i++)
			num2[i] = num1[i];
		
		num1[num1.length - 1] = -7;
		
		System.out.print("Array1: ");
		for (int i=0;i<num1.length;i++)
			System.out.print(num1[i] + " ");
			
		System.out.println();
		System.out.print("Array2: ");
		for (int i=0;i<num2.length;i++)
			System.out.print(num2[i] + " ");
	}
}

