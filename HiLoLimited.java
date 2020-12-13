/*
 * HiLoLimited.java
 * 
 * Write a program that picks a random number from 1-100. 
 * The user keeps guessing as long as their guess is wrong, and they've guessed less than 7 times. 
 * If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low." 
 * When they get it right, the game stops. Or, if they hit seven guesses, the game stops even if they never got it right.
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int MAX_TRIES = 7;
		int guessNum, tries = 0;
		int secretNum = 1 + r.nextInt(100);
		int i = 1;
		
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses");
		System.out.print("First guess: ");
		guessNum = keyboard.nextInt();
		tries++;
		i++;
		
		while (guessNum != secretNum && tries < MAX_TRIES )
		{
			if (guessNum > secretNum)
				System.out.println("Sorry, that guess is too high");
			else 
				System.out.println("Sorry, you are too low");
				
			System.out.print("Guess # " + i + ": ");
			guessNum = keyboard.nextInt();
			tries++;
			i++;
		}
		
		if (guessNum == secretNum )
			System.out.println("You guessed it! What are the odds!?");
		if (tries > MAX_TRIES )
			System.out.println("Sorry, you didn't guess it in " + tries + " tries. You lose.");
			
		
		
		
	}
}

