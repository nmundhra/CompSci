/*
 * GenderGame.java
 * If the person is female and 20 or over, ask if she is married. 
 * If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. 
 * If the female is under 20, display her first and last name.
 * If the person is male and 20 or over, display "Mr." in front of his name. Otherwise, display his first and last name.
 * Note that asking a person if they are married should only be done if they are female and 20 or older, 
 * which means you will have a single if and else nested inside one of your if statements.
 * 
 */
import java.util.Scanner;

public class GenderGame {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String fname, lname, gender;
		int age;
		String isMarried;
		String prefix;
		
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next();
		System.out.print("First Name: ");
		fname = keyboard.next();
		System.out.print("Last Name: ");
		lname = keyboard.next();
		System.out.print("Age: ");
		age = keyboard.nextInt();
		System.out.println();
		
		if (gender.equals("F") && age >= 20 )
		{
			System.out.print("Are you married, " + fname + " (y or n): ");
			isMarried = keyboard.next();
			System.out.println();
			if (isMarried.equals("y"))
				System.out.println("Then I should call you Mrs. " + lname + ".");
			else
				System.out.println("Then I should call you Ms. " + lname + ".");
		}
		else if (gender.equals("M") && age >= 20 )
		{
			System.out.println("Then I should call you Mr. " + lname);
		}
		else if (gender.equals("M") || gender.equals("F"))
		{
			System.out.println("Then I should call you " + fname + " " + lname + ".");
		}
	}
}

