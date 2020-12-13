/*
 * BabyNim.java
 * 
 * Write a program that starts with three "piles" of 3 counters each. 
 * Let the player choose piles and remove counters until all the piles are empty.
 * Start by placing counters (coins or toothpicks or something) into 3 piles.
 * The player picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
 * The player picks a new pile, then removes one or more counters from that pile. (It's okay to pick the same pile as before.)
 * Once all piles are empty, the game stops.
 * 
 * You do not need to check for errors like a wrong pile name, or if someone tries to take more counters from the pile than the pile has.
 * 
 */
import java.util.Scanner;

public class BabyNim {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int pilea = 3, pileb = 3, pilec = 3;
		int num;
		String pile;
		System.out.println("A: " + pilea + "	" + "B: " + pileb + "	" + "C: " + pilec);
		
		do 
		{
			System.out.print("\nChoose a pile: ");
			pile = keyboard.next();
			System.out.print("How many to remove from pile " + pile + ": ");
			num = keyboard.nextInt();
			
			if (pile.equals("A"))
				pilea -= num;
			else if (pile.equals("B") )
				pileb -= num;
			else if (pile.equals("C") )
				pilec -= num;
			else
				System.out.println("\nWrong choice, select again");
		
			System.out.println("\nA: " + pilea + "	" + "B: " + pileb + "	" + "C: " + pilec);
			
		} while (pilea > 0 || pileb > 0 || pilec > 0 );
		
		System.out.println("\n\n All piles are empty. Good job");		
	}
}

