/*
 * MoreUserInputOfData.java
 * 
 * 
 */
import java.util.Scanner;

public class MoreUserInputOfData {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the following information so I can sell it for profit!");
		System.out.println();
		
		System.out.print("First name: ");
		String fname = keyboard.next();
		
		System.out.print("Last name: ");
		String lname = keyboard.next();
		
		System.out.print("Grade (9-12): ");
		int grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		int id = keyboard.nextInt();
		
		System.out.print("Login: ");
		String login = keyboard.next();
		
		System.out.print("GPA (0.00-4.0): ");
		double gpa = keyboard.nextDouble();
		
		System.out.println();
		System.out.println("Your information:");
		System.out.println("        Login: " + login);
		System.out.println("        ID: " + id);
		System.out.println("        Name: " + lname + ", " + fname);
		System.out.println("        GPA: " + gpa);
		System.out.println("        Grade: " + grade);
	}
}

