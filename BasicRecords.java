/*
 * BasicRecords.java
 * 
 */
import java.util.Scanner;

class Student 
{
	String name;
	double grade;
	double avg;
}

public class BasicRecords {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.print("Enter the first student name: ");
		s1.name = keyboard.next();
		System.out.print("Enter first student's grade: ");
		s1.grade = keyboard.nextDouble();
		System.out.print("Enter first student's average: ");
		s1.avg = keyboard.nextDouble();
		System.out.println();
		
		System.out.print("Enter the second student name: ");
		s2.name = keyboard.next();
		System.out.print("Enter second student's grade: ");
		s2.grade = keyboard.nextDouble();
		System.out.print("Enter second student's average: ");
		s2.avg = keyboard.nextDouble();
		System.out.println();
		
		System.out.print("Enter the third student name: ");
		s3.name = keyboard.next();
		System.out.print("Enter third student's grade: ");
		s3.grade = keyboard.nextDouble();
		System.out.print("Enter third student's average: ");
		s3.avg = keyboard.nextDouble();
		System.out.println();
		
		System.out.format("The names are : %s %s %s%n", s1.name, s2.name, s3.name);
		System.out.format("The grades are : %.1f %.1f %.1f%n", s1.grade, s2.grade, s3.grade);
		System.out.format("The averages are : %.1f %.1f %.1f%n", s1.avg, s2.avg, s3.avg);
		
	}
}

