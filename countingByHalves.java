/*
 * countingByHalves.java
 * 
 * Write a program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5. 
 * (This means that x can't be an int.)
 */
import java.util.Scanner;

public class countingByHalves {
	
	public static void main (String[] args) {
		
		System.out.println("x");
		System.out.println("--------");
		for (double d = -10; d <= 10;d = d + 0.5)
		{
			System.out.println(d);
		}
	}
}

