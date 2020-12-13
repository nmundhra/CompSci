/*
 * AskingQuestions.java
 * 
 */
import java.util.Scanner;

public class AskingQuestions {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String height;
		int inch;
		int feet;
		double weight;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextInt();

		System.out.print("And how many inches? ");
		inch = keyboard.nextInt();
		
		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();
		
		System.out.println("So you are " + age + " old, " + feet + "'" + inch + "\"" + " tall and " + weight + " heavy.");
	}
}

