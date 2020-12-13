/*
 * XsAndYs.java
 * 
 * Write a program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5. 
 * (This means that x can't be an int.)
 */

public class XsAndYs {
	
	public static void main (String[] args) {
		
		System.out.println("x        y");
		System.out.println("----------------");
		for (double x = -10; x <= 10;x = x + 0.5)
		{
			double y = x * x;
			System.out.println(x + "	" + y);
		}
	}
}
