/*
 * BasicNestedLoops.java
 * 
 * Use some simple nested for loops to generate all possible coordinates from (0,0) up to (5,5).
 */


public class BasicNestedLoops {
	
	public static void main (String[] args) {
		
		for (int x=0; x<=5; x++ )
		{
			for (int y=0; y<=5; y++)
				{
					System.out.print("(" + x + "," + y + ") ");
				}
				System.out.println();
		}		
	}
}

