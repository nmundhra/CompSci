/*
 * Nim.java
 * 
 * Nim is a strategy game between two players.

Start by placing counters (coins or toothpicks or something) into 3 piles.
Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
Player #2 picks a pile, then removes one or more counters from that pile.
Player #1 plays again. (It's okay to choose a different pile this time.)
Whichever player is forced to take the last counter is the LOSER.
Write a program that allows two human players to play Nim against each other. The program should detect when the last counter has been taken and declare a winner.

At first, don't worry about detecting cheating. That is one of the bonus options.
* https://en.wikipedia.org/wiki/Nim
 * 
 */
import java.util.Scanner;

public class Nim {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int pilea = 3, pileb = 4, pilec = 5;
		int num;
		boolean winner = false;
		String pile;
		String player, player1, player2, winPlayer, loosePlayer;
		int turn = 1, currentTurn = 1;
		
		System.out.print("Player 1, enter your name: ");
		player1 = keyboard.next();
		System.out.print("Player 2, enter your name: ");
		player2 = keyboard.next();
		
		System.out.println("\nA: " + pilea + "	" + "B: " + pileb + "	" + "C: " + pilec);
		
		do 
		{
			currentTurn = turn;
			if ( turn == 1 )
			{
				player = player1;
				turn = 2;
			}
			else 
			{
				player = player2;
				turn = 1;
			}
			System.out.println();
			System.out.print(player + ", Choose a pile: ");
			pile = keyboard.next();
			//to avoid player to select a pile which already has cards < = 0
			while ((pile.equals("A") && pilea <=  0) || (pile.equals("B") && pileb <=  0) || (pile.equals("C") && pilec <=  0)) 
			{
				System.out.print("Nice Try, " + player + ". That pile is empty. Choose a pile: ");
				pile = keyboard.next();
			}
			
			System.out.print("How many to remove from pile " + pile + ": ");
			num = keyboard.nextInt();
			
			while ( num <= 0 )
			{
				System.out.print("You must choose atleast 1. How many? ");
				num = keyboard.nextInt();				
			}

			//to avoid player to select a pile which has less cards then selected
			while ((pile.equals("A") && pilea < num) || (pile.equals("B") && pileb < num ) || (pile.equals("C") && pilec < num ) ) 
			{
				System.out.print("Pile " + pile + " doesn't have that many. Try again: ");
				num = keyboard.nextInt();
			}
						
			if (pile.equals("A") && pilea > 0 ) 
			{
				pilea -= num;
			}
			else if (pile.equals("B") )
			{
				pileb -= num;
			}
			else if (pile.equals("C") )
			{
				pilec -= num;
			}
			else
			{
				System.out.println("\nWrong choice, select again");
				turn = currentTurn;
			}
		
			System.out.println("\nA: " + pilea + "	" + "B: " + pileb + "	" + "C: " + pilec);
			
			if ( (pilea == 1 && pileb == 0 && pilec == 0) || (pilea == 0 && pileb == 1 && pilec == 0) || 
				(pilea == 0 && pileb == 0 && pilec == 1) )
				{
					winner = true;
				}
			
		} while ( ( pilea > 0 || pileb > 0 || pilec > 0 ) && (!(winner)) );
		
		if ( turn == 1 )
		{
			player = player1;
			winPlayer = player1;
			loosePlayer = player2;
		}
		else 
		{
			player = player2;
			winPlayer = player1;
			loosePlayer = player2;
		}
		
		System.out.println();		
		
		if (winner)
		{
			System.out.println(loosePlayer + ",you must take the last remaining counter, so ");
			System.out.println("you loose. " + winPlayer + " wins!");
		}
		else 
		{
			System.out.println(player + ", there are no counters left, so you WIN!!");		
		}
	}
}

