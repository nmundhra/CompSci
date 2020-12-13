/*
 * OneShotHiLo.java
 * 
 * Write a program that picks a random number from 1-100. Give the user a chance to guess it. 
 * If they get it right, tell them so. If their guess is higher than the number, say "Too high." 
 * If their guess is lower than the number, say "Too low." Then quit. (They don't get any more guesses for now.)
 */
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
	
	public static void main (String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int num = 1 + r.nextInt(100);
		int guessNum;
		
		System.out.println("I am thinking of a number between 1-100. Try to guess it");
		System.out.print("> ");
		guessNum = keyboard.nextInt();
		System.out.println();
		
		if (guessNum > num )
			System.out.println("Sorry, you are too high. I was thinking of " + num + ".");
		else if (guessNum < num )
			System.out.println("Sorry, you are too low. I was thinking of " + num + ".");
		else
			System.out.println("You guess it! What are the odds?!?");
	}
}

