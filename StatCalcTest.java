/*
 * StatCalcTest.java
 * 
 */
import java.util.Scanner;

public class StatCalcTest {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StatCalc calc = new StatCalc();
		
		double num;
		do
		{
			System.out.print("Enter number for calculation, Enter 0 to exit: ");
			num = keyboard.nextDouble();
			
			calc.enter(num);
			
		}while (num != 0);
		
		System.out.format("Maximum number entered is %f%n ", calc.getMax());
		System.out.format("Minimum number entered is %f%n ", calc.getMin());
		System.out.format("Mean of the numbers is %f%n", calc.getMean());
		System.out.format("Standard Deviation of the numbers is %f%n", calc.getStandardDeviation());
		
	}
}

