/*
 * SortingValues.java
 * 
 * Use nested loops, an if statement, and some "swapping" code to rearrange the values in the array so that they're in order 
 * from smallest to largest.
 */
public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		for (int i=0;i<arr.length;i++ )
		{
			for (int j=i;j<arr.length ;j++ )
			{
				if (arr[i] > arr[j] )
				{
					int swap;
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
