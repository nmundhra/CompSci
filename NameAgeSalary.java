/*
 * NameAgeSalary.java
 * 
 */
import java.util.Scanner;

public class NameAgeSalary {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		double salary;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println();
		System.out.println("Hi, " + name + "! How old are you?");
		age =  keyboard.nextInt();
		
		System.out.println();
		System.out.println("So you are " + age + ", eh? That's not old at all!!");
		System.out.println("How much do you make, " + name + "?");
		salary = keyboard.nextDouble();
		
		System.out.println();
		System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
		
	}
}

