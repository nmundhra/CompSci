/*
 * Dice.java
 * 
 * Write a program that simulates a dice roll by picking a random number from 1-6 and then picking a second random number from 1-6. 
 * Add the two values together, and display the total.
 */
import java.util.Random;

public class Dice {
	
	public static void main (String[] args) {
		Random r = new Random();
		
		int roll_1, roll_2;
		
		roll_1 = 1 + r.nextInt(6);
		roll_2 = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!!");
		System.out.println();
		System.out.println("Roll #1: " + roll_1);
		System.out.println("Roll #2: " + roll_2);
		
		System.out.println("The total is " + (roll_1 + roll_2) + "!");
	}
}

