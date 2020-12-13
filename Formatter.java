/*
 * Formatter.java
 * 
 * Use different formatter types. %d, %f, %s
 * Check the java.util.Formatter class for more options
 */
import java.io.Console;
import java.util.Scanner;
import java.util.Calendar;

public class Formatter {
	
	public static void main (String[] args) {
		
		Console con = System.console();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = keyboard.nextInt();
		
		System.out.print("Enter your name: ");
		String name = con.readLine();
		
		
		System.out.print("Enter your GPA: ");
		double gpa = keyboard.nextDouble();
		
		System.out.format("Hi %s, your rollnumber is %+10d and your gpa is %f%n%n", name, num, gpa);
		
		Calendar c = Calendar.getInstance();
		System.out.format("%tB%n ", c);
		System.out.format("%tB, %te %tY%n",c,c,c);
		
	}
}

