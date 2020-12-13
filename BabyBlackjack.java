/*
 * BabyBlackjack.java
 * 
 * Write a program that allows a human user to play a single hand of "blackjack" against a dealer.

Pick two values from 1-10 for the player. These are the player's "cards".
Pick two more values from 1-10 for the dealer.
Whoever has the highest total is the winner.
There is no betting, no busting, and no hitting. Save that for real blackjack.
 */
import java.util.Random;

public class BabyBlackjack {
	
	public static void main (String[] args) {
		Random r = new Random();
		int num1, num2, num3, num4;
		
		System.out.println("Baby Blackjack!\n");
		num1 = 1 + r.nextInt(10);
		num2 = 1 + r.nextInt(10);
		
		System.out.println("You drew " + num1 + " and " + num2 + ".");
		System.out.println("Your total is " + (num1 + num2) + ".\n");
		
		num3 = 1 + r.nextInt(10);
		num4 = 1 + r.nextInt(10);
		
		System.out.println("The dealer has " + num3 + " and " + num4 + ".");
		System.out.println("Dealer's total is " + (num3 + num4) + ".\n");
		
		
		if ( (num1 + num2) > (num3 + num4) )
			System.out.println("You WIN!");
		else
			System.out.println("You LOST!");
		
	}
}

