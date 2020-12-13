/*
 * WorstGuessing.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 */
import java.util.Scanner;

public class WorstGuessing {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int secretNum = 4;
		int guessNum;
		
		System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!");
		System.out.println();
		System.out.print("I'M THINKING OF A NBR FROM 1-10. TRY 2 GESS! ");
		guessNum = keyboard.nextInt();
		
		System.out.println();
		if (guessNum == secretNum)
			System.out.println("LOL! U GOT IT! I CANT BELIEVE YOU GUESSED IT WAS " + secretNum + "!");
		else
			System.out.println("W00T! U SUX0R!!! I PWN 000!!!IT WAS " + secretNum + "!");
	}
}

