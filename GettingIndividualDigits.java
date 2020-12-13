/*
 * GettingIndividualDigits.java
 * 
 * Use nested for loops to generate a list of all the positive two digit numbers. 
 * Display the numbers, and the sums of their digits.
 * 
 */


public class GettingIndividualDigits {
	
	public static void main (String[] args) {
		
		String num = "";
		for (int i=1; i<10; i++ )
		{
			for (int j=0; j<10; j++)
			{
				num = num + i + j;
				System.out.println(num + ", " + i + "+" + j + " = " + (i+j));
				num = "";
			}
		} 
	}
}

