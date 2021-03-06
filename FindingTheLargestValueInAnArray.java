/*
 * FindingTheLargestValueInAnArray.java
 * 
 * Write a program that creates an array which can hold ten values. Fill the array with random numbers from 1 to 100. 
 * Display the values in the array on the screen. Then use a linear search to find the largest value in the array, 
 * and display that value.
 * 
 */
import java.util.Random;
import java.util.Scanner;


public class FindingTheLargestValueInAnArray {
	
	public static void main (String[] args) {
		Random r = new Random();
		int[] num = new int[10];
		
		System.out.print("Array: ");
		for (int i=0; i<num.length;i++)
		{
			num[i] = 1 + r.nextInt(100);
			System.out.print(num[i] + " ");
		}
		
		int temp;
		temp = num[0];
		for (int i=1;i<num.length;i++)
		{
			if (num[i] > temp)
			{
				temp = num[i];
			}
		}
		System.out.format("%n%nThe largest value is %d", temp);
	}
}

