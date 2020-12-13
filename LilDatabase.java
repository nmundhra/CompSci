/*
 * LilDatabase.java
 * 
 * Make a record to store information about a student, which should handle a name, a grade classification, and an average.
 * Create an array of type Student with three slots. Read in values for the three students and print them out again.
 * You may not use a loop. 
 * 
 */
import java.util.Scanner;

class Student 
{
	String name;
	int grade;
	double avg;
	
}


public class LilDatabase {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Student[] s = new Student[3];
		
		for (int i=0;i<s.length;i++)
		{
			s[i] = new Student();
			System.out.print("Enter student " + (i+1) + "'s name: ");
			s[i].name = keyboard.next();
			System.out.print("Enter student " + (i+1) + "'s grade: ");
			s[i].grade = keyboard.nextInt();
			System.out.print("Enter student " + (i+1) + "'s average: ");
			s[i].avg = keyboard.nextDouble();
			System.out.println();
		}
		
		System.out.format("The names are : %s %s %s%n", s[0].name, s[1].name, s[2].name);
		System.out.format("The grades are : %d %d %d%n", s[0].grade, s[1].grade, s[2].grade);
		System.out.format("The averages are : %.1f %.1f %.1f%n", s[0].avg, s[1].avg, s[2].avg);
	}
}

