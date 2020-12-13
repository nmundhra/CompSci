/*
 * KeepGuessing.java
 * 
 * Modify your previous number-guessing game so that they can guess until they get it right. 
 * That means it will keep looping as long as the guess is different from the secret number. Use a while loop
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secretNum = 1 + r.nextInt(10);
		int guessNum;
		
		System.out.println("I am thinking of a number from 1-10.");
		System.out.print("Your guess: ");
		guessNum = keyboard.nextInt();
		
		while (guessNum != secretNum )
		{
			System.out.println("That's incorrect. Guess again. " + secretNum);
			System.out.print("Your guess: ");
			guessNum = keyboard.nextInt();
		}
		System.out.println("That's right, you are a good guesser");
	}
}
