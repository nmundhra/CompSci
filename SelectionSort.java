/*
 * SelectionSort.java
 * 
 */
import java.util.Random;

public class SelectionSort
{
	public static void selection_sort( int[] a )
	{
		for (int i=0;i<a.length-1;i++)
		{
			int minIndex = i;
			for (int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[minIndex])
				{
					minIndex = j;
				}
			}
			if (minIndex != i)
				swap(a,i,minIndex);
		}
	}


	public static void swap( int[] a , int i, int j )
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		selection_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
