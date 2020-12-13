/*
 * NumberGuessing.java
 * 
 *
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secretNum = 1 + r.nextInt(10);
		int guessNum;
		
		System.out.println("I am thinking of a number from 1-10.");
		System.out.print("Your guess: ");
		guessNum = keyboard.nextInt();
		
		System.out.println();
		if (guessNum == secretNum)
			System.out.println("That's right! My secret number WAS " + secretNum + "!");
		else
			System.out.println("Sorry but I was really thinking of  " + secretNum + "!");
	}
}
