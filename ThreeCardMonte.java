/*
 * ThreeCardMonte.java
 * 
 * This is the original "ball and cups" game where you try to find out which cup has the ball under it. 
 * You may play with three cups and a ball, three cards (two jacks and an ace), or three doors and a car. 
 * Basically, randomly select a cup to hide the "ball". Let the player guess which cup hides the ball. 
 * The player wins if they guess correctly.
 */
import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int cup = 1 + r.nextInt(3);
		int guessNum;
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash");
		System.out.println("He glances at you out of the corner of his eyes and starts shuffling");
		System.out.println("He lays down three cards");
		System.out.println();
		System.out.println("Which one is the ace?");
		System.out.println();
		System.out.println("##  ##  ##");
		System.out.println("##  ##  ##");
		System.out.println("1   2   3 ");
		System.out.println();
		System.out.print("> ");
		guessNum = keyboard.nextInt();
		System.out.println();
		
		if (guessNum == cup)
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings");
		else
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + cup + ".");
		
		if (cup == 1 ) 
		{
			System.out.println("AA  ##  ##");
			System.out.println("AA  ##  ##");
			System.out.println("1   2   3 ");
		}
		if (cup == 2 ) 
		{
			System.out.println("##  AA  ##");
			System.out.println("##  AA  ##");
			System.out.println("1   2   3 ");
		}
		if (cup == 3 ) 
		{
			System.out.println("##  ##  AA");
			System.out.println("##  ##  AA");
			System.out.println("1   2   3 ");
		}
	}
}

