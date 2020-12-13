/*
 * NumberPuzzle1.java
 * 
 * Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
 */


public class NumberPuzzle1 {
	
	public static void main (String[] args) {
		
		for (int i=10;i<=99;i++)
			{
				for(int j=10;j<99;j++)
				{
					if (((i + j) == 60) && ((i - j ) == 14))
						System.out.print("(" + i + "," + j + ")");
				}
			}	
	}
}

