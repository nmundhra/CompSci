/*
 * BasicArrays1.java
 * 
 * Create an array that can hold ten integers. Fill up each slot of the array with the number -113. 
 * Then display the contents of the array on the screen.
 * This time, you must use a loop, to put the values in the array and also to display them. 
 * Also, in the condition of your loop, you should not count up to a literal number. 
 * Instead you should use the length field of your array. 
 * 
 */


public class BasicArrays1 {
	
	public static void main (String[] args) {
		
		int num[] = new int[10];
		
		for (int i=0;i<num.length;i++)
		{
			num[i] = -113;
			System.out.format("Slot %d contains a %d%n",i,num[i]);
		}
/*	for (int j=0;j<num.length;j++)
		{
			System.out.format("Slot %d contains a %d%n",j,num[j]);
		} 
*/
	}
}

