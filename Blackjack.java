/*
 * BabyBlackjack.java
 * 
 * Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. Make it as cool as you can.

The simplified blackjack rules are as follows:

Don't worry about suits or face cards; "cards" will have values from 2-11, and all values are equally likely (that is, unlike a real blackjack game, there's no greater chance of drawing a card with value 10).
Draw two cards for the player and display them.
Draw two cards for the "dealer" and display one of them, keeping the other one hidden.
Allow the player to "hit" as many times as he would like.
If the player "busts" (gets a total over 21), the dealer automatically wins.
Allow the dealer to hit as many times as he would like. Dealer should probably hit on sixteen or lower.
If the dealer busts, the player automatically wins.
Assuming no one has busted, the player with the highest total wins. Dealer wins all ties.
 */
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int sum1, sum2, num1, num2, num3, num4;
		String opt;
		boolean p1_bust = false, p2_bust = false;
		
		//drew 2 numbers for yourself and take the sum
		System.out.println("Welcome to the world of Blackjack!\n");
		num1 = 2 + r.nextInt(10);
		num2 = 2 + r.nextInt(10);
		sum1 = num1 + num2;
		
		//drew two numbers for the dealer, keep the second number & sum hidden
		System.out.println("You drew " + num1 + " and " + (sum1 - num1) + ".");
		System.out.println("Your total is " + sum1 + ".\n");
		
		num3 = 2 + r.nextInt(10);
		num4 = 2 + r.nextInt(10);
		sum2 = num3 + num4;
		
		System.out.println("The dealer has " + num2 + " showing, and a hidden card.");
		System.out.println("Dealer's total is hidden, too.\n");
		
		//keep on withdrawing until you enter "stay" or get bust (sum > 21)
		do 
		{
			System.out.print("\nWould you like to \"hit\" or \"stay\" ? ");
			opt = keyboard.next();
			if (opt.equals("hit"))
				{
					num1 = 2 + r.nextInt(11);
					System.out.println("You drew a " + num1 );
					sum1 = sum1 + num1;
					System.out.println("Your total is " + sum1);
					if (sum1 > 21 )
					{
						p1_bust = true;
					}
				}
		} while (!opt.equals("stay") && !p1_bust);
			
		if ( p1_bust )
		{
			System.out.println("You LOST!");
		}
		//once you stayed, its the dealer's turn to hit. it will keep on hitting until he get busted or have a sum > 16
		else 
		{
			System.out.println("\nOkay, dealer's turn.");
			System.out.println("His hidden card was a " + num4 );
			System.out.println("His total was " + sum2);
			
			do
			{
				System.out.println("\nDealer choose to hit");
				num3 = 2 + r.nextInt(11);
				sum2 = sum2 + num3;
				System.out.println("He drews a " + num3 );
				System.out.println("His total is " + sum2 );
				
				//dealer will get busted if sum is greater than 21
				if (sum2 > 21 )
				{
					p2_bust = true;
				}
			}while (sum2 <= 16 && !p2_bust);
			
			if (sum2 <= 21 )
				System.out.println("\nDealer Stays");
		}
		
		//check's to see who is the winner. First check if dealer is busted, and declare yourself winner. 
		//if not busted than compare the sums and declare the winner / looser.
		if (p2_bust )
		{
			System.out.println("You WIN!");
		}
		else 
		{
			System.out.println("\nDealer total is " + sum2 );
			System.out.println("Your total is " + sum1 );
		
			if (sum1 > sum2)
			{
				System.out.println("You WIN!");
			}
			else
			{
				System.out.println("You LOST!");
			}
		}
	}
}

