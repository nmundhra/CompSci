/*
 * NumberGuessingWithACounter.java
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int count = 0;
		int secretNum = 1 + r.nextInt(10);
		int guessNum;
		
		System.out.println("I am thinking of a number from 1-10.");
		System.out.print("Your guess: ");
		guessNum = keyboard.nextInt();
		count++;
		while (guessNum != secretNum)
		{
			System.out.println("That is incorrect. Guess again");
			System.out.print("Your guess: ");
			guessNum = keyboard.nextInt();
			count++;
		}
			System.out.println("That's right! You are a good guesser.");
			System.out.println("It only tooks you " + count + " tries.");
	}
}
